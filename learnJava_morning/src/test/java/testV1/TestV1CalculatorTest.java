package testV1;

import org.testng.Assert;
import org.testng.annotations.Test;

import calcV1.Calculator;

public class TestV1CalculatorTest {
	//mini calculator requirement
	//I need calculator to add/sub/mult two numbers and give a result
	//developer must have calculator class
	Calculator cal = new Calculator();
	
	// test for addition
  @Test
  public void addition() {
	  int result = cal.addition(5,6);
	  Assert.assertEquals(result, 11);
  }
  
  // test for subtraction
  @Test
  public void subtruction() {
	  int result = cal.subtruction(5,6);
	  Assert.assertEquals(result, -1);
  }

  // test for multiplying
  @Test
  public void multuply() {
	  int result = cal.multuply(5,0);
	  Assert.assertEquals(result, 0);
  }

}
