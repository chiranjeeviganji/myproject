package com.sdet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Apptest 
{
	@Test
	public void testlogin1()
	{
	App myapp=new App();
	Assert.assertEquals(0, myapp.user_login("abc", "abc123"));
	}
	@Test
	public void testlogin2()
	{
		App myapp=new App();
		Assert.assertEquals(1, myapp.user_login("abc", "abc@123"));

	}
}
