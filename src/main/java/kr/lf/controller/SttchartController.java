package kr.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Comment_infoDTO;
import kr.lf.entity.Stt_infoDTO;
import kr.lf.mapper.Stt_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/sttchart")
public class SttchartController {

	@Autowired
	private Stt_infoMapper sttinfomapper;
	
	@PostMapping("/")
	public List<Stt_infoDTO> sttChart(@RequestBody String category_seq){
		System.out.println("sttchart들어옴");
		
		
		
		int categorySeq = Integer.parseInt(category_seq.split("=")[0]);
		System.out.println(categorySeq);
		List<Stt_infoDTO> list = sttinfomapper.sttchart(categorySeq);
		System.out.println(list.size());
		
		
		return list;
	}
}
