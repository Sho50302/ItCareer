package com.example.demo.login.domain.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class SignupForm {
	
	// ユーザー名
	@NotBlank(message = "{require_check}", groups = ValidGroupNotBlank.class)
	private String userName;
	
	// メールアドレス
	@NotBlank(message = "{require_check}", groups = ValidGroupNotBlank.class)
	@Email(message = "{email_check}", groups = ValidGroupForm.class)
	private String email;
	
	// パスワード
	@NotBlank(message = "{require_check}", groups = ValidGroupNotBlank.class)
	@Length(min = 6, max = 100, message = "{length_check}", groups = ValidGroupForm.class)
	@Pattern(regexp = "^[a-zA-Z0-9]+$", message = "{pattern_check}", groups = ValidGroupPattern.class)
	private String password;
}
