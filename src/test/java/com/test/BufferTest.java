package com.test;

import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

public class BufferTest {
	
	public int number;
	public Buffet buf;
	
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
	}
	
	@Test
	public void getNumberForSetNumber3() {
		this.number = 3;
		
		int expected = 3;
		buf.setNumber(this.number);
		int actual = 3;
	}
	
	@Test
	public void getNumberForSetNumber5() {
		this.number = 5;
		
		int expected = 5;
		buf.setNumber(this.number);
		int actual = 3;
	}
}
