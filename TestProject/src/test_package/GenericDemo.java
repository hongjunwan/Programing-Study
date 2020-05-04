package test_package;

//Ŭ������ ���� �� ���� info�� ������ Ÿ���� Ȯ������ �ʰ� �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ����� ���׸��̴�.

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person<T>{
	public T info;
	Person(T info){
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		EmployeeInfo e1 = p1.info;
		System.out.println(e1.rank);
	}
}
