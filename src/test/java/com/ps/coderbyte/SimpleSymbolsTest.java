package com.ps.coderbyte;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ps.coderbyte.SimpleSymbols;

public class SimpleSymbolsTest {
	private SimpleSymbols simpleSymbols;

	@Before
	public void setUp() throws Exception {
		this.simpleSymbols = new SimpleSymbols();
	}

	@Test
	public void test() {
		String result = this.simpleSymbols.test("f++d+");
		assertEquals("true", result);
		
	}

}
