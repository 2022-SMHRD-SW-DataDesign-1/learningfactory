package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Comment_infoDTO;

public interface Comment_infoMapper {
	//댓글
	
	  @Insert("insert into comment_info values(cmt_seq.nextval,test_seq, cmt_content, cmt_dt, user_id)"
	  ) public int comment(Comment_infoDTO dto);
	  
	  @Select("select * from comment_info where user_id = #{user_id} and test_seq = #{test_seq}"
	  ) public Comment_infoDTO myPage(Comment_infoDTO dto);
	  
	  @Select ("select * from comment_info") 
	  public List<Comment_infoDTO> showComment();
	  
	  @Delete("delete from comment_info where user_id = #{user_id}")
	  public int deleteComment(int cmt_seq);
	 
}
