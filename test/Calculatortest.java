package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.calculator.calculator;

public class Calculatortest {

@Test//3번
public void testSum() {
	calculator cal = new calculator();
	assertEquals(30, cal.sum(20, 10));
	System.out.println("test1");
}
@Test//6번
public void testSum1() {
	calculator cal = new calculator();
	assertEquals(60, cal.sum(50, 10));
	System.out.println("test2");
	
}
@BeforeClass//1번
public static void beforeTest() {//하기전
	System.out.println("beforeclass");
}
@Before //2번//5번
public void setUp() {//하기 전마다
	System.out.println("Before setUp");
}
@After//4번
public void tearDown() {//한 후마다 
	System.out.println("AftertearDown");
}
@AfterClass//7번 
public static void AfterTest() {//하고난후
	System.out.println("Afterclass");
}
//@BeforeClass>@Before>@Test>@After>@Before>@Test2>@After>@AfterClass



}
