package ex1_operator;

public class Ex2_Operator {
	public static void main(String[] args) {
		//비교 연산자 : 변수의 값을 비교하여 참과 거짓을 판단하는 연산자. 연산결과는 true,false로 반환됨
		int n1 = 10;
		int n2 = 20;
		boolean res = n2 < n1;
		System.out.println("n2<n1 : "+res);
		res = n1 <= n2;
		System.out.println("n1<=n2 : "+res);
		res = n1 == n2;
		System.out.println("n1==n2 : "+res);
		res = n1 != n2;
		System.out.println("n1!=n2 : "+res);
		
		//논리 연산자 : 비교연산을 통한 연산이 두 개 이상 필요할 때 사용하는 연산자
		int myAge = 21;
		int limit = 25;
		res = limit - myAge >= 5 && (myAge+=10) >= 20; //AND
		System.out.println("&& res : "+res);
		System.out.println("myAge : "+myAge);	//앞쪽 연산이 false라면 뒤쪽 연산을 수행하지 않음.
		
		n1 = 10;
		n2 = 20;
		res = (n2 - 10) == 10 || (n1 += 10) > 20; //OR
		System.out.println("|| res : "+res);
		System.out.println("n1 : "+n1);	//앞쪽 연산이 true라면 뒤쪽 연산을 수행하지 않음.
		
		System.out.println("res : "+res);	
		System.out.println("!res : "+!res);	//NOT
		
	}
}

