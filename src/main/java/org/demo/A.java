package org.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {
	@Test
	public void testA1() {
		System.out.println("TestA1");
		}
	@Test
	public void testA2() {
		System.out.println("TestA2");
		}
	@Test
	public void testA3() {
		Assert.assertTrue(false,"Verify username");
		System.out.println("TestA3");

	}

}
