package kr.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	
	@PostMapping(value = "/barChart")
	public List<Tfidf_infoDTO> Posireview(@RequestBody String category_seq){
		System.out.println(category_seq);
		
		String Category_seq = category_seq.split("=")[0];
		int categorySeq = Integer.parseInt(Category_seq);
		Tfidf_infoDTO dto = new Tfidf_infoDTO();
		
		List<Tfidf_infoDTO> list = tfidf_infoMapper.PosibarChart(categorySeq);
		
		
		return list;
	}
	
	@PostMapping(value = "/NegabarChart")
	public List<Tfidf_infoDTO> Negareview(@RequestBody String category_seq){
		System.out.println(category_seq);
		
		String Category_seq = category_seq.split("=")[0];
		int categorySeq = Integer.parseInt(Category_seq);
		Tfidf_infoDTO dto = new Tfidf_infoDTO();
		
		List<Tfidf_infoDTO> list = tfidf_infoMapper.NegabarChart(categorySeq);
		
		
		return list;
	}
	

	}
	

