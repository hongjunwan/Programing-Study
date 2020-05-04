package test_package;

class Exception1{
	private int[] arr = new int[3];
	Exception1() {
		arr[0]=0;
		arr[1]=10;
		arr[2]=20;
	}
	
	public void z(int first, int second) {
		try {
			System.out.println(arr[first] / arr[second]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("무조건 호출");
		}
	}
}

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception1 ex = new Exception1();
		ex.z(10, 0);
		ex.z(1, 0);
		ex.z(2, 1);
	}

}
