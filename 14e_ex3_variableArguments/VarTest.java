package ex1_variableArguments;

public class VarTest {
	public void varTest(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	//int... : variable argument : int 타입의 parameter의 개수를 상관없이 받을 수 있다. == 갯수 제한이 없는 배열
	public void varTest2(int... args) {
		
		int[] aTest = args;
		
		for(int i=0; i<aTest.length; i++) {
			System.out.print(aTest[i]+" ");
		}
		System.out.println();
	}

}
