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

	private static final String NEW_LINE_DELIMITER = "\n";
	private static final String DELIMITER = ",\n";

	@Override
	public List<Integer> extract(String inputString) {
		List<Integer> resultList = new LinkedList<Integer>();
		if (!StringUtils.isEmpty(inputString)) {

			StringTokenizer newLineTokenizer = new StringTokenizer(inputString, NEW_LINE_DELIMITER);

			String delimiter = DELIMITER;

			if (newLineTokenizer.countTokens() > 1) {
				delimiter = newLineTokenizer.nextToken();
			}

			StringTokenizer tokenizer = new StringTokenizer(inputString, delimiter);

			while (tokenizer.hasMoreTokens()) {
				String element = tokenizer.nextToken().trim();
				if (StringUtils.isNumeric(element)) {
					int nextElement = Integer.parseInt(element);
					resultList.add(nextElement);
				}
			}
		}
		return resultList;
	}
}
