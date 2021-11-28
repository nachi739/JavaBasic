package java_basic.no5.obj_feld;

public class Cat implements Animal {
	
	/*
	 * ジャンプする
	 */
	public void jump() {
		//猫は脚力が強いため倍飛べる
		System.out.println("60cm跳んだ!!");
	}
	
	/*
	 *泣く
	 * 猫特有の泣き方をオーバーライドして
	 * 定義する
	 */
	public void cry() {
		System.out.println("　　　　　^　^");
		System.out.println("にゃーあ(*´∀｀*)");
	}
}
