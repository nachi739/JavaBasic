package java_basic.no02.obj_field;

public class User {
	/*
	 * Mainクラスからの依頼を受け取りthis.Userに
	 * IDを発行する。
	 * 下記のフィールドの初期値・メソッドを得て
	 * Mainクラスにthis.User(ID)を返す。
	 */
//	String name;
//	int amount;
//	String rank;

	/**
	 * Userの入力用メソッド
	 * @param inputName Inputする名前情報
	 * @param inputAmount Inputする売上情報
	 * Mainクラスから受け取った引数をパラメータIDとして
	 * 代入される。
	 * 代入されたIDをname,amountに代入して
	 * Mainクラスに戻る。
	 */
//	void input(String inputName, int inputAmount) {
//		 name = inputName;
//		 amount = inputAmount;
//	}
	
	private String name;
	private int amount;
	private String rank;
	
	//引数ありコンストラクタ
	public User(String inputName, int inputAmount) {
		this.name = inputName;
		
		if (this.chkAmount(inputAmount)) {
			this.amount = inputAmount;
		} else {
			this.amount = 0;
		}
	}
	
	//0以下の値を受け付けないための条件分岐
	private Boolean chkAmount(int chkAmount) {
		if (chkAmount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	

	/**
	 * Userオブジェクト(this.User(ID))に格納されている
	 * amountの中の値を元に処理を行う。
	 * 条件分岐のtureの結果の処理を実行し
	 * User.this(ID)のrankフィールドに文字列を代入し
	 * rankフィールドにIDを付与する。
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
	 * Userオブジェクトに格納された
	 * name,amount,rankのIDの値を
	 * 文字列と結合しコンソールに出力する。
	 */

	void output() {
		System.out.println("名前:" + name);
		System.out.println("売上:" + amount);
		System.out.println("顧客ランク:" + rank);
	}
}
