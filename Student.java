package collection;

public class Student implements Comparable{
int id;
String name;

public Student(int id,String name) {
	this.id = id;
	this.name = name;
}
public int compareTo(Object o) {
	Student student  = (Student)o;
	int sid1 = this.id;
	int sid2 = student.id;
	if(sid1<sid2){
		return -1;
	}
	else if(sid1>sid2) {
		return 1;
	}
	else {
		return 0;
	}
	}
}


