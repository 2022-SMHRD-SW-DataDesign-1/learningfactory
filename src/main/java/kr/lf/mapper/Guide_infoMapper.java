package kr.lf.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Review_infoDTO;
import kr.lf.entity.Test_infoDTO;





public interface Guide_infoMapper {
	

	@Select("select * from guide_info order by category_seq asc")
	public List<Guide_infoDTO> cuesheet();
	

	@Select("select stt_keyword, stt_tfidf_value from stt_info where stt_tfidf_value >= 10 and rownum < 10 order by stt_tfidf_value desc")
	public List<Review_infoDTO> review();


}