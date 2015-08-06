package co.uk.arm.exercise.validator;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * NumberValidatorTest
 * 
 * 1. check for nulls
 * 2. validate max number
 * 3. validate along wit max number
 * 4. validate negative numbers
 * 
 * @author PP
 *
 */
public class NumberValidatorTest {

	private NumberValidator validator;

	private List<Integer> numberList;

	@Before
	public void setUp() {
		validator = new NumberValidator();
		numberList = new ArrayList<Integer>();
	}

	@Test
	public void validate_WithNullParam_EmptyList() throws NegativeNumberNotSupportedException {
		List<Integer> result = validator.validate(null);
		assertEquals(Collections.EMPTY_LIST, result);
	}

	@Test
	public void extract_WithOnlyMaxNumber_EmptyList() throws NegativeNumberNotSupportedException {
		numberList.add(1025);
		List<Integer> result = validator.validate(numberList);
		assertEquals(Collections.EMPTY_LIST, result);
	}

	@Test
	public void extract_WithMaxNumber_EmptyList() throws NegativeNumberNotSupportedException {
		numberList.add(1025);
		numberList.add(10);
		List<Integer> result = validator.validate(numberList);
		assertEquals(10, (int) result.get(0));
	}

	@Test(expected = NegativeNumberNotSupportedException.class)
	public void extract_WithNegativeNumbers_ValidationException() throws NegativeNumberNotSupportedException {
		numberList.add(-2015);
		numberList.add(-58);
		validator.validate(numberList);
	}
}
