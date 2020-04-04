package ex3_control_statement;

public class Ex1_if {
	/*
	 # 제어문
	 프로그렘의 흐름을 제어하는 문장. 크게 분기문과 반복문으로 나누어져 있다.
	 분기문 : if, switch
	 반복문 : for, while
	 */
	public static void main(String[] args) {
		
		//# 단순 if문 
		//if(조건식){조건식이 참일 때 실행되는 영역}
		int n = 50;
		String str = "";
		
		if(n == 50) {
			str = "n은 50입니다";
		}
		if(n != 50) {
			str = "n은 50이 아닙니다";
		}
		System.out.println(str);
	}

}
