package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import kr.lf.entity.Tfidf_infoDTO;

public interface Tfidf_infoMapper {

	
	
	
	
	@Select("select * from tfidf_info where category_seq = #{category_seq} and tfidf_value > 24  and tfidf_posinega = 'posi'")
	public List<Tfidf_infoDTO> PosibarChart(int category_seq);
	
	
	@Select("select * from tfidf_info where category_seq = #{category_seq} and tfidf_value > 22  and tfidf_posinega = 'nega'")
	public List<Tfidf_infoDTO> NegabarChart(int category_seq);
}
