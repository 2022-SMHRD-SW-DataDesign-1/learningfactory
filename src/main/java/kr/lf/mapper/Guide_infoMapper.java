package kr.lf.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Test_infoDTO;





public interface Guide_infoMapper {
	
	@Select("select cuesheet from guide_info where category_seq=21")
	public List<Guide_infoDTO> cuesheet();
	
	@Select("select design from guide_info where tfidf_value > 1 and tfidf_posi = 'Y' and category_seq=21")
	public List<Guide_infoDTO> design();

}