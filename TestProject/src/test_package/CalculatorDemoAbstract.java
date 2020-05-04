package test_package;

abstract class CalculatorAbstract{
	
	int left, right;
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	int _sum() {
		return this.left + this.right;
	}
	
	public abstract void sum();
	public abstract void avg();
	public void run() {
		sum();
		avg();
	}
	
}

class CalculatorDecoPlus extends CalculatorAbstract{
	public void sum() {
		System.out.println("+ sum :" + (this.left + this.right));
	}
	
	public void avg() {
		System.out.println("+ avg :" + (this.left + this.right)/2);
	}
}

class CalculatorDecoMinus extends CalculatorAbstract{
	public void sum() {
		System.out.println("- sum :" + (this.left + this.right));
	}
	public void avg() {
		System.out.println("- avg :" + (this.left + this.right)/2);
	}
}

public class CalculatorDemoAbstract {
	public static void execute(CalculatorAbstract cal) {
		System.out.println("실행 결과");
		cal.run();
	}
	
	public static void main(String[] args) {
		CalculatorAbstract c1 = new CalculatorDecoPlus();
		c1.setOprands(10, 20);
		c1.run();
		
		CalculatorAbstract c2 = new CalculatorDecoMinus();
		c2.setOprands(10, 20);
		c2.run();
	}
}
