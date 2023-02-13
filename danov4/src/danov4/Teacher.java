package danov4;

public class Teacher extends Person{
	private Subject s1;
	public Teacher(String name, String surname, String family, String egn, int age, Subject s1) {
		super(name, surname, family, egn, age);
		this.s1 = s1;
	}
	
	public Subject getS1() {
		return s1;
	}
	
	public void setS1(Subject s1) {
		this.s1 = s1;
	}
	
}
