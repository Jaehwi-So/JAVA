package ex6_array;

public class Ex2_singleArray {
	public static void main(String[] args) {
		
		//선언 및 생성을 한번에
		char[] cArr = new char[4];
		cArr[0] = 'j';
		cArr[1] = 'a';
		cArr[2] = 'v';
		cArr[3] = 'a';
		//cArr[4] = '!';
		
		//배열의 선언 + 생성 + 초기화를 한번에
		String[] sArr = { "안녕", "하세요" };
		//String[] sArr = new String[2];
		//sArr[0] = "안녕";
		//sArr[1] = "하세요";
		
		
		//cArr배열에 담긴 모든 값을 화면에 출력
		for(int i = 0; i < cArr.length; i++) {
			System.out.print( cArr[i] );
		}
	}//main
}





































