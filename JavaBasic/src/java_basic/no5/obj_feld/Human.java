package java_basic.no5.obj_feld;

public class Human implements Animal {
	
	/*
	 * 人間は考えることが出来るため
	 * 人間特有のメソッドを追加
	 */
	public void imagination() {
		System.out.println("想像を働かせた!!!!");
	}
	
	/*
	 * ジャンプメソッドを
	 * オーバーライドして定義する
	 */
	public void jump() {
		System.out.println("30cm跳んだ");
	}
	
	/*
	 * 泣く
	 * 人間特有の泣き方をオーバーライドして
	 * 定義する
	 */
	public void cry() {
		//人間の一般的な泣き方
		System.out.println("えーん(/_;)");
	}
}
