package demo03;

public class Demo003 {

}

abstract class Person {
	private String name;
	private int age;

	public abstract String getContent();
}

class Worker extends Person {
	private float salary;

	public String getContent() {
		return "工人做工！";
	}
}

class Student extends Person {
	private int score;

	public String getContent() {
		return "学生上学！";
	}
}
