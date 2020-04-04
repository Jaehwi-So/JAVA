package ex1_operator;

public class Ex4_Operator {

	public static void main(String[] args) {
		//증감 연산자 : '1'씩 증가시키거나 감소시키는 연산자. 전위, 후위
		int a = 10;
		System.out.println("a++ : "+ a++);	//후행증가
		System.out.println("++a : "+ ++a);	//선행증가
		
		int b  = 11;
		b++;
		--b;
		--b;
		b--;
		++b;
		--b;
		++b;
		b++;
		System.out.println(b++);
	}	
}
