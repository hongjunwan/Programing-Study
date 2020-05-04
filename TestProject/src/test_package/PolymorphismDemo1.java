package test_package;

class AA{
	public String x() {return "A.x";}
}

class BB extends AA{
	public String x() {return "B.x";}
	public String y() {return "y";}
}

class B2 extends AA{
	public String x() {return "B2.x";}
}

public class PolymorphismDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AA obj = new BB();
		AA obj2 = new B2();
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}
