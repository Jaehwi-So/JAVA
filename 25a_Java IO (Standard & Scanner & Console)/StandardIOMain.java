package fileio;

public class StandardIOMain {
	
	public static void main(String[] args) {
		IOStream s1 = new IOStream();
		//s1.IOsystemIn(); //System.in.read()는 바이트 하나를 읽어들인다. 엔터키 또한 한 바이트로 포함되는데 만약 s1.IOsystemIN()후 바로 다음 함수를 호출한다면 엔터키나 다른 문자열을 출력한다.
		s1.IOsystemIn2();
		
		MyScanner s2 = new MyScanner();
		s2.getInformation();
		s2.printInformation();
		
		//ConsoleTest s3 = new ConsoleTest(); 
		//s3.useConsole();
		//s3.printInformation(); 다음 메서드는 명령 프롬프트 창에서 직접 실행시켜야 한다.
	}

}
