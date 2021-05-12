package jp.co.aforce.test;

public class MinMax {

//練習問題２
	int a;
	int b;
	int c;

	int getMaxValue(){
		if(a>b && a>c) {
			return a;
		}else if(b>a && b>c) {
			return b;
		}else {
			return c;
		}
	}

	int getMinValue(){
		if(a<b && a<c) {
			return a;
		}else if(b<a && b<c) {
			return b;
		}else {
			return c;
		}
	}

}
