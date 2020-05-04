package test_package;

class Calculator3{
	static int a = 3;
	
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	
	public static void avg(int left, int right) {
		System.out.println((left + right) / 2);
	}
}

public class CalculatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator3 c = new Calculator3();
		c.sum(20, 30);
		c.a = 2;
		System.out.println(c.a);
		Calculator3.sum(10, 20);
		Calculator3.avg(20, 30);
		System.out.println(Calculator3.a);
	}
}
