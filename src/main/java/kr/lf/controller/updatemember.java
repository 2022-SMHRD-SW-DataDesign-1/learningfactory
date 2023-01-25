package kr.lf.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.User_infoDTO;
import kr.lf.mapper.User_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/users")
public class updatemember {


				@Autowired
		private User_infoMapper user_infoMapper;
		
		
		@PostMapping("/{user_id}")
		void updatemember(@PathVariable("user_id") String  user_id,@RequestBody User_infoDTO user) {
			System.out.println("ddddd");
			System.out.println(user);
			int a = user_infoMapper.updatemember(user);
			if(a>0) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			 
		
		}}

		
	


