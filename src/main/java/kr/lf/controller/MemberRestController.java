package kr.lf.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import kr.lf.entity.User_infoDTO;
import kr.lf.mapper.User_infoMapper;
@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class MemberRestController {
	@Autowired
	private User_infoMapper user_infoMapper;
	
	//회원 가입
	@PostMapping
	void insertUser(@RequestBody User_infoDTO user) {
		System.out.println(user);
		int a = user_infoMapper.join(user);
		if(a>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
		 
	
	}
	@GetMapping("/{id}")
	public String login(@PathVariable("id") String id,@RequestParam("pw") String pw, HttpServletRequest request) {
		int info = user_infoMapper.login(id,pw);
		if(info >0) {
			System.out.println("성공");
			HttpSession session = request.getSession();
			session.setAttribute("info",id);
			return "/home";
		}else {
			System.out.println("실패");
			return "/login";
		}
	}
}
