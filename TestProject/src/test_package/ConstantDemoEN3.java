package test_package;

enum Fruit3{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	Fruit3(String color){
		System.out.println("Call Constructor1" + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

enum Company3{
	GOOGLE, APPLE, ORACLE;
}

public class ConstantDemoEN3 {
	public static void main(String[] args) {
		Fruit3 type = Fruit3.APPLE;
		switch(type) {
			case APPLE:
				System.out.println(11 + Fruit3.APPLE.getColor());
				break;
			case PEACH:
				System.out.println(22 + Fruit3.PEACH.getColor());
				break;
			case BANANA:
				System.out.println(33 + Fruit3.BANANA.getColor());
				break;
		}
	}
}
