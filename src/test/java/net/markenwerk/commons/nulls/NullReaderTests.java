package net.markenwerk.commons.nulls;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("javadoc")
public class NullReaderTests {

	@Test
	@SuppressWarnings("resource")
	public void read_nothing() throws IOException {

		Assert.assertEquals(-1, new NullReader().read());

	}

	@Test
	public void close_nothing() throws IOException {

		new NullReader().close();

	}

}
