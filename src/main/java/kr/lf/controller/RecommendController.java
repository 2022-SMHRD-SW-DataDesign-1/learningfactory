package kr.lf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Recommend_infoDTO;
import kr.lf.mapper.Recommend_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/recommend")
public class RecommendController {

	@Autowired
	private Recommend_infoMapper Recommend_info;
	
	@PostMapping("/add")
	public void RecommendADD(@RequestBody Recommend_infoDTO recommendDTO) {
		System.out.println("좋아요 추가"+recommendDTO);
		
		int a = Recommend_info.recommendAdd(recommendDTO);
		Recommend_info.recommendCount(recommendDTO);
		if(a>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		 
	}
	
	@PostMapping("/del")
	public void recommendDelete(@RequestBody Recommend_infoDTO recommendDTO) {
		System.out.println("좋아요 삭제"+recommendDTO);
		
		int a = Recommend_info.recommendDelete(recommendDTO);
		Recommend_info.recommendCount(recommendDTO);
		if(a>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		 
	}
	@PostMapping("/check")
	public int recommendCheck(@RequestBody Recommend_infoDTO recommendDTO) {
		System.out.println("좋아요 여부 체크");
		int check = Recommend_info.recommendCheck(recommendDTO);
		System.out.println("확인" + check);
		return check;
	}
}
