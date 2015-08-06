package co.uk.arm.exercise;

import java.util.List;

import co.uk.arm.exercise.extractor.Extractor;
import co.uk.arm.exercise.extractor.NumberExtractor;
import co.uk.arm.exercise.validator.NegativeNumberNotSupportedException;
import co.uk.arm.exercise.validator.NumberValidator;
import co.uk.arm.exercise.validator.Validator;

/**
 * String Calculator (A simple Test Driven Development exercise)
 * 
 * @author pp
 */
public class StringCalculator {

	private final Extractor extractor;
	private final Validator validator;

	public StringCalculator() {
		extractor = new NumberExtractor();
		validator = new NumberValidator();
	}

	/**
	 * Returns 0 for empty String and returns the same number if case of single number
	 * or sum of two numbers in case of two numbers.
	 * Also validates the numbers
	 * 
	 * @param string
	 *            numbers
	 * @return total
	 */
	public int add(String numberString) throws NegativeNumberNotSupportedException {
		List<Integer> numberList = extractor.extract(numberString);
		numberList = validator.validate(numberList);
		int total = 0;
		for (int number : numberList) {
			total += number;
		}
		return total;
	}
}
