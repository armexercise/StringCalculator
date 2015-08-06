package co.uk.arm.exercise.validator;

import java.util.List;

/**
 * Validator to validate the input numbers
 * 
 * @author PP
 *
 */
public interface Validator {

	/**
	 * Check if any numbers is the list are invalid (negative numbers)
	 * 
	 * @param numbers nums to check
	 * @return list of valid numbers 
	 * @throws NegativeNumberNotSupportedException throws exception in case of any invalid number
	 */
	List<Integer> validate(List<Integer> numbers) throws NegativeNumberNotSupportedException;

}
