package java_basic.no01.obj_field;

public class Main {

	public static void main(String[] args) {
		//メインでUserの箱を用意
		/*
		 * 処理をUserクラスに依頼
		 * Userクラスから初期変数を設定してもらい格納する
		 */
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		//必要情報を入力
		/*
		 * inputメソッドを呼び出し引数に
		 * 値を代入する処理を依頼する
		 * 代入された値の情報を保持する
		 */
		user1.input("たーくん", 5200);
		user2.input("まこたん", 0);
		user3.input("超富裕層Aさん", 2500000);
		//ランク判定チェック
		/*
		 * 保持された情報を元にrankJudgeメソッドに
		 * 処理を依頼する
		 * 処理された結果の変数の値を保持する
		 */
		user1.rankJudge();
		user2.rankJudge();
		user3.rankJudge();
		//上記の情報の結果を出力
		user1.output();
		user2.output();
		user3.output();
	}
}
