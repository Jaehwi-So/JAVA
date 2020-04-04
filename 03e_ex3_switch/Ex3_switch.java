package ex2_switch;

//컨트롤a : 전체선택, 컨트롤i : 들여쓰기 라인 맞춰줌
public class Ex3_switch {
	public static void main(String[] args) {
		String s = "1";
		
		//스위치문은 정수(byte, int, short), 문자, 문자열만을 비교값으로 가질 수 있다.
		switch(s) {
		case "0" : 
			System.out.println("0 선택");
			break;
		case "1" :
			System.out.println("1 선택");
			//break;	//break가 없으면 switch문을 빠져나가지 않는다. break를 만날 때 까지 switch문을 
		case "2" :
			System.out.println("2 선택");
			break;
		default :
			System.out.println("0과 1중에 한가지만 받으세요");
			break;
		}
	}
}
