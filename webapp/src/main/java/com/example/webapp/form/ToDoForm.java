package com.example.webapp.form;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//すること
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoForm {
	//することID
	private Integer id;
	//すること
	@NotBlank(message = "ToDoは必須です。")
	private String todo;
	//すること詳細
private String detail;
	/*新規判定
	 * trueの時は新規登録処理をする
	 * falseの場合は更新処理をする*/
	private Boolean isNew;
	
	}