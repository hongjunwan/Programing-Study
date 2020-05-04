package test_package;

class CalculatorFinal{
	static final double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

class CalculatorA{
	final void b() {System.out.println("fianl ½ÇÇà");}
}

class CalculatorB extends CalculatorA{
	public void b(int a) {}
}


public class CalculatorDemoFinal {
	public static void main(String[] args) {
		CalculatorFinal c = new CalculatorFinal();
		CalculatorA c1 = new CalculatorA();
		c1.b();
		System.out.println(c.PI);
		System.out.println(CalculatorFinal.PI);
	}
}
