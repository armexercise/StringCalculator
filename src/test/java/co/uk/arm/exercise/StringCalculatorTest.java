package co.uk.arm.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import co.uk.arm.exercise.validator.NegativeNumberNotSupportedException;

/**
 * String Calculator Test Class
 * 
 * 1. Add a test to an empty String
 * 2. Add a test to one number as String
 * 3. Add tests to add two numbers
 * 4. Add a test for null input
 * 5. Add test for new line
 * 6. Add test for more different delimiters
 * 7. Add tests for negative numbers
 * 8. Test Big Numbers
 * 9. Test variable length delimiters
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
	public void add_WithEmptyParam_Zero() throws NegativeNumberNotSupportedException {
		int result = calculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void add_WithOneParam_OneNumber() throws NegativeNumberNotSupportedException {
		int result = calculator.add("5");
		assertEquals(5, result);
	}

	@Test
	public void add_WithTwoParams_Sum() throws NegativeNumberNotSupportedException {
		int result = calculator.add("5,10");
		assertEquals(15, result);
	}

	@Test
	public void add_WithNullParam_Zero() throws NegativeNumberNotSupportedException {
		int result = calculator.add(null);
		assertEquals(0, result);
	}

	// @Test
	public void add_WithThreeParamAndNewLine_Sum() throws NegativeNumberNotSupportedException {
		int result = calculator.add("1\n2,3");
		assertEquals(6, result);
	}

	@Test
	public void add_WithThreeParamAndDifferentDelimeters_Sum() throws NegativeNumberNotSupportedException {
		int result = calculator.add(";\n1;2");
		assertEquals(3, result);
	}

	@Test
	public void add_WithThreeParamAndDifferentDelimeters2_Sum() throws NegativeNumberNotSupportedException {
		int result = calculator.add("#\n1#2");
		assertEquals(3, result);
	}

	@Test(expected = NegativeNumberNotSupportedException.class)
	public void add_WithNegativeNumber_ThrowsException() throws NegativeNumberNotSupportedException {
		calculator.add("-10");
	}

	@Test(expected = NegativeNumberNotSupportedException.class)
	public void add_WithNegativeNumbers_ThrowsException() throws NegativeNumberNotSupportedException {
		calculator.add("2, -10");
	}

	@Test
	public void add_WithNumberGreaterThanMax_SumZero() throws NegativeNumberNotSupportedException {
		int result = calculator.add("1200");
		assertEquals(0, result);
	}

	@Test
	public void add_WithNumberAndNumberGreaterThanMax_SumIgnoringBigNumber() throws NegativeNumberNotSupportedException {
		int result = calculator.add("22,1200");
		assertEquals(22, result);
	}

	@Test
	public void add_WithNumbersAndNumberGreaterThanMax_SumIgnoringBigNumber() throws NegativeNumberNotSupportedException {
		int result = calculator.add("10,22,1200");
		assertEquals(32, result);
	}

	@Test
	public void add_WithThreeParamAndBigLengthDelimeters_Sum() throws NegativeNumberNotSupportedException {
		int result = calculator.add("##\n1##2");
		assertEquals(3, result);
	}
}
