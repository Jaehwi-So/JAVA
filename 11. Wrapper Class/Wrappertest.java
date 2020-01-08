package wrapperxx;
//Wrapper Class란 : 기본 자료형을 클래스처럼 사용 가능하도록 감싼 class.
/*		기본 자료형			클래스		바이트
		boolean			Boolean		1
		byte			Byte		1
		char			Character	2
		short			Short		2
		int				Integer		4
		long			Long		8
		float			Float		4
		double			Double		8
 */
public class Wrappertest {
	
	public static void main(String[] args) {
		Integer num = new Integer(100);
		int num2 = num.intValue();
		System.out.println(num2);
		
		Integer num3=Integer.valueOf("100"); //valueOf() 정적 메서드를 사용할 시 정수나 문자열을 바로 Integer형으로 반환받을 수 있다.
		int num4=Integer.parseInt("200");	//parseInt() : 문자열에서 int값으로 바로 반환받을 수 있다.
		System.out.println(num3+" "+num4);
		Integer num5= new Integer("50");
		System.out.println(num5);	//Integer형의 생성자는 정수 혹은 문자열을 매개변수로 받는 경우가 있다.
		
		int sum=num+num2; // num이 num.intValue()를 통하여 언박싱된다. 기본형->객체형
		Integer num6 = num2; // num2가 Integer.valueOf(num2)로 오토박싱된다. 객체형->기본형
	}

}