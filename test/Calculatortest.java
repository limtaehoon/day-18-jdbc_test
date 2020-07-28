package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calculator.calculator;

public class Calculatortest {

@Test//3��
public void testSum() {
	calculator cal = new calculator();
	assertEquals(30, cal.sum(20, 10));
	System.out.println("test1");
}
@Test//6��
public void testSum1() {
	calculator cal = new calculator();
	assertEquals(60, cal.sum(50, 10));
	System.out.println("test2");
	
}
@BeforeClass//1��
public static void beforeTest() {//�ϱ���
	System.out.println("beforeclass");
}
@Before //2��//5��
public void setUp() {//�ϱ� ������
	System.out.println("Before setUp");
}
@After//4��
public void tearDown() {//�� �ĸ��� 
	System.out.println("AftertearDown");
}
@AfterClass//7�� 
public static void AfterTest() {//�ϰ���
	System.out.println("Afterclass");
}
//@BeforeClass>@Before>@Test>@After>@Before>@Test2>@After>@AfterClass



}
