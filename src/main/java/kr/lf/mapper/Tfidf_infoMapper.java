package kr.lf.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;


import kr.lf.entity.Tfidf_infoDTO;

public interface Tfidf_infoMapper {

	
	
	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'posi' and category_seq = 21 and tfidf_value > 10)")
	public List<Tfidf_infoDTO> bed();

	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'posi' and category_seq = 22 and tfidf_value > 10)")
	public List<Tfidf_infoDTO> blanket();
	
	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'posi' and category_seq = 23 and tfidf_value > 10)")
	public List<Tfidf_infoDTO> chair();
	
	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'nega'   and category_seq = 21 and tfidf_value < 3)")
	public List<Tfidf_infoDTO> negabed();

	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'nega'   and category_seq = 22 and tfidf_value < 3)")
	public List<Tfidf_infoDTO> negablanket();
	
	@Select("select tfidf_keyword, tfidf_value from tfidf_info where (tfidf_posinega = 'nega'   and category_seq = 23 and tfidf_value < 3)")
	public List<Tfidf_infoDTO> negachair();
}

