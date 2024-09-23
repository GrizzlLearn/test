package ru.test.converter;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * @author dl
 * @date 23.09.2024 22:30
 */
public class ConverterTest {
	@Test
	public void convertToDouble() {
		Converter con = new Converter();
		String string = "123.12";
		Double expected = 123.12d;
		assertThat(con.convertTo(string, Double.class)).isEqualTo(expected);
	}

	@Test
	public void convertToInteger() {
		Converter con = new Converter();
		String string = "123";
		Integer expected = 123;
		assertThat(con.convertTo(string, Integer.class)).isEqualTo(expected);
	}

	@Test
	public void convertToLong() {
		Converter con = new Converter();
		String string = "123";
		Long expected = 123L;
		assertThat(con.convertTo(string, Long.class)).isEqualTo(expected);
	}

	@Test
	public void convertToFloat() {
		Converter con = new Converter();
		String string = "123.12";
		Float expected = 123.12f;
		assertThat(con.convertTo(string, Float.class)).isEqualTo(expected);
	}
}
