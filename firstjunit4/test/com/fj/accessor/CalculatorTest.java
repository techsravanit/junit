package com.fj.accessor;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator cal;
	
	@Before
	public void fixture(){
		cal=new Calculator();
	}
	
	@Test
	public void Add(){
		int a=10;
		int b=20;
		int estimatedsum=30;
		int actualsum=0;
		
		actualsum=cal.add(a, b);
		assertEquals(estimatedsum, actualsum);
	}
	
	@After
	public void shudown(){
		cal=null;
	}	
}
