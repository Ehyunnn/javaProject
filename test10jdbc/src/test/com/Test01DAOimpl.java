package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test01DAOimpl implements Test01DAO {

	// 3. Ŀ�ؼ�>>user/pw>>test/hi123456,url
	private Connection conn = null; // �� �ʿ��ұ�? ���߿� ���α׷��� ���������ؼ� finally���� ���Ǵ� ���� conn, pstmt�� try~catch�����־ ���� ������
	// �� �ۿ��� ����.
	private PreparedStatement pstmt = null;
	private ResultSet rs;

	//�Ʒ��� db�������� private�� ���⿡���� ��밡��... ������ �ٸ��������� �ҷ������ϰ������ info�������̽��� �־��ָ��.
//	private String driver_name = "oracle.jdbc.OracleDriver";
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String user_id = "test";
//	private String user_pw = "hi123456";

	public Test01DAOimpl() {
		// 2. ��뼱��>>����̹�����
		// ���� ó��: try~catch
		// ���� ����: throws

		try {
			Class.forName(Test01DBinfo.DRIVER_USER);
			System.out.println("driver successed....");
		} catch (ClassNotFoundException e) {
			System.out.println("driver failed....");
			e.printStackTrace();
		}
	}

	@Override
	public int insert(Test01VO vo) {
		System.out.println("insert()........");
		int result = 0;

		/* **** */try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn successed");

			// 4. DB���ǹ� ���� (SQL��)
			String sql = "insert into table1(column1,column2,column3,column4,column5)" + "values(seq1.nextval,?,?,?,?)";
			// ?�� �� ���̴� �ڵ����� �־��ֱ�

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getColumn2());
			pstmt.setString(2, vo.getColumn3());
			pstmt.setString(3, vo.getColumn4());
			pstmt.setString(4, vo.getColumn5());

			// 5. ��ȯó��
			result = pstmt.executeUpdate(); // ����Ʈ�Ҷ��� ��ȯŸ���� �޶� �ٲ� ,execute�������� ���� ���� ����ִ´�
			System.out.println("result:" + result);

			/* **** */ } catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close(); // ���߿� ���ź��� �ݾ������. ���⼭ ���α׷��� �����
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return result;
	}

	@Override
	public int update(Test01VO vo) {
		System.out.println("update()....");
		int result = 0;
		System.out.println(vo.getColumn1());
		System.out.println(vo.getColumn2());
		System.out.println(vo.getColumn3());
		System.out.println(vo.getColumn4());
		System.out.println(vo.getColumn5());

		try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn successed");

			String sql = "update table1 set " + "column2=?,column3=?," + "column4=?,column5=? " + "where column1=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getColumn2());
			pstmt.setString(2, vo.getColumn3());
			pstmt.setString(3, vo.getColumn4());
			pstmt.setString(4, vo.getColumn5());
			pstmt.setInt(5, vo.getColumn1());

			result = pstmt.executeUpdate();// �����Ϸ�
			System.out.println("result:" + result);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return result;

		}
	}

	@Override
	public int delete(Test01VO vo) {
		// TODO Auto-generated method stub
		System.out.println("delete()....");
		int result = 0;
		System.out.println(vo.getColumn1());
		try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn seccessed");
			String sql = "delete from table1 where column1=?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, vo.getColumn1()); // ù��°,�ι�° : ù��°������ ����ǥ�� ��ġ�� ���ϰ�, �ι�°�� �ٲܳ����� ����
			result = pstmt.executeUpdate();// �����Ϸ�

			// System.out.println("result:" + result);

		} catch (SQLException e) {
			System.out.println("connect fail");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return result;
		}
	}

	@Override
	public Test01VO selectOne(Test01VO vo) {
		System.out.println("selectOne....");
		System.out.println(vo.getColumn1());

		Test01VO vo2 = new Test01VO();
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn seccessed");
			String sql = "select *from table1 where column1=?";
			pstmt = conn.prepareStatement(sql); // insert, delete �� ���������� ���� �̷��� �ҷ����°� �ٸ�!!!
			pstmt.setInt(1, vo.getColumn1()); // ù��°,�ι�° : ù��°������ ����ǥ�� ��ġ�� ���ϰ�, �ι�°�� �ٲܳ����� ����

			rs = pstmt.executeQuery();// �����Ϸ�
			System.out.println("rs:" + rs);

			while (rs.next()) { // rs.next(): �о� �� ���� ������ true �о�� ���� ������ false
				// �̰� 8�� �÷��� �����Ͱ� �߳������� Ȯ���� ��. ���� ������ �ڵ����� Ȯ�θ��һ� �ʿ����� ����.
				vo2.setColumn1(rs.getInt("column1"));
				vo2.setColumn2(rs.getString("column2"));
				vo2.setColumn3(rs.getString("column3"));
				vo2.setColumn4(rs.getString("column4"));
				vo2.setColumn5(rs.getString("column5"));
			}
			rs.close();// �ּ��� �ݾ�����. �׷��������� ��ӵ��ư��� �ȵ�
		} catch (SQLException e) {
			System.out.println("connect fail");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return vo2;
		}
	}

	@Override
	public ArrayList<Test01VO> selectAll() {
		ArrayList<Test01VO> vos = new ArrayList<Test01VO>(); //ArrayList<Test01VO>�� �޼ҵ�θ� �����ϸ�� !
		//���� �ؿ� vos.add(new Test01VO());count��� �̷��� ����

		try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn seccessed");
			String sql = "select*from table1 order by column1 desc";
			pstmt = conn.prepareStatement(sql); // insert, delete �� ���������� ���� �̷��� �ҷ����°� �ٸ�!!!
			// sql���� ����ǥ�� ������ set���ʿ���� 1!!
			rs = pstmt.executeQuery();
			System.out.println("rs:" + rs);

			while (rs.next()) { // rs.next(): �о� �� ���� ������ true �о�� ���� ������ false
				Test01VO vo = new Test01VO();
				 vo.setColumn1(rs.getInt("column1"));
				 vo.setColumn2(rs.getString("column2"));
				 vo.setColumn3(rs.getString("column3"));
				 vo.setColumn4(rs.getString("column4"));
				 vo.setColumn5(rs.getString("column5"));
				
				vos.add(vo);
				
				// �̰� 8�� �÷��� �����Ͱ� �߳������� Ȯ���� ��. ���� ������ �ڵ����� Ȯ�θ��һ� �ʿ����� ����.
				
			}
		} catch (SQLException e) {
			System.out.println("connect fail");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return vos;
		}
	}
}
