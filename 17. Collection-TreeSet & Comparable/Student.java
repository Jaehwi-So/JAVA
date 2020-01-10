package treeset;

public class Student implements Comparable<Student> {

		public String name;
		public int age;
		public int studentID;
		
		public Student(int studentID, String name, int age){
			this.name=name;
			this.age=age;
			this.studentID=studentID;
		};
		
		Student(){};
		
		void printInfo() {
			System.out.printf("학번 : %d, 이름 : %s, 나이 : %d \n",studentID,name,age);		
		}
		
		//회원 ID가 같으면 같은 객체인 것으로 하기 위해서 메서드 오버라이딩
		
		//hashCode() 메서드가 회원 ID를 반환하도록 재정의
		@Override
		public int hashCode() {
			return studentID;
		}
		
		//HashTree에서 ID의 중복을 막기 위해서 equals를 재정의. 이 때는 같은 인스턴스라고 판단하는 기준을 studentID로 한다.
		@Override
		public boolean equals(Object o) {
			if(o instanceof Student) {
				Student s=(Student)o;
				if(this.studentID==s.studentID) {
					return true;
				}
				else return false;
			}
			return false;
		}
		

		//TreeSet은 정렬의 기준을 정해주어야 한다. studentID의 오름차순 순으로 정렬된다.
		@Override
		public int compareTo(Student s) {
			return (this.studentID-s.studentID); // 새로 추가된 회원 ID가 더 크면 양수, 그렇지 않으면 음수, 같으면 0을 반환한다.
			//Collection(Tree)에 요소를 추가할 때 호출되는 메서드이다. 양수일 경우 오름차순 정렬, 음수일 경우 내림차순 정렬을 한다.
			//내림차순으로 정렬하려면 (-1)을 곱해주면 된다.
			//return Integer.compare(this.studentID,s.studentID);	
		}


}

