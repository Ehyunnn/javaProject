package test.com;

import java.util.ArrayList;

public interface Test01DAO {
	
	String NAME = "kim"; //static final로 자동으로 정의됨 왜?<전역변수>, 변수명은 대문자
	//인터페이스 내에서 전역변수는 무조건 초기화해서 사용하고 절대값을 못바꿈
	//이탤릭체로 누워있는 걸 보고 static이란 것을 알 수 있음.
	
	
	//public int insert();//<메소드>
	public int insert(Test01VO vo);


	public int update(Test01VO vo);


	public int delete(Test01VO vo);


	public Test01VO selectOne(Test01VO vo);



	public ArrayList<Test01VO> selectAll(); //<>안에 정한 타입만 받겠다.(가변적으로)
	

}
