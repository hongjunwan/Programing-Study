package test_package;

class Student implements Cloneable{
	String name;
	Student(String name){
		this.name = name;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectDemo {
	public static void main(String[] args) {
		Student s1 = new Student("egping");
		try {
			Student s2 = (Student)s1.clone();
			s1.name = "www";
			System.out.println(s1.name);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
