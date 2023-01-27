package kr.lf.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Test_infoDTO;





public interface Guide_infoMapper {
	
	@Select("select cuesheet from guide_info where category_seq =1")
	public List<Guide_infoDTO> cuesheet();

}