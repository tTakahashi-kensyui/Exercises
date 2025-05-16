package project;

/**
 * 生徒クラス
 */
public class Student {
	private String id;
	private String name;
	private int age;
	private double grade;

	//コンストラクタ
	public Student(String id, String name, int age, double grade) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	// ゲッター・セッター
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getGrade() {
		return grade;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Grade=" + grade + "]";
	}
}
