package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.analyser.RetryAnalyzer;

public class MyTests {
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals(true, false);
	}
	
}
