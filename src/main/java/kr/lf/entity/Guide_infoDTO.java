package kr.lf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Guide_infoDTO {
	private int guide_seq;
	private String cuesheet;
	private String design;
	private int price;
	private String used;
	private int category_seq;
}
