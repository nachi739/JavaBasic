package java_basic.no4.obj_feld;

public class Human extends Animal {
	
	/*
	 * 人間は考えることが出来るため
	 * 人間特有のメソッドを追加
	 */
	public void imagination() {
		System.out.println("想像を働かせた!!!!");
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
