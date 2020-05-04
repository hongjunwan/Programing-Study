package test_package;

class Calculator7{
	int left, right;
	int third = 0;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right, int third) { //메소드 오버로딩
		this.left = left;
		this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left + this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left + this.right +this.third) / 3);
	}
}

public class CalculatorDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator7 c = new Calculator7();
		c.setOprands(1, 2);
		c.sum();
		c.avg();
		
		c.setOprands(1, 2, 3);
		c.sum();
		c.avg();
	}

}
