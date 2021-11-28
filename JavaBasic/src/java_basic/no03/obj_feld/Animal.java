package java_basic.no03.obj_feld;

public class Animal {
	/*
	 * ジャンプする
	 */
	public void jump() {
		//一般的に動物が飛べる飛距離
		System.out.println("30cm跳んだ！！");
	}
	
	/*
	 * 泣く
	 */
	public void cry() {
		//泣き方は動物によって違うため
		//オーバーライドをすること
		System.out.println("うぉぉぉぉん(TT)");
	}
}
