package test.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Test01DAOimpl implements Test01DAO {

	// 3. 커넥션>>user/pw>>test/hi123456,url
	private Connection conn = null; // 왜 필요할까? 나중에 프로그램을 끝내기위해서 finally에서 사용되는 변수 conn, pstmt가 try~catch에만있어서 같이 쓰려면
	// 그 밖에서 정의.
	private PreparedStatement pstmt = null;
	private ResultSet rs;

	//아래는 db의정보로 private로 여기에서만 사용가능... 하지만 다른데에서도 불러오게하고싶으면 info인터페이스에 넣어주면됨.
//	private String driver_name = "oracle.jdbc.OracleDriver";
//	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	private String user_id = "test";
//	private String user_pw = "hi123456";

	public Test01DAOimpl() {
		// 2. 사용선언>>드라이버연결
		// 예외 처리: try~catch
		// 예외 전가: throws

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

			// 4. DB질의문 실행 (SQL문)
			String sql = "insert into table1(column1,column2,column3,column4,column5)" + "values(seq1.nextval,?,?,?,?)";
			// ?에 들어갈 아이는 코딩으로 넣어주기

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getColumn2());
			pstmt.setString(2, vo.getColumn3());
			pstmt.setString(3, vo.getColumn4());
			pstmt.setString(4, vo.getColumn5());

			// 5. 반환처리
			result = pstmt.executeUpdate(); // 셀렉트할때만 반환타입이 달라서 바뀜 ,execute실행으로 통해 값을 집어넣는다
			System.out.println("result:" + result);

			/* **** */ } catch (SQLException e) {
			System.out.println("pstmt failed");
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close(); // 나중에 쓴거부터 닫아줘야함. 여기서 프로그램이 종료됨
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

			result = pstmt.executeUpdate();// 수정완료
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

			pstmt.setInt(1, vo.getColumn1()); // 첫번째,두번째 : 첫번째에서는 물음표의 위치를 말하고, 두번째는 바꿀내용을 말함
			result = pstmt.executeUpdate();// 수정완료

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
			pstmt = conn.prepareStatement(sql); // insert, delete 등 여러가지에 따라서 이렇게 불러오는게 다름!!!
			pstmt.setInt(1, vo.getColumn1()); // 첫번째,두번째 : 첫번째에서는 물음표의 위치를 말하고, 두번째는 바꿀내용을 말함

			rs = pstmt.executeQuery();// 수정완료
			System.out.println("rs:" + rs);

			while (rs.next()) { // rs.next(): 읽어 올 행이 있으면 true 읽어올 행이 없으면 false
				// 이건 8번 컬럼의 데이터가 잘나오는지 확인할 뿐. 굳이 지금의 코딩에선 확인만할뿐 필요하지 않음.
				vo2.setColumn1(rs.getInt("column1"));
				vo2.setColumn2(rs.getString("column2"));
				vo2.setColumn3(rs.getString("column3"));
				vo2.setColumn4(rs.getString("column4"));
				vo2.setColumn5(rs.getString("column5"));
			}
			rs.close();// 최소한 닫아주자. 그렇지않으면 계속돌아가서 안됨
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
		ArrayList<Test01VO> vos = new ArrayList<Test01VO>(); //ArrayList<Test01VO>는 메소드로만 접근하면됨 !
		//따라서 밑에 vos.add(new Test01VO());count대신 이렇게 받음

		try {
			conn = DriverManager.getConnection(Test01DBinfo.URL, Test01DBinfo.USER_ID, Test01DBinfo.USER_PW);
			System.out.println("conn seccessed");
			String sql = "select*from table1 order by column1 desc";
			pstmt = conn.prepareStatement(sql); // insert, delete 등 여러가지에 따라서 이렇게 불러오는게 다름!!!
			// sql에서 물음표가 없으니 set이필요없지 1!!
			rs = pstmt.executeQuery();
			System.out.println("rs:" + rs);

			while (rs.next()) { // rs.next(): 읽어 올 행이 있으면 true 읽어올 행이 없으면 false
				Test01VO vo = new Test01VO();
				 vo.setColumn1(rs.getInt("column1"));
				 vo.setColumn2(rs.getString("column2"));
				 vo.setColumn3(rs.getString("column3"));
				 vo.setColumn4(rs.getString("column4"));
				 vo.setColumn5(rs.getString("column5"));
				
				vos.add(vo);
				
				// 이건 8번 컬럼의 데이터가 잘나오는지 확인할 뿐. 굳이 지금의 코딩에선 확인만할뿐 필요하지 않음.
				
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
