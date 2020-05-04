package test_package;

enum Fruit2{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	public String color;
	Fruit2(String color){
		System.out.println("call Constructor" + this);
		this.color = color;
	}
}

enum Company2{
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemoEN2 {
	public static void main(String[] args) {
		Fruit2 type = Fruit2.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(22+Fruit2.APPLE.color);
				break;
			case PEACH:
				System.out.println(33+Fruit2.PEACH.color);
				break;
			case BANANA:
				System.out.println(44+Fruit2.BANANA.color);
				break;
		}
	}
}
