package test_package;

import java.io.*;

class ThrowB{
	void run() throws IOException, FileNotFoundException {
		BufferedReader bReader = null;
		String input = null;
		bReader = new BufferedReader(new FileReader("C:\\Users\\dhks2\\eclipse-workspace\\TestProject\\srcbin\\out.txt"));
	    input = bReader.readLine();
		System.out.println(input);
	}
}

class ThrowC{
	void run() throws FileNotFoundException, IOException{
		ThrowB b = new ThrowB();
			b.run();
	}
}

public class ThrowExceptionDemo {
	public static void main(String[] args) {
		ThrowC c = new ThrowC();
		try {
			c.run();
		} catch (FileNotFoundException e) {
			System.out.println("out.txt 파일은 설정 파일 입니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
