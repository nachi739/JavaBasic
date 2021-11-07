package java_basic.no01.obj_field;

public class User {
	//メインから依頼が来た際に変数をセット
	String name;
	int amount;
	String rank;
	
	//Inputメソッド作成
	//引数:名前、売上額
	
	/**
	 * Userの入力用メソッド
	 * @param inputName Inputする名前情報
	 * @param inputAmount Inputする売上情報
	 */
	
	void input(String inputName, int inputAmount) {
		//メインから指定された値を引数で受け取り
		//Userクラスの変数に代入する
		 name = inputName;
		 amount = inputAmount;
	}
	
	/**
	 * User売上額から、顧客ランクの設定を行う
	 * 依頼された処理を実行する
	 * 分岐の結果をrank変数に代入する
	 */
	
	void rankJudge() {
		if (amount >= 1000000) {
			rank = "お得意様";
		} else if (amount >= 100000) {
			rank = "常連様";
		} else if (amount >= 1000) {
			rank = "新規顧客";
		} else {
			rank = "冷やかし客";
		}
	}
	
	/**
	 * User情報を出力
	 */
	
	void output() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + amount);
		System.out.println("顧客ランク:" + rank);
	}
}
