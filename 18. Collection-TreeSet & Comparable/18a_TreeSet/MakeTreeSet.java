package treeset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

/*
 트리 : 자료의 중복을 허용하지 않으면서 결과 값을 정렬하는 클래스.
 이진 탐색 트리(BST)를 이용하여 이진 트리를 순회한다.
 */
public class MakeTreeSet {
	TreeSet<Student> studentTree=new TreeSet<Student>();
	//Student Treeset에 자료 추가
	public void addStudent(Student s) {
		studentTree.add(s);
	}
	
	//해당 ID를 가진 Student를 TreeSet에서 삭제
	public boolean removeStudent(int ID) {
		Iterator<Student> iter = studentTree.iterator();
		
		while(iter.hasNext()) {
			Student s = iter.next();
			int temp = s.studentID;
			if(s.studentID==ID) {
				studentTree.remove(s);
				return true;
			}
		}
		return false;		
	}
	
	//출력
	public void showStudent() {
		for(Student s : studentTree) {
			System.out.println(s.studentID+s.name);
		}
	}
	
	public static void main(String[] args) {
		MakeTreeSet t1 = new MakeTreeSet();
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("가");
		tree.add("다");
		tree.add("나");
		tree.add("가");
		System.out.println(tree);
		Student s1 = new Student(20181111,"철수",21);
		Student s2 = new Student(20171112,"영희",23);
		Student s3 = new Student(20191113,"영수",20);
		Student s4 = new Student(20191113,"영철",20);
		Student s5 = new Student(20161115,"영미",24);
		Student s6 = new Student(20161114,"영자",24);
		t1.addStudent(s1);
		t1.addStudent(s2);
		t1.addStudent(s3);
		t1.addStudent(s4);
		t1.addStudent(s5);
		t1.addStudent(s6);
		System.out.println("삭제 전");
		t1.showStudent();
		System.out.println("삭제 후");
		t1.removeStudent(20191113);
		t1.showStudent();
		
		System.out.println("ArrayList 정렬");
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		a1.add(s4);
		a1.add(s5);
		a1.add(s6);
		Collections.sort(a1); //클래스에 Comparable을 오버라이딩 시켰다면 Collections.sort를 이용하여 collection 클래스들의 element들을 정렬할 수 있다.
		for(Student s : a1) {
			System.out.println(s.studentID+s.name);
		}	
	}
}

