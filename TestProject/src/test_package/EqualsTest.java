package test_package;

public class EqualsTest {
	public static void main(String[] args) {
		String a = "Hi";
		String b = new String("Hi");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
