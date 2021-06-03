package jp.co.aforce.test;

import java.util.ArrayList;
import java.util.HashMap;

public class PracticeTest3 {
	public static void main(String[] args) {

//練習問題１
		String[] num1 = {"1","田中太郎","男性","27"};//String num1[]でも書ける

//練習問題２
		System.out.println(num1[1]);

//練習問題４
		//順番持たないset(コレクション)でも可
		//コンストラクタ
		//まずコレクション型変数の宣言とインスタンスの代入。
		//変数名は慣例で複数形(普通employees)
		ArrayList<Employee> syainns = new ArrayList<>();

		//続いてコンストラクタの利用
		Employee tanaka = new Employee(1, "田中太郎", "男性", 27);
		Employee sato = new Employee(2, "佐藤花子", "女性", 22);
		Employee suzuki = new Employee(3,"鈴木次郎", "男性", 31);


		//リストに代入
		syainns.add(tanaka);
		syainns.add(sato);
		syainns.add(suzuki);

		//拡張for 左の変数syainnとかだとだめだった
		for(Employee employee : syainns) {

			System.out.println(
				"番号は" + employee.getNum()
				+"、名前は" + employee.getName()
				+"、年齢は" + employee.getAge() + "歳です"
				);
		}

		//以下私の間違い
//		ArrayList<Integer> nums = new ArrayList<>();
//		nums.add(1);
//		nums.add(2);
//		nums.add(3);
//
//		ArrayList<String> names = new ArrayList<>();
//		names.add("田中太郎");
//		names.add("佐藤花子");
//		names.add("鈴木次郎");
//
//		ArrayList<String> sexes = new ArrayList<>() ;
//		sexes.add("男性");
//		sexes.add("女性");
//		sexes.add("男性");
//
//		ArrayList<Integer> ages = new ArrayList<>();
//		ages.add(27);
//		ages.add(22);
//		ages.add(31);

//		for (int num : nums) {
//			System.out.println("番号は"+num);
//
//			for (String name : names) {
//				System.out.println("、名前は"+ name);
//
//				for (int age : ages) {
//					System.out.println("、年齢は"+ age + "歳です");
//				}
//			}
//		}



//練習問題５
		HashMap<String, Integer> tests = new HashMap<>();
		tests.put("国語", 90);
		tests.put("数学", 80);
		tests.put("英語", 65);

		for(HashMap.Entry<String,Integer>entry:tests.entrySet()) {//intは×。ラッパークラス(p.137)。entryのとこ変数名変えられるのでtestでもいい。
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		}

//練習問題６
		//任意のキーを要素に紐づけることができるから。
		//また、順番が今回は関係ないから。(解説後直した)
	}
}
