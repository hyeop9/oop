class Person {
	String name;
	String id;

	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person {
	String grade;
	String department;

	public Student(String name) {
		super(name);
	}
}

public class UpcastingEx {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("이재문");
		p = s;

		System.out.println(s.name);
		System.out.println(p.name);

		/* 오류 발생 */
//		p.grade = "A";
//		p, department = "Com"

		s.grade = "A";
		s.department = "Com";

		System.out.println(s.grade);
		System.out.println(s.department);

		Student s2 = (Student) p;

		System.out.println(s2.grade);
		System.out.println(s2.department);
	}

}
