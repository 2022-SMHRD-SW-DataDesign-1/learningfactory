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
	
	
	@RequestMapping(value = "/bed")
	@GetMapping
	public List<Tfidf_infoDTO> bed(){
		System.out.println("쓋");
		Tfidf_infoDTO dto = new Tfidf_infoDTO();
		List<Tfidf_infoDTO> list = tfidf_infoMapper.bed();
		return list;
	}
	@RequestMapping(value = "/blanket")
	@GetMapping
	public List<Tfidf_infoDTO> blanket(){
		System.out.println("쓋");
		Tfidf_infoDTO dto = new Tfidf_infoDTO();
		List<Tfidf_infoDTO> list = tfidf_infoMapper.blanket();
		
		return list;
	}
		@RequestMapping(value = "/chair")
		@GetMapping
		public List<Tfidf_infoDTO> chair(){
			System.out.println("쓋");
			Tfidf_infoDTO dto = new Tfidf_infoDTO();
			List<Tfidf_infoDTO> list = tfidf_infoMapper.chair();
			
			return list;
		}
		
		@RequestMapping(value = "/negabed")
		@GetMapping
		public List<Tfidf_infoDTO> negabed(){
			System.out.println("쓋");
			Tfidf_infoDTO dto = new Tfidf_infoDTO();
			List<Tfidf_infoDTO> list = tfidf_infoMapper.negabed();
			return list;
		}
		@RequestMapping(value = "/negablanket")
		@GetMapping
		public List<Tfidf_infoDTO> negablanket(){
			System.out.println("쓋");
			Tfidf_infoDTO dto = new Tfidf_infoDTO();
			List<Tfidf_infoDTO> list = tfidf_infoMapper.negablanket();
			
			return list;
		}
			@RequestMapping(value = "/negachair")
			@GetMapping
			public List<Tfidf_infoDTO> negachair(){
				System.out.println("쓋");
				Tfidf_infoDTO dto = new Tfidf_infoDTO();
				List<Tfidf_infoDTO> list = tfidf_infoMapper.negachair();
				
				return list;
			}
	}
	

