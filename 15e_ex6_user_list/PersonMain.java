package ex1_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 메뉴 보여줌.
 1. 정보추가 
 2. 정보삭제
 3. 전체정보
 etc. 종료
 >>1 
 ---정보 추가---
 이름 입력 : 
 나이 입력 : 
 전화번호 입력 :
 정보가 저장되었습니다.
 ->메뉴 다시 보여줌
 >>3
 ---전체 정보---
 등록인원 : 1
 a / 10 / 010-1111-1111
 >>2
 ---정보 삭제---
 삭제할 이름 :
 삭제완료.
 
 */
public class PersonMain {
	
	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<>();
		int i;
		String name;
		int age;
		String tel;
		while(true) {
			System.out.println("============ MENU ===========");
			System.out.println("1>정보추가 / 2>정보삭제 / 3>전체정보 보기 / etc>종료");
			Scanner sc = new Scanner(System.in);
			i = sc.nextInt();
			if(i == 1) {
				System.out.println("=========== 정보 추가 ===========");
				Person p = new Person();
				System.out.print("이름 입력 : ");
				name = sc.next();
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				System.out.print("전화번호 입력 : ");
				tel = sc.next();
				p.setName(name);
				p.setAge(age);
				p.setTel(tel);
				arr.add(p);
				System.out.println("정보가 저장되었습니다.");
			}
			
			else if(i == 2) {
				System.out.println("=========== 정보 삭제 ===========");
				System.out.print("삭제할 대상의 이름을 입력하세요 : ");
				name = sc.next();
				
				for(int k = 0; k < arr.size(); k++) {
					if( name.equals(arr.get(k).getName()) ) {
						arr.remove(k);
					}
				}
				
				System.out.print("삭제 완료\n");
			}
			
			else if(i == 3) {
				System.out.println("=========== 전체 정보 ===========");
				for(int k = 0; k < arr.size(); k++) {
					Person temp = arr.get(k);
					System.out.printf("[이름 : %s / 나이 : %d / 전화번호 : %s]\n",temp.getName(),temp.getAge(),temp.getTel());
				}
			}
			else {
				System.out.println("============= 종료 =============");
				break;
			}		
		}	
	}
}
