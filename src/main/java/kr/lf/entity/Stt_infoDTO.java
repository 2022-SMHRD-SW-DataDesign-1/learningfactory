package kr.lf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor

public class Stt_infoDTO {
private int stt_seq;
private String stt_keyword;
private String stt_tfidf_value;
private int category_seq;
	
}
