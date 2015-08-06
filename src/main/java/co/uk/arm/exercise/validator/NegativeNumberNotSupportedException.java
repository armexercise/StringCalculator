package co.uk.arm.exercise.validator;

import java.util.List;

/**
 * NegativeNumberNotSupportedException
 * 
 * @author PP
 *
 */
public class NegativeNumberNotSupportedException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final String EXCEPTION = "Negatives Not Allowed";

	private final List<Integer> numbers;

	public NegativeNumberNotSupportedException(List<Integer> pNumbers) {
		this.numbers = pNumbers;
	}

	public static String getExceptionName() {
		return EXCEPTION;
	}

	@Override
	public String getMessage() {
		return EXCEPTION + numbers.toString();
	}

}
