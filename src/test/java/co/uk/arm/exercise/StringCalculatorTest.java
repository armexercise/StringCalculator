package co.uk.arm.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * String Calculator Test Class
 * 
 * 1. Add a test to an empty String
 * 2. Add a test to one number as String
 * 3. Add tests to add two numbers
 * 4. Add a test for null input
 * 5. Add test for new line
 * 6. Add test for different delimiters
 * 
 * @author pp
 */
public class StringCalculatorTest {

	private StringCalculator calculator;

	@Before
	public void setUp() {
		calculator = new StringCalculator();
	}

	@Test
	public void add_WithEmptyParam_Zero() {
		int result = calculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void add_WithOneParam_OneNumber() {
		int result = calculator.add("5");
		assertEquals(5, result);
	}

	@Test
	public void add_WithTwoParams_Sum() {
		int result = calculator.add("5,10");
		assertEquals(15, result);
	}

	@Test
	public void add_WithNullParam_Zero() {
		int result = calculator.add(null);
		assertEquals(0, result);
	}

	@Test
	public void add_WithThreeParamAndNewLine_Sum() {
		int result = calculator.add("1\n2,3");
		assertEquals(6, result);
	}

	@Test
	public void add_WithThreeParamAndDifferentDelimeters_Sum() {
		int result = calculator.add(";\n1;2");
		assertEquals(3, result);
	}

	@Test
	public void add_WithThreeParamAndDifferentDelimeters2_Sum() {
		int result = calculator.add("#\n1#2");
		assertEquals(3, result);
	}
}
