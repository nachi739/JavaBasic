package java_basic.no02.obj_field;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * new User();をUserクラスに依頼
		 * Userクラス誕生したUserオブジェクト(ID)を
		 * 参照型変数に代入する。
		 */
		//User user1 = new User();
		//User user2 = new User();
		//User user3 = new User();

		/*
		 * inputメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		//user1.input("たーくん", 5200);
		//user2.input("まこたん", 0);
		//user3.input("超富裕層Aさん", 2500000);

		/*
		 * rankJudgeメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		//user1.rankJudge();
		//user2.rankJudge();
		//user3.rankJudge();

		/*
		 * outputメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		//user1.output();
		//user2.output();
		//user3.output();
		
		//引数ありで参照型変数を作成
		User user1 = new User("たーくん", 5200);
		User user2 = new User("まこたん", 0);
		User user3 = new User("超富裕福層", 250000);
		
		//リストを作成
		/*
		 * new ArrayList<E>();をArrayListクラスに依頼
		 * ArrayListオブジェクト(ID)を参照型変数に代入
		 * List<型>変数名
		 */
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		//ランク設定・コンソール出力
		for (User tarUser : userList) {
			tarUser.rankJudge();
			tarUser.output();
		}
	}
}
