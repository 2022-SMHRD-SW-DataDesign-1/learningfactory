package kr.lf.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Select;

import kr.lf.entity.Guide_infoDTO;
import kr.lf.entity.Test_infoDTO;





public interface Guide_infoMapper {
	

	@Select("select * from guide_info where cuesheet is not null")
	public List<Guide_infoDTO> cuesheet();
	
	@Select("select stt,score from guide_info where score > 22")
	public List<Guide_infoDTO> stt();
}