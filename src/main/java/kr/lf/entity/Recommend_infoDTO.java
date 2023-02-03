package kr.lf.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
public class Recommend_infoDTO {
	private int reco_seq;
	private int test_seq;
	private String user_id;
	private String reco_dt;
}
