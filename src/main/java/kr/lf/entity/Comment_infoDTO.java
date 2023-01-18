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
public class Comment_infoDTO {
	private int cmt_seq;
	private int test_seq;
	private String cmt_content;
	private Date cmt_dt;
	private String user_id;
}
