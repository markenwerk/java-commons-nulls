package net.markenwerk.commons.nulls;

import java.io.IOException;

import org.junit.Test;

@SuppressWarnings("javadoc")
public class NullWriterTests {

	@Test
	@SuppressWarnings("resource")
	public void write_nothing() throws IOException {

		new NullWriter().write(new char[0], 0, 0);

	}

	@Test
	@SuppressWarnings("resource")
	public void flush_nothing() throws IOException {

		new NullWriter().flush();

	}

	@Test
	public void close_nothing() throws IOException {

		new NullWriter().close();

	}

}
