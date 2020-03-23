package ex3_output_stream;

import java.io.PrintStream;

public class Ex1_Output {
	
	public static void main(String[] args) {
		//화면에 데이터를 출력하도록 하는 클래스.
		PrintStream ps = null;
		//System.out.println()은  스트림을 열고 write, close단계까지 해 준다.
		try {
			ps = System.out;
			ps.write('A');
			ps.write('\n');
			ps.write('B');
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//닫는 작업을 수행해야 결과가 화면에 출력된다.
			ps.close();
		}
	}

}

