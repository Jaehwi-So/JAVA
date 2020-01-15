package fileio3;

public class CharStreamTest {
	
	public static void main(String[] args) {
		MakeFileReader s1 =new MakeFileReader();
		MakeFileWriter s2 = new MakeFileWriter();
		s2.charWriter();
		s1.charReader();
	}

}
