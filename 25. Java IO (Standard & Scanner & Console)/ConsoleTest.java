package fileio;

import java.io.Console;

//직접 콘솔 창에서 자료를 입력받을 때 사용하는 Console 클래스. 명령 프롬프트 창을 이용할 수 있다.
//메서드 : String readLine() : 문자열 읽기 , char[] readPassword() : 사용자에게 문자열을 보여 주지 않고 읽기, 
//Reader reader() : Reader 클래스 반환, PrintWriter writer() : PrintWriter 클래스 반환
public class ConsoleTest {
	public String name;
	public String age;
	public String height;
	
	void useConsole() {
		Console cs = System.console();
		System.out.println("학생의 이름을 입력해주세요");
		this.name=cs.readLine();
		System.out.println("학생의 나이를 입력해주세요");
		this.age=cs.readLine();
		System.out.println("학생의 키를 입력해주세요");
		this.height=cs.readLine();
	}
	
	void printInformation() {
		System.out.printf("이름 : %s, 나이 : %d, 키 : %f",this.name,this.age,this.height);
	}

}
