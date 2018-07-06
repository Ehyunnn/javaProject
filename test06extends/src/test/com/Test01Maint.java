package test.com;

public class Test01Maint {

	public static void main(String[] args) {
		System.out.println("main....상속");

		Test01Person p = new Test01Person();
		System.out.println(p.sid);
		System.out.println(p.name);
		System.out.println(p.fm);
		System.out.println(p.address);
		p.ppp();

		Test01Student st = new Test01Student();
		System.out.println(st.sid);
		System.out.println(st.name);
		System.out.println(st.fm);
		System.out.println(st.address);
		st.ppp();
		st.sss();
		// Student엔 매개변수를 입력하지 않았슴. 하지만 person에 매개변수를 입력했고 상속*extends
		// Test01Person)받았기때문에 이렇게 사용가능!!!

		// student에 변수를 입력한 상태에서. middlestudent에 student의 변수를 상속함. 그런데 main에서
		// middlestudent를 불러와서 사용!!
		Test01MiddleStudent mst = new Test01MiddleStudent();
		// Test01Student mst = new Test01MiddleStudent();//이렇게 한다면 student의 타입만 사용이
		// 가능하게되니 java가 에러가남.
		System.out.println(mst.sid);
		System.out.println(mst.name);
		System.out.println(mst.fm);
		System.out.println(mst.address);
		System.out.println(mst.kor);
		mst.ppp();
		mst.sss();

		Test01Person.ppp3();
		Test01Student.ppp3();
		Test01MiddleStudent.ppp3();

		
		
		//************면접대비용 질문*********************
		// 오버로딩
		// 클래스 내부에서 메소드와 생성자의 이름을 같도록 생성하고자할 때
		// 매개변수의 타입,개수,순서를 다르게 만드는 것

		// 오버라이딩
		// 상속이 전제로 되어질 때, 슈퍼클래스의
		// 메소드를 재정의 하는 것

		// 다형성을 이용한 객체 생성
		// 상속이 전제로 되어질 때
		// 슈퍼클래스타입 객체생성시 서브클래스생성자로 객체생성가능
		// 이때 슈퍼클래스의 자원(속성,메소드 등)만 사용가능

	}

}