package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import kr.lf.entity.Tfidf_infoDTO;

public interface Tfidf_infoMapper {

	
	
	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_design = 'Y' and tfidf_posi = 'Y' and category_seq = 21 and tfidf_value > 10)")
	public List<Tfidf_infoDTO> design();

}

