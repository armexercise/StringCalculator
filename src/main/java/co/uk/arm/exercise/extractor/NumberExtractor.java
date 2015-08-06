package co.uk.arm.exercise.extractor;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * NumberExtractor to extract numbers from string
 * 
 * @author PP 
 *
 */ 
public class NumberExtractor implements Extractor {

	private static final Pattern PATTERN = Pattern.compile("-?[0-9]+");

	@Override
	public List<Integer> extract(String inputString) {
		List<Integer> resultList = new LinkedList<Integer>();
		if (!StringUtils.isEmpty(inputString)) {
			Matcher matcher = PATTERN.matcher(inputString);
			while (matcher.find()) {
				int number = Integer.parseInt(matcher.group());
				resultList.add(number);
			}
		}
		return resultList;
	}
}
