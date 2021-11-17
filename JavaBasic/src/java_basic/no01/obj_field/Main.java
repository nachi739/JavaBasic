package java_basic.no01.obj_field;

public class Main {

	public static void main(String[] args) {

		/*
		 * new User();をUserクラスに依頼
		 * Userクラス誕生したUserオブジェクト(ID)を
		 * 参照型変数に代入する。
		 */
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();

		/*
		 * inputメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		user1.input("たーくん", 5200);
		user2.input("まこたん", 0);
		user3.input("超富裕層Aさん", 2500000);

		/*
		 * rankJudgeメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		user1.rankJudge();
		user2.rankJudge();
		user3.rankJudge();

		/*
		 * outputメソッドを実行し
		 * 処理をUserオブジェクトで実行する。
		 */
		user1.output();
		user2.output();
		user3.output();
	}
}
