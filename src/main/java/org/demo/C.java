package org.demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class C {
	@Test
	public void testB1() {
		System.out.println("Testc1");
		}
	@Test
	public void testB2() {
		System.out.println("TestC2");
		}
	@Ignore
	@Test
	public void testB3() {
		System.out.println("TestC3");

	}

}
