package exam01;

public class Student extends People {

	private int studentNo;

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	Student() {
		
	}

	Student(String name, int age, int studentNo) {
		super("홍길동", 40);
		this.studentNo = studentNo;
	}
	
	public void toPrint() {
		System.out.println("name: " + getName() + " | age: " + getAge() + " | studentNo: " + studentNo);
	}
}
