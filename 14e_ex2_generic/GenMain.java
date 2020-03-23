package ex2_generic;

public class GenMain {
	
	public static void main(String[] args) {
		MakeGen g1 = new MakeGen();
		Integer[] iArr = {1,2,3,4,5};
		g1.printArr(iArr);
		
		Double[] dArr = {1.1,2.1,3.1,4.1};
		g1.printArr(dArr);
		
		String[] sArr = {"apple","banana","cat","dog"};
		g1.printArr(sArr);
	}

}
