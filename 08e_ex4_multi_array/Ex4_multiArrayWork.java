package ex2_multi_array;

public class Ex4_multiArrayWork {
	public static void main(String[] args) {
		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력하는 코드 작성
		int[][] arr = {{1,3,5,4},{3,6,7,10,9},{13,11,19},{23,14}};
		int sum = 0;
		double avg = 0;
		int n = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				n++;
			}
		}
		avg = (double)sum / n;
		System.out.println("총합 : "+sum);
		System.out.printf("평균 : %.2f\n", avg);
	}

}
