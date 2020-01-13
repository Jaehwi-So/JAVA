package java3;

public class Flowcontrolmain {

	//조건문 if
	void controlIF(int number) {
		if(number>=10&&number%10==0) {
			System.out.println("10의 배수입니다.");
		}
		else if(number<10) {
			System.out.println("10보다 작은 수입니다.");
		}
		else {
			System.out.println("10보다 큰 수입니다.");
		}
	}

	//조건문 switch-case
	void controlSwitchcase(int number) {
		switch(number) {
			case 1 : System.out.println("1");
			break;
			case 2 : System.out.println("2");
			break;
			default : System.out.println("1이나 2가 아닌 수");
		}
	}

	//반복문 for
	int controlFor(int number) {
		int sum = 0;
		for(int i=0; i<=number; i++) {
			if(i%3==0) continue; //반복 흐름 제어 continue
			sum+=i;
		}
		return sum;
	}

	//반복문 while
	int controlWhile(int number) {
		int i=0;
		int sum=0;
		while(true) {
			if(i>number) break; //반복 흐름 제어 break
			sum+=i;
			i++;
		}
		return sum;
	}


	public static void main(String[] args) {
		Flowcontrolmain f1 = new Flowcontrolmain();
		f1.controlIF(12);
		f1.controlSwitchcase(1);
		System.out.println("3의 배수를 제외한 0부터 10까지의 수의 합 "+f1.controlFor(10));
		System.out.println("0부터 10까지의 수의 합 "+f1.controlWhile(10));
	}

}
