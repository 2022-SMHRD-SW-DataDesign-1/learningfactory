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
public class User_infoDTO {

	private String user_id;
	private String user_pw;
	private String user_hp;
	private String user_email;
	private Date user_joindate;
	private String user_type;
}
