package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day7_2 {

		int a=20;
		int b=10;
	  @Test(priority=1)
	  public void add() 
	  {
			  int sum=a+b;
			  Assert.assertEquals(sum,30);
	  }
	  @Test(priority=3)
	  public void sub() 
	  {
			  int sum=a-b;
			  Assert.assertEquals(sum,10);
	  }
	  @Test(priority=4)
	  public void mul() 
	  {
			  int sum=a*b;
			  org.testng.Assert.assertEquals(sum,200);
	  }
	  @Test(priority=2)
	  public void div() 
	  {
			  int sum=a/b;
			  org.testng.Assert.assertEquals(sum,2);
	  }
	
}
