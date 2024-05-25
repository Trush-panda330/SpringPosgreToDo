package com.example.webapp.entity;

import java.time.LocalDateTime; // インポートを追加

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*「ToDo」クラスは、schema.sqlで記述した「todos」テーブルの列に対応するフィールドを持った「Entity」クラス
 * →「ToDo」テーブルの1行に対応するクラス
 * 今回のアプリではO/Rマッパー「MyBatis」を使用する。
 * MyBatisは結果データをJavaオブジェクトにマッピングする際に、そのオブジェクトのデフォルトコンストラクタを使用する。
 * したがって、結果データを格納するためのJavaオブジェクト(Entity)は、デフォルトコンストラクタを持つ必要がある。
 * 
 * 「＠Data」をクラスに付与することで、クラスに対して、ゲッターやセッター等のメソッドを自動生成する。
 * 「@NoArgsConstructor」はクラスに付与すると、デフォルトコンストラクタを自動生成する。
 * 「@AllArgsConstructor」はクラスに付与すると、
 * 　クラスの全てのフィールドを引数として持つコンストラクタを自動生成する。*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	// することID
	private Integer id;
	
	//すること
	private String todo;
	
	//すること詳細
	private String detail;
	
	//作成日時
	private LocalDateTime createdAt;
	
	//更新日時
	private LocalDateTime updatedAt;
}
