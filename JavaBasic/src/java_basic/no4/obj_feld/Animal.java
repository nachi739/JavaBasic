package java_basic.no4.obj_feld;

public abstract class Animal {
	/*
	 * ジャンプする
	 * 具象メソッド
	 */
	public void jump() {
		//一般的に動物が飛べる飛距離
		System.out.println("30cm跳んだ！！");
	}
	
	/*
	 * 泣く
	 * 泣き方は個々によって変わるため
	 * 抽象メソッド
	 * 継承した際に定義してもらう（オーバーライドして）
	 */
	abstract public void cry();
}
