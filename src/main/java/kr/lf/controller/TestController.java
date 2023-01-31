package kr.lf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Test_infoDTO;

@CrossOrigin
@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private Test_infoDTO test_infoDTO;
	
	@RequestMapping(value = "/test")
	@PostMapping
	public void testInsert(@RequestBody Test_infoDTO dto) {
		
	}
}
