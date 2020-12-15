package myprlject;

public class Scoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1=new Student(69,72,"Jack");
		float ave=stu1.average();
		System.out.println(ave);

	if (ave<60) {
		System.out.println("Bye");
		
	}else {
		System.out.println("Congradulation");
	}
}	
	
}