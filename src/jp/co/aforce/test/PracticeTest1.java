package jp.co.aforce.test;

public class PracticeTest1 {

	private static final double TAX = 0.1;//解説聞いて直した

	public static void main(String[] args) {
		//練習問題１

				System.out.println(TAX);

		//練習問題２
				int x = 480;
				int price =(int) ((int) x *(1+TAX));//キャスト変換、Mathクラスもある
				System.out.println("この商品の値段は"+price+"円です");
				System.out.println("この商品の値段は"+Math.round(x *(1+TAX))+"円です");
		//練習問題３
				String name = "阿部美里";
				System.out.println(name);

	}

}
