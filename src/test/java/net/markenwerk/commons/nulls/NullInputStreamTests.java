package net.markenwerk.commons.nulls;

import java.io.IOException;

import org.junit.Test;

import org.junit.Assert;

@SuppressWarnings("javadoc")
public class NullInputStreamTests {

	@Test
	@SuppressWarnings("resource")
	public void read_nothing() throws IOException {

		Assert.assertEquals(-1, new NullInputStream().read());

	}

}
