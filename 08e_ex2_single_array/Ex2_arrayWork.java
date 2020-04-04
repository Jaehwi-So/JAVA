package ex1_single_array;

public class Ex2_arrayWork {
	public static void main(String[] args) {
		//arr배열에 담긴 모든 값의 합을 출력하시오. 결과 : 150
		int[] arr = {10, 10, 30, 40, 50};
		int res = 0;
		for(int n : arr) {
			res += n;
		}
		System.out.println("결과 : "+res);
		
	}
}
