package co.uk.arm.exercise;

import org.apache.commons.lang3.StringUtils;

/**
 * String Calculator (A simple Test Driven Development exercise)
 *
 * @author pp
 */
public class StringCalculator {

	
	/**
	 * Returns 0 for empty String and returns the same number if case of single number
	 * 
	 * @param string
	 *            numbers
	 * @return total
	 */
	public int add(String string) {
		int total = 0;
		if (StringUtils.isEmpty(string)) {
			total = 0;
		} else if (StringUtils.isNumeric(string)) {
			total = Integer.parseInt(string);
		}
		return total;
	}

}
