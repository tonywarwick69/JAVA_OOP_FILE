package tk1;

public class Student extends Person {
	public Student(String name) {
		super(name);
	}
	@Override
	public String toString() {
		return "Student [getName()=" + getName() + "]";
	}
	
	
}
