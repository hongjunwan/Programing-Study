package test_package;

//Ŭ������ ���� �� ���� info�� ������ Ÿ���� Ȯ������ �ʰ� �ν��Ͻ��� ������ �� ������ Ÿ���� �����ϴ� ����� ���׸��̴�.

class Person<T>{
	public T info;
}

public class GenericDemo {
	public static void main(String[] args) {
		Person<String> p1 = new Person<String>(); // �ν��Ͻ� ���� �� ������ Ÿ�� ����
		Person<StringBuilder> p2 = new Person<StringBuilder>();
	}
}
