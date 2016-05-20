package net.markenwerk.commons.nulls;

import java.io.IOException;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class NullOutputStreamTests {

	@Test
	@SuppressWarnings("resource")
	public void write_nothing() throws IOException {

		new NullOutputStream().write(0);

	}

	
	@Test
	public void close_nothing() throws IOException {

		new NullOutputStream().close();

	}

}
