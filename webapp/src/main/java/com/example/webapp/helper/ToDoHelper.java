package com.example.webapp.helper;

import com.example.webapp.entity.ToDo;
import com.example.webapp.form.ToDoForm;

/*〇Helperの作成
コントローラーは主に2つの役割がある。
➀画面遷移の制御
リクエストに基づいて適切な画面に遷移し、処理結果に対応するViewを返却する
→ルーティング（URLマッピングと遷移先の返却）
➁ドメイン層のサービス呼び出し
リクエストに応じた業務処理を実行する

上記2つ以外の処理が必要な場合は、別のクラスに切り出し、そこに処理を委譲することで
コントローラの肥大化を防ぐ
*/

// ToDo:ヘルパー
public class ToDoHelper {
    
    // ToDoFormからToDoへの変換
    public static ToDo convertToDo(ToDoForm form) {
        ToDo todo = new ToDo();
        
        // ToDoFormのIDをToDoエンティティに設定
        todo.setId(form.getId());
        
        // ToDoのタイトルを設定
        todo.setTodo(form.getTodo());
        
        // ToDoの詳細を設定
        todo.setDetail(form.getDetail());
        
        return todo;
    }
    
    // ToDoからToDoFormへの変換
    public static ToDoForm convertToDoForm(ToDo todo) {
        ToDoForm form = new ToDoForm();
        
        // ToDoのIDをToDoFormに設定
        form.setId(todo.getId());
        
        // ToDoのタイトルを設定
        form.setTodo(todo.getTodo());
        
        // ToDoの詳細を設定
        form.setDetail(todo.getDetail());
        
        // 更新画面設定
        form.setIsNew(false);
        
        return form;
    }

}
