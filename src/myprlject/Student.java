package myprlject;

public class Student {
	float english;
	float math;
	String name;
	
	
	public Student(int english,int math,String name) {
	this.english=english;
	this.math=math;
	this.name=name;
	}
	public float average() {
		return (english+math)/2;
	}
	public void print() {
		System.out.println(name + "/t" + english + "/t" + math + "/t" +  average());
	}
}
