package test_package;

//클래스를 정의 할 때는 info의 데이터 타입을 확정하지 않고 인스턴스를 생성할 때 데이터 타입을 지정하는 기능이 제네릭이다.

class Person<T>{
	public T info;
}

public class GenericDemo {
	public static void main(String[] args) {
		Person<String> p1 = new Person<String>(); // 인스턴스 생성 시 데이터 타입 지정
		Person<StringBuilder> p2 = new Person<StringBuilder>();
	}
}
