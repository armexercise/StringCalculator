package co.uk.arm.exercise;

import org.apache.commons.lang3.StringUtils;

/**
 * String Calculator (A simple Test Driven Development exercise)
 *
 * @author pp
 */
public class StringCalculator {

	/**
	 * Returns 0 for empty String
	 * 
	 * @param string
	 *            numbers
	 * @return total
	 */
	public int add(String string) {
		int total = 0;
		if (StringUtils.isEmpty(string)) {
			total = 0;
		}
		return total;
	}

}
