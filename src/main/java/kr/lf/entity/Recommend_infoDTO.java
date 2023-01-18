package kr.lf.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor
public class Recommend_infoDTO {
	private int reco_seq;
	private int test_seq;
	private String user_id;
	private Date reco_dt;
}
