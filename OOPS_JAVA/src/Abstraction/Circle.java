package Abstraction;

public  class Circle extends Shape {

	double radius;
	
	Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
	
		return "area of circle" +super.color + "  circle  "+area() ;
	}

	 public static void main (String [] args) {
		Circle circle = new Circle("red", 4);
		System.out.println(circle.toString());
		System.out.println(circle.toString());
	}
}
