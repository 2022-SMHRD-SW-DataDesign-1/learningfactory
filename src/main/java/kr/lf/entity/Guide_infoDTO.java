package kr.lf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Guide_infoDTO {
	private int guide_seq;
	private String cuesheet;
	private int category_seq;
	
	private int score;
	
	private String stt;
}
