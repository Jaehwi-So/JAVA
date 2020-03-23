package ex3_override;

public class CalcMain {
	
	public static void main(String[] args) {
		
		CalcPlus cp = new CalcPlus();
		int res = cp.getResult(10, 20);
		System.out.println("덧셈 결과 : "+res);
		
		CalcMinus cm = new CalcMinus();
		res = cm.getResult(20, 5);
		System.out.println("뺄셈 결과 : "+res);
	}

}
