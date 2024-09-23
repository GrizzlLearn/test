package ru.test.converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author dl
 * @date 23.09.2024 22:29
 */
public class Converter {
	private static final Map<Class<?>, Function<String, ?>> CONVERTERS = new HashMap<>();

	static {
		CONVERTERS.put(Integer.class, Integer::valueOf);
		CONVERTERS.put(Double.class, Double::valueOf);
		CONVERTERS.put(Long.class, Long::valueOf);
		CONVERTERS.put(Float.class, Float::valueOf);
	}

	@SuppressWarnings("unchecked")
	public <T> T convertTo(String value, Class<T> targetType) {
		Optional<Function<String, ?>> optional = Optional.ofNullable(CONVERTERS.get(targetType));

		if (optional.isEmpty()) {
			throw new IllegalArgumentException("Unsupported type: " + targetType);
		}

		return (T) optional.get().apply(value);
	}
}
