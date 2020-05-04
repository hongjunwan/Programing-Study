package test_package;

public class WhileTest {
	public static void main(String[] args) {
		int i = 0;
		
		while(i<10) {
			System.out.println("start" + i);
			if(i==3) {
				break;
			}
			i++;
		}
		System.out.println(i);
		for(int x = 0; x<10; x++) {
			System.out.println("end" + x);
		}
		String[] classGroup = {"a","b","c","d","e"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[2]);
		
		String[] classGroup2 = new String[4];
		classGroup2[0] = "a";
		System.out.println(classGroup2.length);
	}
}
