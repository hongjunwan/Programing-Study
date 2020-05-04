package test_package;

import java.io.*;

class CheckB{
	void run() {
		BufferedReader bReader = null;
		String input = null;
		try {
			bReader = new BufferedReader(new FileReader("C:\\Users\\dhks2\\eclipse-workspace\\TestProject\\srcbin\\out.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			input = bReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(input);
	}
}

class CheckC{
	void run() {
		CheckB b = new CheckB();
		b.run();
	}
}

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		CheckC c = new CheckC();
		c.run();
	}
}
