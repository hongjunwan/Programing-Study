package test_package;

class A3{
	public int id;
	A3(int id){
		this.id = id;
	}
}

public class ReferenceParameterDemo {
	static void _value(int b) {
		b = 2;
	}
	
	public static void runValue() {
		int a = 1;
		_value(a);
		System.out.println("runValue, " + a);
	}
	
	static void _reference1(A3 b) {
		b = new A3(2);
	}
	
	public static void runReference1() {
		A3 a = new A3(1);
		_reference1(a);
		System.out.println("runReference1, " + a.id);
	}
	
	static void _reference2(A3 b) {
		b.id = 2;
	}
	
	public static void runReference2() {
		A3 a = new A3(1);
		_reference2(a);
		System.out.println("runReference2, " + a.id);
	}
	
	public static void main(String[] args) {
		runValue();
		runReference1();
		runReference2();
	}
}
