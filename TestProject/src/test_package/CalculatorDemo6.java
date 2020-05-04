package test_package;

class Calculator6{
	
	int left, right;
	
	public void setOperands(int left, int right) {
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

class SubstractionableCalculator extends Calculator6{ // ���
	static MultiplicationableCalculator a = new MultiplicationableCalculator(); 
	//system.out.println(); �� ���� �׽�Ʈ 
	//system = Ŭ���� , out = systemŬ������ static ����
	//println() = printstream Ŭ������ �޼ҵ�
	/*class system{
	 * 		static printstream out = new printstream();
	 */
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

class MultiplicationableCalculator extends Calculator6{
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator{
	public void division() {
		System.out.println(this.left / this.right);
	}
	
}

public class CalculatorDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableCalculator.a.multiplication(); // sysout test
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
		
		MultiplicationableCalculator c2 = new MultiplicationableCalculator();
		c2.setOperands(2, 4);
		c2.sum();
		c2.avg();
		c2.multiplication();
		
		DivisionableCalculator c3 = new DivisionableCalculator();
		c3.setOperands(1, 2);
		c3.sum();
		c3.multiplication();
		c3.division();
		
	}
}
