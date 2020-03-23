package array;

//***********array*************
public class MakeArray {
	
	public int[] arr = new int[4];          //1차원 배열의 선언 방법 두가지
	public int[] copyarr = {1,2,3,4};
	public int[][] arr3 = {{100,200},{300,400}}; //2차원 배열의 선언 방법 두가지
	public int[][] arr4 = new int[2][2];
	public Student[] studentArr = new Student[4]; //객체 배열의 선언
	//arr = {3,4,5,6};    // 이런식으로는 안된다.
	
	//1차원 배열의 출력
	public void printArr(int[] array) {		
		for(int i=0; i<array.length; i++) {    //array.length : 배열의 크기
			System.out.printf("%d ", array[i]);
		}		
		System.out.printf("\n");
	}
	
	//2차원 배열의 출력
	public void printArr2(int[][] array) {		
		//for문 내에서 배열을 다음과 같은 형태로 표현하여 다차원 배열을 표현 가능하다.
		for(int[] mArr:arr3) {             //각 행을 반복
			System.out.printf("\n행 출력: ");
			for(int m:mArr)  {               //열을 반복
				System.out.printf("%d ",m);}
			}
		System.out.printf("\n");
	}	
	
	//메인 함수
	public static void main(String[] args) {
		MakeArray a1 = new MakeArray();       
		
		//배열 초기화, 사용하기
		for(int i=0; i<a1.arr.length; i++) {
		a1.arr[i]=i+10;		//배열의 인덱스 연산자 [] 
		}		
		
		System.out.printf("arr 출력 : ");
        a1.printArr(a1.arr);
    	System.out.printf("copyarr 출력 : ");
		a1.printArr(a1.copyarr);
		
		//배열 복사하기
		System.out.printf("---복사(arr의 index[0] -> copyarr의  index[2])---\n");
		System.arraycopy(a1.arr, 0, a1.copyarr, 2, 1); //arraycopy(복사할 배열, 복사할 배열의 첫 위치, 복사받을 대상 배열, 붙여 넣을 첫 위치, 복사할 요소의 개수)
    	System.out.printf("copyarr 출력 : ");
        a1.printArr(a1.copyarr);
        
        
        //객체 배열 사용하기
    	Student[] copyStudent = new Student[4];
        //객체 배열 studentArr의 element 초기화
        a1.studentArr[0] = new Student("짱구",5);
        a1.studentArr[1] = new Student("철수",7);
        a1.studentArr[2] = new Student("맹구",15);
        a1.studentArr[3] = new Student("유리",12);    
        
        System.out.printf("studentArr 출력 :\n ");
        for(Student s : a1.studentArr) {
        	s.printInfo();
        }
        
        //객체 배열의 복사.(얕은 복사)
        //객체 배열의 요소로 저장된 값은 인스턴스의 주소 값이므로 원래 인스턴스의 값의 변경이 일어나게 되면 복사된 배열의 인스턴스의 값도 변한다.
        System.arraycopy(a1.studentArr, 0, copyStudent, 0, 4); 
        
        System.out.printf("copyStudent 출력 :\n ");
        for(Student s : copyStudent) {
        	s.printInfo();
        }
        
        //원래 객체 배열의 값 변경
        System.out.printf("studentArr의 마지막 객체 값 변경\n");
        a1.studentArr[3].name="훈이";
        a1.studentArr[3].age=10;
        System.out.printf("copyStudent 출력 :\n ");
        for(Student s : copyStudent) {
        	s.printInfo();
        }
        
        //깊은 복사 방법
        Student[] copyStudent2 = new Student[4];
        copyStudent2[0]=new Student();
        copyStudent2[1]=new Student();
        copyStudent2[2]=new Student();
        copyStudent2[3]=new Student();
        for(int i=0; i<4; i++) {
        	copyStudent2[i].name=a1.studentArr[i].name;
         	copyStudent2[i].age=a1.studentArr[i].age;
        	//얕은 복사 : copyStudent2[i]=a1.studentArr[i];       	
        }
        System.out.printf("copyStudent2 출력 :\n ");
        for(Student s : copyStudent2) {
        	s.printInfo();
        }
        
        //원래 객체 배열의 값 변경
        System.out.printf("studentArr의 세번째 객체 값 변경\n");
        a1.studentArr[2].name="수지";
        a1.studentArr[2].age=8;
        System.out.printf("copyStudent2 출력 :\n ");
        for(Student s : copyStudent2) {
        	s.printInfo();
        }
        //다차원 배열 출력
    	a1.printArr2(a1.arr3);
	}
}