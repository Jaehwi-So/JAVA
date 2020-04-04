package ex1_single_array;

public class Ex1_singleArray {
	public static void main(String[] args) {
		//String[] sArr = {"hong", "park", "kim"};
		String[] sArr = new String[3];
		sArr[0] = "hong";
		sArr[1] = "park";
		sArr[2] = "kim";
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		System.out.println("====================");
		
		//# 개선된 루프(향상된 for문)
		//장점 : 짧고 간단한 코드로 배열의 모든 요소를 출력할 수 있다. 
		//단점 : 특정 index로 접근하여 수정, 삭제등이 불가능하다.
		for(String s : sArr) {
			System.out.println(s);
		}
	}

}
