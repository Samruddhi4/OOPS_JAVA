package Abstraction;

public class Employee extends Emp{

	

	@Override
	public void cat() {
		System.out.println("cat in child class");
	}
	public static void main(String[] args) {
		Emp e = new Employee();
		e.cat();
		e.dog();
	}
}
