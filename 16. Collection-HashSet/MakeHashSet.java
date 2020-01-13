package hashset;
import java.util.HashSet;
import java.util.Iterator;


/*
HashSet 
집합 자료구조를 구현. 순서와 상관없이 중복을 허용하지 않는다.
 */
public class MakeHashSet {
	HashSet<String> fruitSet = new HashSet<String>(); 	//String HashSet
	HashSet<Student> studentSet = new HashSet<Student>();	//객체의 HashSet
	
	//Student HashSet에 자료 추가
	public void addStudent(Student s) {
		studentSet.add(s);
	}
	
	//해당 ID를 가진 Student를 HashSet에서 삭제
	public boolean removeStudent(int ID) {
		Iterator<Student> iter = studentSet.iterator();
		
		while(iter.hasNext()) {
			Student s = iter.next();
			int temp = s.studentID;
			if(s.studentID==ID) {
				studentSet.remove(s);
				return true;
			}
		}
		return false;		
	}
	
	//출력
	public void showStudent() {
		for(Student s : studentSet) {
			System.out.println(s.studentID+s.name);
		}
	}
	
	public static void main(String[] args) {
		MakeHashSet t1 = new MakeHashSet();

		t1.fruitSet.add("사과");
		t1.fruitSet.add("바나나");
		t1.fruitSet.add("오렌지");
		t1.fruitSet.add("사과");
		System.out.printf("%s \n", t1.fruitSet); //중복을 제거하고 과일의 집합을 표현
		
		
		//객체의 HashSet
		Student s1 = new Student(20181111,"철수",21);
		Student s2 = new Student(20171112,"영희",23);
		Student s3 = new Student(20191113,"영수",20);
		Student s4 = new Student(20191113,"영철",20);
		t1.addStudent(s1);
		t1.addStudent(s2);
		t1.addStudent(s3);
		t1.addStudent(s4);
		t1.showStudent();
		t1.removeStudent(20191113);
		t1.showStudent();


		
		
		
	}

}
