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

	@Override
	public List<Integer> validate(List<Integer> numberList) throws NegativeNumberNotSupportedException {
		List<Integer> result = new LinkedList<Integer>();
		if (numberList != null) {
			for (Integer number : numberList) {
				if (number < 0) {
					throw new NegativeNumberNotSupportedException(numberList);
				} else {
					result.add(number);
				}
			}
		}
		return result;
	}
}
