package kr.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Test_infoDTO;
import kr.lf.entity.User_infoDTO;
import kr.lf.mapper.Test_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/test")
public class TestRestController {
	
	@Autowired
	private Test_infoMapper test_infoMapper;
	
	
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
	
	@GetMapping("/{test_seq}")
	public Test_infoDTO detailTest(@PathVariable("test_seq") int test_seq) {
		System.out.println("spring in");
		Test_infoDTO dto = new Test_infoDTO();
		
		
		dto = test_infoMapper.detailTest(test_seq);
		return dto;
	}
}
