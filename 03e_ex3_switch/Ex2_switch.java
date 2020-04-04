package ex2_switch;

public class Ex2_switch {
	
	public static void main(String[] args) {
		char ch = '미';
		String str = "";
		
		switch(ch) {
		case '수' :
			str = "90~100";
			break;
		case '우' :
			str = "80~89";
			break;
		case '미' :
			str = "70~79";
			break;
		case '양' :
			str = "60~69";
			break;
		case '가' :
			str = "~59";
			break;
			
		//shift+tab : 역들여쓰기
		default :	//비교값과 조건값이 모두 일치하지 않는 경우 무조건 실행되는 디폴트 영역
			System.out.println("수우미양가 중 한가지를 입력해야 합니다.");
			break;
		}
		System.out.println(str);
	}
}