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

import kr.lf.mapper.Guide_infoMapper;


@CrossOrigin
@RestController
@RequestMapping(value = "/guide")
public class GuideController {

	@Autowired
	private Guide_infoMapper guide_infomapper;
	
	@GetMapping
	public List<Guide_infoDTO> cuesheet(){
		System.out.println("쓋");
		Guide_infoDTO dto = new Guide_infoDTO();
		List<Guide_infoDTO> list = guide_infomapper.cuesheet();
		
		return list;
	}
	@GetMapping
	@RequestMapping(value = "/stt")
	public List<Guide_infoDTO> stt(){
		System.out.println("stt");
		Guide_infoDTO dto = new Guide_infoDTO();
		List<Guide_infoDTO> list = guide_infomapper.stt();
		
		return list;
	}
}

	

