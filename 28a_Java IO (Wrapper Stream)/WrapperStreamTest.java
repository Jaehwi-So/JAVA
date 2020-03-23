package fileio4;
/*
InputStream : 바이트 단위로 읽는 스트림 중 최상위 스트림
-하위 클래스
#FileInputStream(파일에서 바이트 단위로 읽어들임)
#ByteArrayInputStream(Byte배열 메모리에서 바이트 단위로 자료를 읽어들임)
#FilterInputStream(기반 스트림에서 자료를 읽을 때 사용되는 보조 스트림의 상위 클래스)
*/
/*
OutputStream : 바이트 단위로 쓰는 스트림 중 최상위 스트림
-하위 클래스
#FileOutputStream(파일에서 바이트 단위로 씀)
#ByteArrayOutputStream(Byte배열 메모리에서 바이트 단위로 자료를 씀)
#FilterOutputStream(기반 스트림에서 자료를 쓸 때 사용되는 보조 스트림의 상위 클래스)
*/
//Reader : 문자 단위로 읽는 스트림 중 최상위 스트림
/*
#FileReader : 파일에서 문자 단위로 읽는 스트림 클래스
#InputStreamReader : 바이트 단위로 읽은 자료를 문자로 변환해 주는 보조 스트림
#BufferedReader : 문자로 읽을 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림
*/
//Writer : 문자 단위로 읽는 스트림 중 최상위 스트림
/*
FileWriter : 파일에서 문자 단위로 쓰는 스트림 클래스
InputStreamWriter : 바이트 단위로 쓴 자료를 문자로 변환해 주는 보조 스트림
BufferedWriter : 문자로 쓸 때 배열을 제공하여 한꺼번에 읽을 수 있는 기능을 제공하는 보조 스트림
*/
public class WrapperStreamTest {
	
	public static void main(String[] args) {
		MakeInputStreamReader s1 = new MakeInputStreamReader();
		MakeOutputStreamWriter s2 = new MakeOutputStreamWriter();
		MakeDataStream s3 = new MakeDataStream();
		s1.ISRStream();
		s2.OSWStream();
		s1.bufferedIS();
		s2.bufferedOS();
		System.out.println();
		s3.dataStream();
	}

}
