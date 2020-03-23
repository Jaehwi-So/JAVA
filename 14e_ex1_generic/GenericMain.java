package ex1_generic;

public class GenericMain {
	public static void main(String[] args) {
		//<>안에는 클래스 타입이 들어간다.
		GenericTest<String> v1 = new GenericTest<String>();	//GenericTest<String> v1 = new GenericTest<>();
		v1.setValue("hello아녕 world");
		String s = v1.getValue();
		System.out.println(s);
		
		//Generic을 어떤 타입으로 정하는지에 따라서 사용방법이 달라진다.
		GenericTest<Integer> v2 = new GenericTest<>();
		v2.setValue(1234);
		int n = v2.getValue();
		System.out.println(n);
		
		GenericTest<Character> v3 = new GenericTest<>();
		v3.setValue('A');
		char ch = v3.getValue();
		System.out.println(ch);
	}
}

