package kr.lf.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Review_infoDTO;
import kr.lf.mapper.Guide_infoMapper;


@CrossOrigin
@RestController
@RequestMapping(value = "/guide")
public class GuideController {

	@Autowired
	private Guide_infoMapper guide_infomapper;
	
	@GetMapping(value="/")
	public List<Guide_infoDTO> cuesheet(){
		System.out.println("쓋");
		Guide_infoDTO dto = new Guide_infoDTO();
		List<Guide_infoDTO> list = guide_infomapper.cuesheet();
		
		return list;
	}

		

	
	@PostMapping(value = "/review")
	public List<Review_infoDTO> review(){
		System.out.println("리뷰함수 통과");
		Review_infoDTO dto = new Review_infoDTO();
		
		List<Review_infoDTO> list= guide_infomapper.review();
		
		
		System.out.println("리뷰 데이터 생성");
		System.out.println(list);
		return list;
	}
}

	

