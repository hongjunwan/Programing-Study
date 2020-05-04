package test_package;

class Calculator8{
	
	int[] oprands;
	
	public void setOprands(int[] oprands) {
		this.oprands = oprands;
	}
	
	public void sum() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total);
	}
	
	public void avg() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total / this.oprands.length);
	}
}

public class CalculatorDemo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator8 c = new Calculator8();
		c.setOprands(new int[] {10,20});
		c.sum();
		c.avg();
		c.setOprands(new int[] {20,40});
		c.sum();
		c.avg();
	}

}
