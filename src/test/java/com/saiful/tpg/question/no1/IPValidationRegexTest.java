package com.saiful.tpg.question.no1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.saiful.tpg.question.no1.IPValidationRegex;

public class IPValidationRegexTest {

	@Test
	public void testCorrectIP() {
		String input = "192.168.0.1";
		boolean result = IPValidationRegex.validate(input);
		assertThat(result, is(true));

	}

	@Test
	public void testInvalidIP() {
		String input = "257.168.0.1";
		boolean result = IPValidationRegex.validate(input);
		assertThat(result, is(false));

	}

	@Test
	public void testCorrectSingleNumberIP() {
		String input = "8.8.8.1";
		boolean result = IPValidationRegex.validate(input);
		assertThat(result, is(true));

	}

	@Test
	public void testInvalidIPTooLong() {
		String input = "257.168.0.1.99";
		boolean result = IPValidationRegex.validate(input);
		assertThat(result, is(false));

	}

}
