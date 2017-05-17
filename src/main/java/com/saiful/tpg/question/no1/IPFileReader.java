package com.saiful.tpg.question.no1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IPFileReader {
	final static Logger LOGGER = LoggerFactory.getLogger(IPFileReader.class);

	public void readFile(String file) {
		LOGGER.info("reading file {}", file);
		try {
			Files.lines(Paths.get(file)).parallel().forEach(this::validateIP);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private void validateIP(String data) {

		if (!IPValidationRegex.validate(data)) {
			System.out.println(data + " - invalid IP");
		}
	}

}
