package example3;

import example1.*;
import example2.*;

public class D {
	public static void main(String[] args) {
		example1.B b = new example1.B(); 
		b.test();
		
		example2.B b2 = new example2.B();
		b2.test2();
	}
}
