package ex2_work;

public class Ex1_Work {
	/*
	 과수원이 있다. 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5, 7, 5개
	 과수원에서 하루에 생산되는 과일의 총 갯수를 출력
	 전체 과일생산량의 시간당 평균 생산갯수를 출력
	 단, 과일의 갯수와 총 합을 담을 변수는 int로, 시간당 평균을 구할 변수는 float으로.
	 
	 */
	public static void main(String[] args) {
		int num_pear = 5;
		int num_apple = 7;
		int num_orange = 5;
		int sum = num_pear + num_apple + num_orange;
		float averageT_sum = sum / 24f;
		//float averageT_sum = (float)sum / 24;
		System.out.println("전체 과일 생산량 : "+sum);
		System.out.println("시간당 평균 과일 생산량 : "+averageT_sum);
		
	}

}
