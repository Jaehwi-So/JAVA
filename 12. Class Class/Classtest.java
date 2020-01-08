package classxx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Class 클래스
/*
  클래스를 감싸는 클래스. 
  언제 사용하는가? : 여러 클래스들 중 반환받는 클래스의 정확한 자료형을 모를 때, 상황에 따라서 다른 클래스를 사용해야 할 때
 */
public class Classtest  {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {//예외처리
		Man h1 = new Man();
		Class c = h1.getClass();	//Object의 getClass()메서드를 이용하기. 클래스의 이름을 반환해준다.
		System.out.println(c.getName());
		Class c2 = Man.class;	//직접 클래스 대입
		System.out.println(c2.getName());
		Class c3 = Class.forName("classxx.Man"); //Class.forName() 클래스 이름으로 가져오기
		System.out.println(c3.getName());
		
		//reflection : Class 클래스를 이용하여 클래스의 자료형을 모르는 상태에서 클래스의 정보를 가져오고 이를 통해 인스턴스를 생성하거나 메서드를 호출하는 방식
		Class c4 = Class.forName("java.lang.String");
		
		System.out.println("모든 생성자 출력");
		Constructor[] cons=c2.getConstructors(); // 해당 클래스의 모든 생성자 가져오기
		for(Constructor cs : cons) {
			System.out.println(cs);
		}
		System.out.println("모든 멤버 변수 출력");
		Field[] fields=c2.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		System.out.println("모든 메서드 출력");
		Method[] methods=c2.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}	
		
		//newInstance() : 새로운 클래스 생성
		Man m2 = (Man)c2.newInstance(); //예외처리 필요하다.
		System.out.println(m2);
		
		//동적 로딩 : class.forName()을 이용하여 필요에 따라서 다른 클래스를 로딩할 수 있게 구현하는 것
		//어떤 클래스와 연결할지에 따라서 변수를 바꾸기만 하면 되므로 동적 로딩을 사용한다.
		String className="classxx.Man";	//문자열에 오류가 발생할 경우를 대비해서 예외 처리를 해 둔다.
		Class p = Class.forName(className);
		
	}
}