package Interface;

public class StuDetails implements Students {
	String name;
	static int marks;
	int sub;
	double avg;
	int total;
	public StuDetails(String name,int sub,int marks) {
		super();
		this.name = name;
		this.sub = sub;
		this.marks = marks;
	}
//method from interface
	public int sub() {
		System.out.printf("subject count " , +sub);
		return sub;
	}
	//method from interface
	public String nameStud(String name) {
		System.out.println(name + "stu name");
		return nameStud();
	}
public double avg(int marks)
{
	System.out.printf("total sub" +sub);
	int arr[] = {10,20,30,40,50};
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("Total Marks : "+arr[i]);
	     total = total + arr[i];
	     System.out.println("total sum : "+total);
	}

	avg = total/arr.length;
	System.out.println("avarage " +avg);
	
	return marks;
}
	public static void main (String [] args)
	{
		StuDetails sd = new StuDetails("abc", 5, 50);
		System.out.print("Name of student: "+sd.nameStud());
		System.out.println(" Subject : "+sd.sub());
		System.out.println("Average: "+sd.avg(marks));
	}
	public String nameStud() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
