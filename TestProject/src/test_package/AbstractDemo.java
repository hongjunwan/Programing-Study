package test_package;

abstract class A{
	public abstract int b();
	public void d() {
		System.out.println("world");
	}
}

class B extends A{
	public int b() {return 1;}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		System.out.println(obj.b());
		obj.d();
	}

}
