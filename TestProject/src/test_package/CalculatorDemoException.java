package test_package;

class CalculatorException{
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void divide() {
		try {
			System.out.println("계산결과는 ");
			System.out.println(this.left / this.right);
			System.out.println("입니다.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("오류가 발생했습니다: " + e.getMessage());
			System.out.println("\n\ne.toString()\n" + e.toString());
			System.out.println("\n\ne.printStackTrace()");
			e.printStackTrace();
		}
	}
}

public class CalculatorDemoException {
	public static void main(String[] args) {
		CalculatorException c1 = new CalculatorException();
		c1.setOprands(10, 0);
		c1.divide();
		
		CalculatorException c2 = new CalculatorException();
		c2.setOprands(10, 5);
		c2.divide();
	}
}
