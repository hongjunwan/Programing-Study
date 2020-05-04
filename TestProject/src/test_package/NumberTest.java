package test_package;

public class NumberTest {
	public static void main(String[] args) {
		forTwo();
	}	
	public static void forTwo() {
		int i = 0;
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < 5; b++) {
				System.out.println(a + b);
			}
		}
	}
}
