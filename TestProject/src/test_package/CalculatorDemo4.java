package test_package;

class Calculator4{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left; //class 에서 정의된 left, right 변수
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator4 c1 = new Calculator4();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		c1.setOprands(30, 20);
		c1.sum();
		c1.avg();
		
		/*
		Calculator c2 = new Calculator();
		c2.setOprands(20, 30);
		c2.sum();
		c2.avg();
		*/
	}

}
