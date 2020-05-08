package Encapsulation;

public class Emp {  

	private String name;
	private int age;
	public String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public static void main(String [] args)
	{
		Emp e = new Emp();
		e.setName("aboli");
		e.setAge(20);
		e.setAddress("abc pqr ");
		System.out.println("Name " +e.getName());
		System.out.println("age  " +e.getAge());
		System.out.println("Address "+e.getAddress());
	}
	
}
