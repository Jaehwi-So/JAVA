package ex1_variableArguments;

public class VarMain {
	public static void main(String[] args) {
		VarTest vt = new VarTest();
		int[] arr = {1,2,3};
		vt.varTest(arr);
		
		vt.varTest2(1,2,3,4,5);
		vt.varTest2(1,2,3,4,5,6,7);
	}
}
