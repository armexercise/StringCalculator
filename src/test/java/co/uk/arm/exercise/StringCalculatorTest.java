package co.uk.arm.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * String Calculator Test Class
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
}
