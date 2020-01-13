package fileio2;

public class ByteStreamTest {
	public static void main(String[] args) {
		MakeInputStream s1 = new MakeInputStream();	
		s1.fileRead2();
		System.out.println();
		MakeOutputStream s2 = new MakeOutputStream();
		s2.fileWrite();
		s1.fileRead();
	
	}

}
