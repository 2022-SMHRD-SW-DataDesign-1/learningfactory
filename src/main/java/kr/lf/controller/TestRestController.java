package kr.lf.controller;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kr.lf.entity.Test_infoDTO;
import kr.lf.entity.User_infoDTO;
import kr.lf.mapper.Test_infoMapper;
import oracle.jdbc.proxy.annotation.Post;

@CrossOrigin
@RestController
@RequestMapping(value = "/test")
public class TestRestController {
	
	@Autowired
	private Test_infoMapper test_infoMapper;
//	@ResponseBody
//	@RequestMapping(value="AxiosTest.do", method=RequestMethod.POST)
//	public  Map<String,Object> AxiosTest (HttpServletRequest request,@RequestBody Map<String, Object> paramMap) throws SQLException  {
//		System.out.println("paramMap ==>"+ paramMap);
//		Map<String,Object> resultMap = new HashMap<String,Object>();
//		resultMap.put("java return", "im java");
//		return resultMap;
//	}

	
	
	@GetMapping
	public List<Test_infoDTO> loadTest() {
		System.out.println("test소환ㅃ@!");
		Test_infoDTO dto = new Test_infoDTO();
		List<Test_infoDTO> list = test_infoMapper.loadTest();
		return list;
	}
	

//	@GetMapping
//	public int deleteTest(int num) {
//		System.out.println("테스트 삭제 입니다.");
//		int row = test_infoMapper.deleteTest(num);
//		return row;
//	}
	@PostMapping("/Mypage")
	public List<Test_infoDTO> loadMyTest(@RequestBody String user_id){
		// 여기 값이 user_id + "=" 이 붙어서 나옴. 이유는 잘모르겠음, 누군가 발견한다면 잘 설명 좀 부탁  
		System.out.println(user_id);
		String userID = user_id.split("=")[0];
		List<Test_infoDTO> list = test_infoMapper.loadMyTest(userID);
		
		return list;
	}
	
	

	@RequestMapping(value="/AxiosFileTest.do", method=RequestMethod.POST)
	public  String AxiosFileTest (HttpServletRequest request, @RequestParam(value="file", required=false) MultipartFile[] files) throws SQLException  {
		Map<String,Object> resultMap = new HashMap<String,Object>();
		String FileNames ="";
		System.out.println("paramMap =>"+files[0]);

		String filepath = "C:/eGovFrame-4.0.0/workspace.edu/LF/src/saveFolder/";
		   for (MultipartFile mf : files) {

	            String originFileName = mf.getOriginalFilename(); // 원본 파일 명
	            long fileSize = mf.getSize(); // 파일 사이즈

	            System.out.println("originFileName : " + originFileName);
	            System.out.println("fileSize : " + fileSize);

	            String safeFile =System.currentTimeMillis() + originFileName;

	            FileNames = FileNames+","+safeFile; 
	            try {
	            	File f1 = new File(filepath+safeFile);
	                mf.transferTo(f1);
	            } catch (IllegalStateException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
		Map<String, Object> paramMap = new HashMap<String, Object>();
		FileNames = FileNames.substring(1);
		System.out.println("FileNames =>"+ FileNames);
		resultMap.put("JavaData", paramMap);
		return FileNames;
	}
	

	@GetMapping("/{test_seq}")
	public Test_infoDTO detailTest(@PathVariable("test_seq") int test_seq) {
		System.out.println("spring in");
		Test_infoDTO dto = new Test_infoDTO();
		
		
		dto = test_infoMapper.detailTest(test_seq);
		return dto;
	}
	@Autowired
	private Test_infoMapper test;
	
	@RequestMapping(value = "/test")
	@PostMapping
	public String testInsert(@RequestBody Test_infoDTO dto) {
		System.out.println(dto.getCategory_seq());
		System.out.println(dto.getTest_title());
		int row = test.testInsert(dto);
		if(row >0) {
			System.out.println("성공");
			return "/testlist";
		}else {
			System.out.println("실패");
			return "";
		}
	}
	@RequestMapping(value = "/likeselect")
	@PostMapping
	public void testLike(@RequestBody int test_seq) {
		System.out.println(test_seq);
		// 좋아요 테이블 정보 들어가야합니다~.
		  test.testLike(test_seq);
		
		  int row = test.testLike(test_seq);
		  if (row>0) {
			  System.out.println("통과 기모찡");
		  }else {
			  System.out.println("젠쟝");
		  
		  }
	}
}



