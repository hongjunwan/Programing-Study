package test_package;

import java.util.Scanner;

public class ScannerDemo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			System.out.println(sc.nextInt() * 1000);
			if(sc.nextInt() == 5) {
				System.out.println("종료되었습니다.");
				break;
			}
		}
		sc.close();
	}
}
