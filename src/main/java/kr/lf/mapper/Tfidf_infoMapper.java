package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import kr.lf.entity.Tfidf_infoDTO;

public interface Tfidf_infoMapper {

	
	
	@Select("select * from tfidf_info")
	public List<Tfidf_infoDTO> review();

}

