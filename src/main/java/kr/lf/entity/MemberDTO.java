package kr.lf.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@Setter
@RequiredArgsConstructor
public class MemberDTO {

	private String id;
	private String pw;
	private String hp;
	private String email;
}
