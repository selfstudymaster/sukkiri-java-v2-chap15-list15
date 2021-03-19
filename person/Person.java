package person;

public class Person {

	public int age;

	public void setAge(int age) {
		if (age < 0) { // ここで引数の値をチェック
			throw new IllegalArgumentException("年齢正の数を指定すべきです。指定値=" + age);
		}
		this.age = age; // 値に問題がなければフィールドに値をセット
	}
}
