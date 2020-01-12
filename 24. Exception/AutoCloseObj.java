package exception;

public class AutoCloseObj implements AutoCloseable {
	@Override
	public void close() throws Exception{
		System.out.println("리소스가 close되었습니다."); //본래는 파일 스트림을 닫는 등 리소스를 해제하는 코드를 여기에 구현한다.
	}

}
