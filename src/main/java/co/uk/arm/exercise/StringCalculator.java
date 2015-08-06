package co.uk.arm.exercise;

import java.util.List;

import co.uk.arm.exercise.extractor.Extractor;
import co.uk.arm.exercise.extractor.NumberExtractor;

/**
 * String Calculator (A simple Test Driven Development exercise)
 *
 * @author pp
 */
public class StringCalculator {

	private final Extractor extractor;

	public StringCalculator() {
		extractor = new NumberExtractor();
	}

	/**
	 * Returns 0 for empty String and returns the same number if case of single number
	 * or sum of two numbers in case of two numbers 
	 * 
	 * @param string
	 *            numbers
	 * @return total
	 */
	public int add(String numberString) {
		List<Integer> numberList = extractor.extract(numberString);
		int total = 0;
		for (int number : numberList) {
			total += number;
		}
		return total;
	}

}
