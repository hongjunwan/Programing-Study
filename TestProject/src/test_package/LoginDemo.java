package test_package;

public class LoginDemo {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		
		if(id.equals("egoing")) {
			if(password.equals("11112")) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}else {
			System.out.println("wrong");
		}
	}
}
