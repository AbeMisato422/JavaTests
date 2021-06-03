package jp.co.aforce.test;

public class Employee {


	//練習問題３
		private int num;
		private String name;
		private String sex;
		private int age;


		//コンストラクタ定義 別にコレクションではない
		Employee(int number, String name, String gender, int age){
			this.num = number;
			this.name = name;
			this.sex = gender;
			this.age = age;
		}
		//getter。setterなくてもできる

		public int getNum() {
			return this.num;//thisなくてもいけるみたいだけど
		}

		public String getName() {
			return this.name;
		}

		public String getSex() {
			return this.sex;
		}

		public int getAge() {
			return this.age;
		}

		//今回はコンストラクタ使ってるから使わないけど比較用setter
		public void setNum(int number) {
			this.num = number;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setSex(String gender) {
			this.sex = gender;
		}

		public void setAge(int age) {
			this.age = age;
		}


}
