package com.test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.Friend.Friend;
import com.Friend.FriendDAOImpl;

public class FriendTest {
	
		private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";			//저장소 입력
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";		//사용자장소 입력 
		private static final String USER = "scott";										//사용자 이름 입력
		private static final String	PW = "1234";										//사용자 비밀번호 입력
//DB 연동 테스트
		@Test																//junit 사용자 위에 작성 				
		public void connectionTest() throws Exception {		
			Class.forName(DRIVER);											//클래스 :저장소
			
			try (Connection con
				=DriverManager.getConnection(URL,USER , PW)){//저장소에 연결( 장소,유저,비밀번호)
				System.out.println(con);										//출력
			} catch (Exception e) {										//예외 처리 (오류시 오류 출력
				// TODO: handle exception
				e.printStackTrace();
	
			}
		
	}
//추가 
@Test
public void  insertTest() {
			FriendDAOImpl dao = new FriendDAOImpl();
			Friend f =new Friend();
			f.setAddr("부산 서면");  
			f.setBirth("2020-02-20");
			f.setName("이순신");
			f.setPhone("010-1235-1235");			
			dao.friendInsert(f);
	
}
//상세보기
@Test
public void detailTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	assertEquals("이순신", dao.friendDetail(20).getName());
}
//수정
@Test
public void updateTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	Friend f = new Friend();
	f.setName("강감찬");
	f.setNum(19);
	dao.friendUpdate(f);
}
//삭제
public void deleteTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	dao.friendDelete(6);
}

		
}
