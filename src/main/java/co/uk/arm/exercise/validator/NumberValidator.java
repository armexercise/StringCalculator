package co.uk.arm.exercise.validator;

import java.util.LinkedList;
import java.util.List;

/**
 * NumberValidator
 * 
 * @author PP
 *
 */
public class NumberValidator implements Validator {

	private static final int MAX_NUMBER = 1000;

	@Override
	public List<Integer> validate(List<Integer> numberList) throws NegativeNumberNotSupportedException {
		List<Integer> result = new LinkedList<Integer>();
		if (numberList != null) {
			for (Integer number : numberList) {
				if (number < 0) {
					throw new NegativeNumberNotSupportedException(numberList);
				} else if (number < MAX_NUMBER) {
					result.add(number);
				}
			}
		}
		return result;
	}
}
