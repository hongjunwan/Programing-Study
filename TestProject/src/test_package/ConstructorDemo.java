package test_package;

class Constructor{
	int left, right;
	
	/*public Constructor() {}*/
	
	public Constructor(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
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

class SubstractionableConstructor extends Constructor{
	public SubstractionableConstructor(int left, int right) {
		super(left, right); // 부모 클래스의 기본생성자 작성을 안해도 되게 함. 부모 클래스의 생성자를 의미
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubstractionableConstructor c1 = new SubstractionableConstructor(10,2);
		c1.sum();
		c1.avg();
		c1.substract();
	}

}
