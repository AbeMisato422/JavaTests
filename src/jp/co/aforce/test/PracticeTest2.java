package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {

		int x= 10;
		int y = 28;
		double z = 3.14;


	//練習問題１

		System.out.println((x * y));
		System.out.println(x * y);

	//練習問題２
		System.out.println((y / x));
		System.out.println((y % x));

	//練習問題３
		double result = y * z;//わかりやすい変数名
		System.out.println(result);

	//練習問題４
		System.out.println(++result);

	//練習問題５
		int age = 23;
		Random rand = new Random();
	    int randomNumber = rand.nextInt(101);

	    if(age>randomNumber) {
	    	System.out.println("私の方が年上です");
	    	//System.out.println("randomNumber="+randomNumber);
	    }else if(age<randomNumber) {
	    	System.out.println("私の方が年下です");
	    	//System.out.println("randomNumber="+randomNumber);
	    }else if(age == randomNumber) {
	    	System.out.println("私と同い年です");
	    	//System.out.println("randomNumber="+randomNumber);

		}
	    //外にまとめる
	    System.out.println("randomNumber="+randomNumber);
	}
}