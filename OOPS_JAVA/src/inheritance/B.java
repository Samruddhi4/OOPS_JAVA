package inheritance;

	public class B extends A{
		public void student1() 
		{
			System.out.println("student");
		}
	public static void main(String[] args) {
		B b = new B();
		b.student1();
        A a = new A();
        a.teacher1();
        a.teacher2();
        a.teacher3();
        A aa = new B();
        aa.teacher1();
        aa.teacher3();
        A bv = new B();
        bv.teacher2();
	}

}
