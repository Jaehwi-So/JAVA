package ex1_else_if;

public class Ex1_else_if {

	public static void main(String[] args) {
		//다중 if문(else if) : 여러 개의 조건비교가 필요한 경우
		int num = 75;
		String str = "";
		
		if(num >= 90) {
			str = "수";
		}
		else if(num >= 80) {
			str = "우";
		}
		else if(num >= 70) {	//참인 조건을 만나면 if문을 빠져나온다.
			str = "미";
		}
		else if(num >= 60) {
			str = "양";
		}
		else {
			str = "가";
		}
		System.out.println(str);
	}


}

