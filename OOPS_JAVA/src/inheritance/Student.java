package inheritance;

public class Student extends Teacher{  //1 class accuired property 7 behavour of another class

	private String sub = "physic";
	private String syllabus = "math & chem";
	
	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getSyllabus() {
		return syllabus;
	}

	public void setSyllabus(String syllabus) {
	}
	public static void main(String[] args) {
		Teacher t1 = new Student();
		Student s1 = new Student();
		System.out.println(s1.getSub());
		System.out.println(t1.getDesignation());
		System.out.println(t1.getRoal());
	}

}
