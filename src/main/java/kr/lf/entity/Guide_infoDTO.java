package kr.lf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor
public class Guide_infoDTO {
	private int guide_seq;
	private String design;
	private int price;
	private String used;
	private int category_seq;
}
