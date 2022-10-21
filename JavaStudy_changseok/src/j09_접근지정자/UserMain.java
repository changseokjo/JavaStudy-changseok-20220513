package j09_접근지정자;

import j09_접근지정자.a.Student;
import j09_접근지정자.b.Teacher;

public class UserMain {

	public static void main(String[] args) {
		Student student = new Student();
		Teacher teacher = new Teacher();

		student.setName("조창석");
		System.out.println(student.getName());
		
		teacher.setName("조창석");
		teacher.setAddress("부산");
		teacher.setPhone("010-1234-5678");
		teacher.showInfo();
	}

}
