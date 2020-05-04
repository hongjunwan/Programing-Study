package test_package;

enum Fruit{
	APPLE, PEACH, BANANA;
	Fruit(){
		System.out.println("Call Constructor" + this);
	}
}

enum Company{
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemoEN {
	public static void main(String[] args) {
		Fruit type = Fruit.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(22);
				break;
			case PEACH:
				System.out.println(33);
				break;
			case BANANA:
				System.out.println(44);
				break;
		}
	}
}
