package co.uk.arm.exercise;

import static org.junit.Assert.assertEquals;

import javax.xml.bind.ValidationException;

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
	public void add_WithEmptyParam_Zero() throws ValidationException {
		int result = calculator.add("");
		assertEquals(0, result);
	}
}
