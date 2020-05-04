package test_package;

class Calculator5{
	int left, right;
	
	public Calculator5(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


public class CalculatorDemo5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator5 c1 = new Calculator5(10,20);
		c1.sum();
		c1.avg();
	}

}
