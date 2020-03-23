package ex1_try_catch;


/* 예외 처리 
 * 자바에서 프로그렘이 실행되는 도중 예외(버그, 에러..)가 발생하면 그 시점에서 프로그렘이 강제적으로 종료된다.
 * 이것을 올바른 판단이지만 때로는 예측 가능한 오류에 대해 대비하여 프로그렘의 강제종료 없이 이어나가야 하는 경우가 있다.
 * 예외처리를 통해서 프로그렘의 비정상적인 종료를 줄일 수 있다.
 */
public class MakeTryCatch {
	
	public static void main(String[] args) {
		int n = 0;	//오류가 발생하는 경우 , 실수나 정수값을 0으로 나누는 것은 오류 발생.
		//int n = 5;  //오류가 발생하지 않는 경우
		int result = 0;
		String[] sArr = new String[2];
		
		//#try-catch-finally문. 
		try {				//1. try영역 : 해당 영역에서 오류 발생코드가 있는지 점검
			result = 10 / n; 
			sArr[2]="hello";
		}catch(Exception e) {	//2. catch영역 : 만약 try 영역에서 오류가 발생했다면 catch를 거친 후 빠져나간다.
			e.printStackTrace();	//해당 메서드를 사용하면 어떤 종류의 오류가 발생했는지 확인할 수 있다.
		}finally {	//3. finally영역 : try 영역에서 오류발생 유무에 상관없이 반드시 거치는 영역
			System.out.println("finally 영역");
		}
		System.out.println(result);
		
		
		//여러개의 catch문을 이용하여 예외처리하는방법. 거의 안쓴다.	
//		try {				//1. try영역에서 오류 발생코드가 있는지 점검
//			result = 10 / n; 
//			sArr[2]="hello";
//		}catch(ArithmeticException e) {	//2. 만약 try 영역에서 오류가 발생했다면 catch를 거친 후 빠져나간다.
//			//예외의 종류에 따라서 예외처리를 각각 해줄 수 있다.
//			System.err.println("오류 발생, 정수는 0으로 나눌 수 없습니다.");			
//		}catch(ArrayIndexOutOfBoundsException e) {
//			//예외의 종류에 따라서 예외처리를 각각 해줄 수 있다.
//			System.err.println("오류 발생, 범위 초과");
//		}

				
	}
}

