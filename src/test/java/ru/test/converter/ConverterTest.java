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
		Class<Double> targetType = Double.class;
		assertThat(con.convertTo(string, targetType)).isEqualTo(expected);
	}

	@Test
	public void convertToInteger() {
		Converter con = new Converter();
		String string = "123";
		Integer expected = 123;
		Class<Integer> targetType = Integer.class;
		assertThat(con.convertTo(string, targetType)).isEqualTo(expected);
	}

	@Test
	public void convertToLong() {
		Converter con = new Converter();
		String string = "123";
		Long expected = 123L;
		Class<Long> targetType = Long.class;
		assertThat(con.convertTo(string, targetType)).isEqualTo(expected);
	}

	@Test
	public void convertToFloat() {
		Converter con = new Converter();
		String string = "123.12";
		Float expected = 123.12f;
		Class<Float> targetType = Float.class;
		assertThat(con.convertTo(string, targetType)).isEqualTo(expected);
	}

	@Test
	public void convertToBooleanThenThrowExceprion() {
		Converter con = new Converter();
		String string = "1";
		Integer expected = 1;
		Class<Boolean> targetType = Boolean.class;
		assertThatThrownBy(() -> con.convertTo(string, Boolean.class))
				.isInstanceOf(IllegalArgumentException.class)
				.hasMessage("Unsupported type: " + targetType);
	}
}
