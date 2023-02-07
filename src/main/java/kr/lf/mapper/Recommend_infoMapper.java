package kr.lf.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.lf.entity.Recommend_infoDTO;

public interface Recommend_infoMapper {
	
	@Insert("insert into recommend_info(test_seq, user_id, reco_dt) values (#{test_seq}, #{user_id}, sysdate)")
	public int recommendAdd(Recommend_infoDTO recommendDTO); 
	
	@Delete("delete from recommend_info where test_seq=#{test_seq} and user_id = #{user_id}")
	public int recommendDelete (Recommend_infoDTO recommendDTO); 
	
	@Select("select count(*) from recommend_info where user_id = #{user_id} and test_seq = #{test_seq}")
	public int recommendCheck(Recommend_infoDTO recommendDTO);
	
	@Update("update test_info set test_like_count = (select count(*) from recommend_info where test_seq=#{test_seq}) where test_seq=#{test_seq}")
	public void recommendCount(Recommend_infoDTO recommendDTO);
}
