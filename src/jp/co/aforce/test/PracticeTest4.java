package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {

	public static void main(String[] args) {

//練習問題１
	//文字列を比較するときはequalsを使う方が適切であるので、②が適切だと思う。
		//基本型（数値、文字コード、boolean）（値そのものをスタック領域に保持している）は
		//==,
		//参照型（String、日付、コレクション、クラスなど）は値そのものはヒープ領域にあり、スタック領域に
		//ロッカーの鍵がある==で比較するのはスタック領域。ヒープ領域を比較するequalsを使うのが適切。
		//文字列はequals(←文字), 基本型は==（←数字っぽい）
//練習問題２
		ArrayList<String> animals = new ArrayList<>();

		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("へび");
//練習問題３
		String likeAnimal = "アザラシ";

		if(animals.contains(likeAnimal)) {
			System.out.println(likeAnimal + "はリストに含まれています");

		}else {
			System.out.println(likeAnimal + "はリストに含まれていません");
		}

//練習問題４
		int myBirthMonth = 4;
		//publicHolidayに代入、後でまとめてコンソール出力もあり。
		//なしの月は最後にまとめてbreakなしもあり。書き直してもよい

		switch(myBirthMonth) {
		case 1:
			System.out.println("元日, 成人の日");
			break;
		case 2:
			System.out.println("建国記念日, 天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日, みどりの日, こどもの日");
			break;
		case 6:
			System.out.println("なし");
			break;
		case 7:
			System.out.println("海の日, スポーツの日");
			break;
		case 8:
			System.out.println("山の日");
			break;
		case 9:
			System.out.println("敬老の日, 秋分の日");
			break;
		case 10:
			System.out.println("なし");
			break;
		case 11:
			System.out.println("文化の日, 勤労感謝の日");
			break;
		default:
			System.out.println("なし");
			break;
		}


		//値が1～12の整数で決まりきっているから。
		//if文は上から順に処理するが、switchは該当箇所にジャンプするし、見やすいから。（解説後付け足し）
	}
}
