package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.lf.entity.User_infoDTO;

public interface User_infoMapper {
	
	//회원 가입
	@Insert("insert into user_info(user_id,user_pw,user_hp,user_email) values(#{user_id},#{user_pw},#{user_hp},#{user_email})")
	public int join(User_infoDTO dto);
	
	@Select("select * from user_info where user_id = #{user_id} and user_pw = #{user_pw}")
	public User_infoDTO login(User_infoDTO dto);
	@Select("select * from user_info")
	public List<User_infoDTO> showlist();
	@Update("update user_info set user_pw = #{user_pw}, user_hp = #{user_hp}, user_email = #{user_email} where user_id = #{user_id}")
	public int updatemember(User_infoDTO dto);
}
