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
public class Comment_infoDTO {
	private int cmt_seq;
	private int test_seq;
	private String cmt_content;
	private String cmt_dt;
	private String user_id;
}
