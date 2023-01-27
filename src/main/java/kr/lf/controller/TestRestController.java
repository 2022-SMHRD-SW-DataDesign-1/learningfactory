package kr.lf.controller;

<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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

	@RequestMapping(value="AxiosFileTest.do", method=RequestMethod.POST)
	public  Map<String,Object> AxiosFileTest (HttpServletRequest request, @RequestParam(value="file", required=false) MultipartFile[] files) throws SQLException  {
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
		return resultMap;
	}
}



