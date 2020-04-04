package ex2_multi_array;

public class Ex3_multiArray {

	public static void main(String[] args) {
		String[][] student = {{"영희", "j:100", "a:90"},
							  {"철수", "j:40", "a:50", "js:90"},
							  {"민수", "j:100"}};
		
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				System.out.printf(student[i][j]+"\t");	// \t : tap친것 만큼 간격을 준다.
			}
			System.out.println();
		}
		
	}

}


