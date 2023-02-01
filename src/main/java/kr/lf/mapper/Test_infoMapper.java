package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Test_infoDTO;
public interface Test_infoMapper {
	//모의테스트 저장
	
	@Select("select * from test_info")
	public List<Test_infoDTO> loadTest();
	
	@Delete("delete from test_info where test_seq=#{test_seq}")
	public int deleteTest(int test_seq);
	
	@Select("select * from test_info where test_seq=#{test_seq}")
	public Test_infoDTO detailTest(int test_seq);
	
	@Insert("insert into test_info values(test_seq.nextval,#{test_title},#{test_photo},#{test_price},#{test_cuesheet},#{test_video},#{test_video_realname},sysdate,#{user_id},category_seq.nextval,#{test_content})")
	public int testInsert(Test_infoDTO dto);
	
	@Select("select * from test_info where user_id=#{user_id}")
	public List<Test_infoDTO> loadMyTest(String user_id);
	
}
