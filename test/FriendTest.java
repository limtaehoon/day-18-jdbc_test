package com.test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import com.Friend.Friend;
import com.Friend.FriendDAOImpl;

public class FriendTest {
	
		private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";			//����� �Է�
		private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";		//�������� �Է� 
		private static final String USER = "scott";										//����� �̸� �Է�
		private static final String	PW = "1234";										//����� ��й�ȣ �Է�
//DB ���� �׽�Ʈ
		@Test																//junit ����� ���� �ۼ� 				
		public void connectionTest() throws Exception {		
			Class.forName(DRIVER);											//Ŭ���� :�����
			
			try (Connection con
				=DriverManager.getConnection(URL,USER , PW)){//����ҿ� ����( ���,����,��й�ȣ)
				System.out.println(con);										//���
			} catch (Exception e) {										//���� ó�� (������ ���� ���
				// TODO: handle exception
				e.printStackTrace();
	
			}
		
	}
//�߰� 
@Test
public void  insertTest() {
			FriendDAOImpl dao = new FriendDAOImpl();
			Friend f =new Friend();
			f.setAddr("�λ� ����");  
			f.setBirth("2020-02-20");
			f.setName("�̼���");
			f.setPhone("010-1235-1235");			
			dao.friendInsert(f);
	
}
//�󼼺���
@Test
public void detailTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	assertEquals("�̼���", dao.friendDetail(20).getName());
}
//����
@Test
public void updateTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	Friend f = new Friend();
	f.setName("������");
	f.setNum(19);
	dao.friendUpdate(f);
}
//����
public void deleteTest() {
	FriendDAOImpl dao = new FriendDAOImpl();
	dao.friendDelete(6);
}

		
}
