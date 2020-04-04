package ex2_multi_array;

public class Ex1_multiArray {
	/*
	 # 다차원 배열
	 1차원 배열의 집합 : 2차원 배열 
	 2차원 배열의 집합 : 3차원 배열
	 */
	public static void main(String[] args) {
		int[][] test = new int[2][3];
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				System.out.print(test[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
