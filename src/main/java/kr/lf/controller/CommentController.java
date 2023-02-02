package kr.lf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.lf.entity.Comment_infoDTO;
import kr.lf.entity.Tfidf_infoDTO;
import kr.lf.entity.User_infoDTO;
import kr.lf.mapper.Comment_infoMapper;
import kr.lf.mapper.Guide_infoMapper;

@CrossOrigin
@RestController
@RequestMapping(value = "/comment")
public class CommentController {

	@Autowired
	private Comment_infoMapper comment_infomapper;
	
	
	@PostMapping(value="/")
	public void comment(@RequestBody Comment_infoDTO comment) {
		System.out.println("ddddd");
		System.out.println(comment);
		int a = comment_infomapper.comment(comment);
		if(a>0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
	}
//	@RequestMapping(value = "/myPage")
//	@GetMapping
//	public List<Comment_infoDTO> myPage(){
//		System.out.println("쓋");
//		Comment_infoDTO dto = new Comment_infoDTO();
//		List<Comment_infoDTO> list = comment_infomapper.mypage();
//		return list;
//	}
	@RequestMapping(value = "/showComment")
	@GetMapping
	public List<Comment_infoDTO> showComment(@RequestParam("test_seq") int test_seq){
		System.out.println("showComment()");
		//Comment_infoDTO dto = new Comment_infoDTO();
		List<Comment_infoDTO> list = comment_infomapper.showComment(test_seq);
		System.out.println(list);
		System.out.println("sho15115ent()");
		return list;
	}
//	@RequestMapping(value = "/deleteComment")
//	@GetMapping
//	public List<Comment_infoDTO> deleteComment(){
//		System.out.println("쓋");
//		Comment_infoDTO dto = new Comment_infoDTO();
//		List<Comment_infoDTO> list = comment_infomapper.deleteComment();
//		return list;
//	}
}
