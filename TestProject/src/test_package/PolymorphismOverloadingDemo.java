package test_package;

class O{
	public void a(int param) {
		System.out.println("숫자 출력");
		System.out.println(param);
	}
	
	public void a(String param) {
		System.out.println("문자 출력");
		System.out.println(param);
	}
}

public class PolymorphismOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O o = new O();
		o.a(10);
		o.a("one");
	}

}
