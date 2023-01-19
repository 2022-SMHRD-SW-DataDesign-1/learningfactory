package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import kr.lf.entity.User_infoDTO;

public interface User_infoMapper {
	
	//회원 가입
	@Insert("insert into user_info(user_id,user_pw,user_hp,user_email) values(#{user_id},#{user_pw},#{user_hp},#{user_email})")
	public int join(User_infoDTO dto);
	@Select("select * from user_info where user_id =#{user_id} and user_pw = #{user_pw}")
	public int login(@Param("user_id") String user_id,@Param("user_pw") String user_pw);
	@Select("select * from user_info")
	public List<User_infoDTO> showlist();
}
