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

 public class Test_infoDTO {
	 private int test_seq;
	 private String test_title;
	 private String test_photo;
	 private int test_price;
	 private String test_cuesheet;
	 private String test_video;
	 private String test_video_realname;
	 private Timestamp reg_dt;
	 private String user_id;
	 private int category_seq;
	 private String test_content;
	
}
