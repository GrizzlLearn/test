package ru.test.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author dl
 * @date 23.09.2024 22:29
 */
public class Converter {
	private static final Map<Class<?>, Function<String, ?>> converters = new HashMap<>();

	static {
		converters.put(Integer.class, Integer::valueOf);
		converters.put(Double.class, Double::valueOf);
		converters.put(Long.class, Long::valueOf);
		converters.put(Float.class, Float::valueOf);
	}

	@SuppressWarnings("unchecked")
	public <T> T convertTo(String value, Class<T> targetType) {
		Function<String, ?> converter = converters.get(targetType);

		if (converter == null) {
			throw new IllegalArgumentException("Unsupported type: " + targetType);
		}

		return (T) converter.apply(value);
	}
}
