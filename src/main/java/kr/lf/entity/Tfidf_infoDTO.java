package kr.lf.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor

public class Tfidf_infoDTO {
	private int tfidf_seq;
	private String tfidf_keyword;
	private int tfidf_value;
	private String tfidf_category;
	private int category_seq;
	private String tfidf_posinega; 
	
}
