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
	String insertUser(@RequestBody User_infoDTO user) {
		System.out.println("ddddd");
		System.out.println(user);
		int a = user_infoMapper.join(user);
		if(a>0) {
			System.out.println("성공");
			return "su";
		}else {
			System.out.println("실패");
			return "";
		}
		 
	
	}
	@PostMapping("/{user_id}&{user_pw}")
	public String login(@PathVariable("user_id") String user_id,@PathVariable("user_pw") String user_pw, HttpServletRequest request) {
		System.out.println("들어옴");
		System.out.println(user_pw);
		System.out.println(user_id);
		
		User_infoDTO dto = new User_infoDTO(user_id, user_pw);
	
		User_infoDTO info = user_infoMapper.login(dto);
		System.out.println("usermapper");
		if(info != null) {
			System.out.println("성공");
			HttpSession session = request.getSession();
			session.setAttribute("info",info);
			return user_id;
		}else {
			System.out.println("실패");
			return "/login";
		}
		}
		@RequestMapping(value = "/users")
		@PostMapping()
		void updatemember(@RequestBody User_infoDTO user) {
			System.out.println("ddddd");
			System.out.println(user);
			int a = user_infoMapper.updatemember(user);
			if (a > 0) {
				System.out.println("성공");
			} else {
				System.out.println("실패");
	}
}
}