package collection;

import java.util.TreeSet;

public class Studentdemo {
public static void main(String[] args) {
	Student rathish = new Student(1001,"rathish");
	Student akash = new Student(1002,"akash");
	Student shashank = new Student(1003,"shashank");
	Student vvii = new Student(1004,"vvii");
	
	TreeSet<Student> studentset = new TreeSet<Student>();
	studentset.add(rathish);
	studentset.add(akash);
	studentset.add(shashank);
	studentset.add(vvii);
	for(Student s:studentset) {
		System.out.println(s.id+" "+s.name);
	}
}
}
