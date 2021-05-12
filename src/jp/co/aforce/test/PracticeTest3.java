package jp.co.aforce.test;

import java.util.HashMap;

public class PracticeTest3 {
	public static void main(String[] args) {

//練習問題１
		String[] num1 = {"1","田中太郎","男性","27"};

//練習問題２
		System.out.println(num1[1]);

//練習問題４
		//ArrayList<int>num = new ArrayList<>();
		//num.add

//練習問題５
		HashMap<String, Integer> tests = new HashMap<>();
		tests.put("国語", 90);
		tests.put("数学", 80);
		tests.put("英語", 65);

		for(HashMap.Entry<String,Integer>entry:tests.entrySet()) {
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}

//練習問題６
		//任意のキーを要素に紐づけることができるから。
	}
}
