package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest5 {

	public static void main(String[] args) {
//練習問題１　変数使って出力を最後にまとめてもよい
		Random rand = new Random();
		int fortune = rand.nextInt(4)+1;

		switch (fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;
		}

//練習問題２
		int total = 0;
		for(int x = 1; x <= 100; x++) {
			if(x%7 == 0) {
				//コンソール出力忘れ
				System.out.println(x);
				total = total + x;
				//↑total + = x;でも同じ

			}
		}
		System.out.println("7の倍数の総合計は" + total);

//練習問題３
		for (int num1 = 1; num1 <= 9; num1++) {
			for (int num2 = 1; num2 <= 9; num2++) {
				System.out.printf("%3d", num1*num2);
			}
			System.out.println();
		}
	}

}
