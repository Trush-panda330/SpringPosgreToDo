package com.example.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.webapp.entity.ToDo;
import com.example.webapp.repository.ToDoMapper;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args)
		.getBean(WebappApplication.class).exe();
	}
	
	/** DI*/
	private final ToDoMapper mapper;
	
	public void exe() {
		//★全件検索
		System.out.println("===全件検索＝＝＝");
		for (ToDo row : mapper.selectAll()) {
			System.out.println(row);
		}
		
		//★1件検索
	  System.out.println("===1検索＝＝＝");
	  System.out.println(mapper.selectById(1));
	  // ★登録
	  // 登録データ作成
	  ToDo todo = new ToDo();
	  todo.setTodo("リポジトリのテスト");
	  todo.setDetail("DBへの登録処理");
	  mapper.insert(todo);
	  System.out.println("===登録確認＝＝＝");
	  System.out.println(mapper.selectById(4));
	  //★更新
	  ToDo target = mapper.selectById(4);
	  target.setTodo("リポジトリのテスト：更新");
	  target.setDetail("DBへの更新処理");
	  mapper.update(target);
	  System.out.println("===更新確認＝＝＝");
	  System.out.println(mapper.selectById(4));
	  
	  //　★削除
	  System.out.println("===削除確認＝＝＝");
	  for(ToDo row: mapper.selectAll()) {
		  System.out.println(row);
	  }
	}
}
