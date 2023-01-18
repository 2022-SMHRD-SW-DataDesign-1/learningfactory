package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.lf.entity.MemberDTO;

public interface MemberMapper {
	
	//회원 가입
	@Insert("insert into userinfo values(#{id},#{pw},#{hp},#{email})")
	public int join(MemberDTO dto);
	@Select("select * from userinfo where id =#{id} and pw = #{pw}")
	public int login(String id,String pw);
	@Select("select * from userinfo")
	public List<MemberDTO> showlist();
}
