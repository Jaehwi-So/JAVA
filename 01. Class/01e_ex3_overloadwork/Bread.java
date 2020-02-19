package ex3_overloadwork;

public class Bread {

	public void makeBread() {
		System.out.println("빵을 만들었습니다");
		System.out.println();
	}
	
	public void makeBread(int number) {
		for(int i = 0; i < number; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println("요청하신 "+number+"개의 빵을 만들었습니다");
		System.out.println();
	}
	
	public void makeBread(int number, String type) {
		for(int i = 0; i < number; i++) {
			System.out.println(type+"을 만들었습니다");
		}
		System.out.println("요청하신 "+number+"개의 " +type+"을 만들었습니다");
		System.out.println();
	}
	
}
