package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//예외 처리
/*
 프로그램을 개발할 때의 오류 발생에 대처하기 위해서 예외 처리를 해두는 것은 중요하다.
 로그 분석을 통해서 원인을 찾을 수 있도록 로그를 정확하게 남기는 것이 필요하다.
 오류에는 코드 작성의 실수로 인해 발생하는 컴파일 오류와 실행 중인 프로그램이 의도한 바와 다르게 실행되어 발생하는 실행 오류가 있다.
 실행 오류에는 메모리의 문제, 오버플로 등으로 발생하는 시스템 오류와 예외가 있다. 여기서 예외 처리를 함으로서 프로그램에서 제어가 가능해진다.
 
 입출력 예외 처리(IOException) -> FileNotFoundException / SocketException
 실행 오류 예외 처리(RuntimeException) -> ArithmeticException / IndexOutBoundsException
 */
public class ExceptionTest{
	public void func_trycatch() {
		int[] arr = new int[5];
		//예외처리 try-catch문
		try {	
			//예외가 발생할 수 있는 코드 부분
			for(int i=0; i<=5; i++) {
				arr[i]=i*10;
				System.out.printf("%d ",i*10);
			}
		}catch(ArrayIndexOutOfBoundsException e) { //catch(처리할 예외 타입 e)
			System.out.println(e);
			System.out.println("예외 처리"); //예외가 발생하였을 때 예외를 처리하는 부분
		}
		

		
	}
	
	public void func_trycatchfinally() {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("ab.txt");
		}catch(FileNotFoundException e) {
			System.out.println(e);
			return; //강제 종료 시도. 하지만 finally에 의해서 항상 수행된다.
		}finally { //try-catch-finally. finally부분은 항상 수행되는 부분이다. 파일 입출력 시 연 파일을 항상 닫을 필요가 있다. 이것을 finally를 통해서 구현하였다.
			if(fis != null) {
				try {
				fis.close();	//close()부분에서도 예외가 발생할 수 있으므로 예외처리
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("예외지만 프로그램이 계속 수행됩니다.");
		}
		System.out.println("프로그램이 계속 수행됩니다.");	
		//파일 입출력의 예외는 컴파일러가 직접 체크해주지만 이에 대해서 예외 처리를 해 두면 프로그램이 계속 수행될 수 있다.
		//예외 처리를 통해서 예외 상황 자체를 막을 수 없지만 상황을 알 수 있으며 비정상적인 종료를 막을 수 있다.
		
	}
	
	//위의 파일 입출력의 예제와 같이 시스템 자원을 사용하고 해제하는 코드는 다소 복잡하다. try-with-resource문을 사용하여 try문에서 열린 리소스를 자동으로 닫도록 할 수 있다.
	//try-with-resource문을 구현하려면 해당 리소스가 AutoCloseable인터페이스를 구현해야 한다.
	public void func_trywithresource() {
		try(AutoCloseObj obj = new AutoCloseObj()){	//사용할 리소스 선언	
			throw new Exception(); //강제 예외 처리
		}catch(Exception e) {	//예외 발생시 예외처리
			System.out.println("예외 부분입니다");
		}
		
	}
	
	//예외처리를 미루는 throws
	public void func_throws() throws FileNotFoundException { //예외를 해당 메서드에서 처리하지 않고 미룬 후 메서드를 호출하여 사용하는 부분에서 예외를 처리하도록 하는 방법
		FileInputStream fis = null;
		fis = new FileInputStream("ab.txt");
	}
	
	//사용자 정의 예외처리
	public void user_exception(String ID) throws IDException {
		
		if(ID.length()<12) {
			throw new IDException("아이디는 12자 이상이어야 합니다"); //해당 조건문을 만족시킨다면 throw를 통하여 예외처리 상황을 발생시킨다.
		}	//IDException은 사용자가 정의한 예외 타입이다. 이는 예외 클래스를 직접 만들어 예외를 발생시키며 예외 클래스는 예외처리의 상위 클래스에서 상속받는다.
		System.out.println("아이디가 정상적으로 변경되었습니다.");
	}
	
	public static void main(String[] args) {
		ExceptionTest t1 = new ExceptionTest();
		t1.func_trycatch();
		t1.func_trycatchfinally();
		t1.func_trywithresource();
		// t1.func_throws(); throws를 통해 미루어진 예외 처리는 해당 메서드가 호출되는 부분에서 처리되어야 한다.
		
		try {
			t1.user_exception("abcd");
		} catch (IDException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			t1.user_exception("abcdefghijklmnop");
		} catch (IDException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

