package co.uk.arm.exercise.extractor;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * NumberExtractorTest
 * 1. Add a test to extract with empty string
 * 2. Add a test to extract with null string
 * 3. Add a test to extract without any numbers in the string
 * 4. Add a test to extract the numbers correctly 
 * 
 * @author PP
 *
 */
public class NumberExtractorTest {

	private Extractor extractor;

	@Before
	public void setUp() {
		extractor = new NumberExtractor();
	}

	@Test
	public void extract_WithEmptyParam_EmptyList() {
		List<Integer> result = extractor.extract("");
		assertEquals(Collections.EMPTY_LIST, result);
	}

	@Test
	public void extract_WithNullParam_EmptyList() {
		List<Integer> result = extractor.extract(null);
		assertEquals(Collections.EMPTY_LIST, result);
	}

	@Test
	public void extract_WithoutNumbers_EmptyList() {
		List<Integer> result = extractor.extract("abCD");
		assertEquals(Collections.EMPTY_LIST, result);
	}

	@Test
	public void extract_WithNumbers_ExpectedList() {
		List<Integer> result = extractor.extract("94,34,56,7,8");
		assertEquals(5, result.size());
	}

	@Test
	public void extract_WithNumbersAndNewDelimeter_ExpectedList() {
		List<Integer> result = extractor.extract("\"\n1\"2");
		int total = 0;
		for (int number : result) {
			total += number;
		}
		assertEquals(3, total);
	}
}
