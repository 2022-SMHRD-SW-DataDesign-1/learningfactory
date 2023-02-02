package kr.lf.entity;

import java.sql.Timestamp;
import java.util.Date;

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
public class Comment_infoDTO {
	private int cmt_seq;
	private int test_seq;
	private String cmt_content;
	private Timestamp cmt_dt;
	private String user_id;
}
