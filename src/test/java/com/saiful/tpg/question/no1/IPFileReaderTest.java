package com.saiful.tpg.question.no1;

import java.net.URL;

import org.junit.Test;

import com.saiful.tpg.question.no1.IPFileReader;

public class IPFileReaderTest {
	@Test
	public void testSuccessfullReadFile() {
		URL url = this.getClass().getResource("/IP.txt");
		new IPFileReader().readFile(url.getFile());

	}

}
