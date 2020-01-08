package hashset;

public class Student {

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
		
		//HashSet에서 ID의 중복을 막기 위해서 equals를 재정의. 이 때는 같은 인스턴스라고 판단하는 기준을 studentID로 한다.
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


}

