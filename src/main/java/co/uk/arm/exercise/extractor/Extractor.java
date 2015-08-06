package co.uk.arm.exercise.extractor;

import java.util.List;

/**
 * Interface to define methods for processing string
 * 
 * @author PP
 *
 */
public interface Extractor {

	/**
	 * Process and extract numbers from String
	 * 
	 * @param string
	 *            number string
	 * @return list of numbers extracted
	 */
	List<Integer> extract(final String string);

}
