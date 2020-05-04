package test_package;

public class StringTest {
	public static String numbering(int init, int limit) {
		int i = init;
		
		String output =" ";
		while(i<limit) {
			output += i;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = numbering(1,5);
		System.out.println(result);
	}
}
