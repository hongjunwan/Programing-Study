package test_package;

enum Fruit4{
	APPLE("red"), PEACH("pink"), BANANA("yellow");
	private String color;
	Fruit4(String color){
		System.out.println("Call" + this);
		this.color = color;
	}
	
	String getColor() {
		return this.color;
	}
}

public class ConstantDemoEN4 {
	public static void main(String[] args) {
		for(Fruit4 f : Fruit4.values()) {
			System.out.println(f+"," + f.getColor());
		}
	}
}
