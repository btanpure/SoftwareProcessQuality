package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import stack.Stack;

public class PopTestCase {

	Stack stack = new Stack(5);
  	
	  @Before
	  public void setup()
	  {
	    stack = new Stack(5);
	  }
	
	  @Test public void testPop() 
	  { 
		  System.out.println("\nTesting pop for integer...");
		  stack.push(5);
		  assertEquals(5, stack.pop());
	  }
	  
	  @Test (expected = ArrayIndexOutOfBoundsException.class) 
	  public void testUnderflow() 
	  { 
		
		  System.out.println("\nTesting underflow condition");
		  stack.push(20);
		  stack.pop();
		  stack.pop();
		  assertEquals("zero",  0);
	  }
}
