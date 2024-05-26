package com.example.webapp.service;

import java.util.List;

import com.example.webapp.entity.ToDo;

/*ToDo:サービス
 * */
public interface ToDoService {
	
	//全「すること」を検索します。
	List<ToDo> findAllToDo();
	
	//指定されたIDの「すること」を検索する。
	ToDo findByIdToDo(Integer id);
	
	//「すること」を新規登録する
	void insertToDo(ToDo toDo);
	
	//「すること」を更新する
	void updateToDo(ToDo toDo);
	
	//指定されたID「すること」を削除する
	void deleteToDo(Integer id);
	
	
}
