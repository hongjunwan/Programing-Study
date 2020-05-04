package test_package;

class Calculator0{
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
	
	public int test() {
		return this.left + this.right;
	}
}

class SubstractionableCalculator0 extends Calculator0{
	public void sum() {
		System.out.println("실행 결과는" + (this.left + this.right) + "입니다.");
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
	public int test() {
		return super.test();
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator0 c1 = new SubstractionableCalculator0();
		c1.setOprands(1, 2);
		c1.sum();
		c1.avg();
		c1.substract();
		c1.test();
	}

}
