package kr.lf.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.MemberDTO;
import kr.lf.mapper.MemberMapper;
@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class MemberRestController {
	@Autowired
	private MemberMapper memberMapper;
	
	//회원 가입
	@PostMapping
	void insertUser(@RequestBody MemberDTO user) {
		System.out.println(user);
		int a = memberMapper.join(user);
		if(a>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		 
	
	}
	@GetMapping("/{id}")
	public String login(@PathVariable("id") String id,@RequestPart("pw") String pw, Model model) {
		int info = memberMapper.login(id,pw);
		if(info >0) {
			System.out.println("성공");
			model.setAttribute("info",info);
			return "/home";
		}else {
			System.out.println("실패");
			return "/login";
		}
	}
}
