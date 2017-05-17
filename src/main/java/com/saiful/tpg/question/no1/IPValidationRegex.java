package com.saiful.tpg.question.no1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidationRegex {
	private static final String REGEX = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

	public static boolean validate(String input) {
		Pattern pattern = Pattern.compile(REGEX);
		Matcher matcher = pattern.matcher(input);
		return matcher.find();

	}

}
