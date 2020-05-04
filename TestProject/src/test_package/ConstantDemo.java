package test_package;

public class ConstantDemo {
	
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;
	
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_ORACLE = 3;
	
	public static void main(String[] args) {
		int type = FRUIT_APPLE;
		switch(type) {
			case FRUIT_APPLE:
				System.out.println(57);
				break;
			case FRUIT_PEACH:
				System.out.println(34);
				break;
			case FRUIT_BANANA:
				System.out.println(93);
				break;
			
		}
		
	}
}
