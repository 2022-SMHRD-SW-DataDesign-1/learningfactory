package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Stt_infoDTO;

public interface Stt_infoMapper {

	
	@Select("select stt_keyword, stt_tfidf_value from stt_info where stt_tfidf_value > 30 and category_seq=#{category_seq}")
	public List<Stt_infoDTO> sttchart(int category_seq);
}
