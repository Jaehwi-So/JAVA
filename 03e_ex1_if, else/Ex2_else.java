package ex3_control_statement;

public class Ex2_else {
	public static void main(String[] args) {
		//#if, else문
		//if(조건문){조건식이 참일때 실행} else{조건식이 거짓일 때 실행}
		
		int n = 49;
		String str = "";
		if(n++ >= 50) {
			str = "n은 50이상의 수입니다";
		}
		else {
			str = "n은 50미만의 수입니다";
		}
		System.out.println(str);
		
		
		//위의 코드를 삼항 연산자로 바꾸어 보십시오.
		int num = 49;
		String s = (num++) >= 50 ? "n은 50이상의 수입니다" : "n은 50미만의 수입니다";
		System.out.println(s);
	}
}

