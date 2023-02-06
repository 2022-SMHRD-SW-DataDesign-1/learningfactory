package kr.lf.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("/{test_seq}")
	public List<Comment_infoDTO> showComment(@PathVariable("test_seq") int test_seq){
		System.out.println("showcomment들어옴");
		List<Comment_infoDTO> list = comment_infomapper.showComment(test_seq);
		System.out.println(list.size());
		System.out.println(list.get(0).getCmt_dt()); 
		
		return list;
	}
//	@RequestMapping(value = "/deleteComment")
	@PostMapping("/deleteComment")
	public void deleteComment(@RequestBody String cmtseq){
		System.out.println("delete쓋");
		int cmt_seq = Integer.parseInt(cmtseq);
		System.out.println("cmt_seq"+cmt_seq);
		int row = comment_infomapper.deleteComment(cmt_seq);
		if(row>0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	
	@PostMapping("/comment")
	public List<Comment_infoDTO> myComment(@RequestBody String user){
		System.out.println("myComment 들어옴");
		String user_id = user.split("=")[0];
		System.out.println("mycommentID"+user_id);
		List<Comment_infoDTO> list = comment_infomapper.myComment(user_id);
		System.out.println(list);
		
		return list;
	}
}
