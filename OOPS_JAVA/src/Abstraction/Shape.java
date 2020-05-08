package Abstraction;

public abstract class Shape {
	String color;
	//method abstract
	abstract double area();
	public abstract String toString();
	 //constructor
	Shape(String color)
	{
		this.color = color;
	}
	//concreate method
	public void color()
	{
		System.out.println("concreate method ");
	}
	
}
