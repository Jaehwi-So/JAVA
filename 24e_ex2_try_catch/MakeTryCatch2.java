package ex1_try_catch;

public class MakeTryCatch2 {
	//try-catch는 예측 가능한 오류에서만 사용해야 한다. 개발단계에서 오류 부분을 파악하고 수정하기 위해서 사용한다.
	public static void main(String[] args) {
		int[] var = {10, 20, 30};
		for(int i = 0; i <= var.length; i++) {
			try {
				System.out.println(var[i]);	
			}catch(Exception e) {
				e.printStackTrace();	
			}
		}
		System.out.println("프로그램 종료");
	}
}
