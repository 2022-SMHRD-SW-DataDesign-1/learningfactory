package kr.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Tfidf_infoDTO;
import kr.lf.mapper.Test_infoMapper;
import kr.lf.mapper.Tfidf_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/tfidf")
public class TfidfController {

	@Autowired
	private Tfidf_infoMapper tfidf_infoMapper;
	
	
	
	@GetMapping("/review")
	public List<Tfidf_infoDTO> review(){
		System.out.println("리뷰데이터");
		Tfidf_infoDTO dto = new Tfidf_infoDTO();
		List<Tfidf_infoDTO> list = tfidf_infoMapper.review();
		
		
		return list;
	}
	

	}
	

