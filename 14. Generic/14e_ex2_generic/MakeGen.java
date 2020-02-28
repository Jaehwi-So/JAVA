package ex2_generic;

public class MakeGen {
	
	//메서드에서의 Generic type 사용.
	public <T> void printArr(T[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
