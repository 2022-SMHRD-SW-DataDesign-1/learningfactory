package kr.lf.entity;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User_infoDTO {
	
	@NonNull
	private String user_id;
	@NonNull
	private String user_pw;
	private String user_hp;
	private String user_email;
	private String user_joindate;
	private String user_type;
}
