package com.algorithms.java2novice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SwapIntegerTest {
	private SwapInteger swapInteger;
	
	@Before
	public void setUp() throws Exception {
		this.swapInteger = new SwapInteger();
	}

	@Test
	public void test() {
		assertArrayEquals(new int[]{10,1},this.swapInteger.swap(1,10));
	}

}
