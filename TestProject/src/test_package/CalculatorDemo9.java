package test_package;

class Calculator9{
	
	private int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int sum() {
		return this.left + this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("++++" + sum() + "++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("----" + sum() + "----");
	}
}

public class CalculatorDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator9 c = new Calculator9();
		c.setOprands(10, 20);
		c.sumDecoPlus();
		c.sumDecoMinus();
	}

}
