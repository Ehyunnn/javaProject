package test.com;

import java.util.ArrayList;

public interface Test01DAO {
	
	String NAME = "kim"; //static final�� �ڵ����� ���ǵ� ��?<��������>, �������� �빮��
	//�������̽� ������ ���������� ������ �ʱ�ȭ�ؼ� ����ϰ� ���밪�� ���ٲ�
	//���Ÿ�ü�� �����ִ� �� ���� static�̶� ���� �� �� ����.
	
	
	//public int insert();//<�޼ҵ�>
	public int insert(Test01VO vo);


	public int update(Test01VO vo);


	public int delete(Test01VO vo);


	public Test01VO selectOne(Test01VO vo);



	public ArrayList<Test01VO> selectAll(); //<>�ȿ� ���� Ÿ�Ը� �ްڴ�.(����������)
	

}
