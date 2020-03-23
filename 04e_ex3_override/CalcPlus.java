package ex3_override;

public class CalcPlus extends Calculator{
	@Override
	public int getResult(int a, int b) {
		return a + b;
	}
}
