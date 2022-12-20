package org.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test
	public void testB1() {
		Assert.assertTrue(false,"verify usernane");
		System.out.println("TestB1");
		}
	@Test
	public void testB2() {
		System.out.println("TestB2");
		}
	@Test
	public void testB3() {
		System.out.println("TestB3");

	}

}
