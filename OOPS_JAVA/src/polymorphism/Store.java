package polymorphism;

public class Store extends Shop{
	@Override
	public void book()
	{
		System.out.println("Book from child");
	}
	
	public static void main(String[] args) {
		Shop s = new Store();
		s.book();  //overried
		Shop s1 = new Shop();
		s1.book(); 
		Store s2 = new Store();
		s2.book();
	}

}
