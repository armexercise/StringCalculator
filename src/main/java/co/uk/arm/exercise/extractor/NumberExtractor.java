package co.uk.arm.exercise.extractor;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;

/**
 * NumberExtractor to extract numbers from string
 * 
 * @author PP
 *
 */
public class NumberExtractor implements Extractor {

	private static final String DELIMITER = ",\n";

	@Override
	public List<Integer> extract(String inputString) {
		List<Integer> resultList = new LinkedList<Integer>();
		if (!StringUtils.isEmpty(inputString)) {

			StringTokenizer tokenizer = new StringTokenizer(inputString, DELIMITER);

			while (tokenizer.hasMoreTokens()) {
				int nextElement = Integer.parseInt(tokenizer.nextToken());
				resultList.add(nextElement);
			}
		}
		return resultList;
	}
}
