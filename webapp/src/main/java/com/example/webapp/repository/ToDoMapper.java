package com.example.webapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.webapp.entity.ToDo;

/** 「O/R」マッパーにMyBatisを使用するため＠Mapperをインターフェースに付与することにより
 * 　Javaのオブジェクトとデータベースのテーブル間のマッピングを定義している*/
@Mapper
public interface ToDoMapper {
	//全てのすることを取得する
	List<ToDo> selectAll();
	
	//指定されたIDに対応する「すること」を取得する
	ToDo selectById(@Param("id") Integer id); 
	/**@Param()はメソッドの引数に名前を付けてマッパーファイル内のSQLのプレースホルダと関連付けられる
	　	MyBatisではメソッドの引数が1つの場合、「＠Param」は必須ではないが、明示的な名前を付与することで
	　可読性を高めたい場合や将来的にメソッドが複数の引数を持つ可能性がある場合には、＠Paramをつける*/
	//「すること」を登録する
	void insert(ToDo toDo);
	
	//「すること」を更新する
	void update(ToDo toDo);
	
	//指定されたIDの「すること」を削除する
	void delete(@Param("id") Integer id);
}
