package ru.test.strings;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author dl
 * @date 23.09.2024 21:08
 */
public class StringInvert {
	public String invertWithSpaces(String st) {
		StringBuilder result = new StringBuilder();
		String[] tmp = st.split("\\s+");
		for (int i = 0; i < tmp.length; i++) {
			String string = tmp[i];
			StringBuilder tmpRes = new StringBuilder();
			for (int j = string.length() - 1; j >= 0; j--) {
				if (!Character.isWhitespace(string.charAt(j))) {
					tmpRes.append(string.charAt(j));
				}
			}
			if (i < tmp.length - 1) {
				result.append(tmpRes).append(" ");
			} else {
				result.append(tmpRes);
			}
		}
		return result.toString();
	}

	public String invertWithSpacesWithStringBuilder(String st) {
		StringBuilder result = new StringBuilder();
		String[] tmp = st.split("\\s+");
		for (int i = 0; i < tmp.length; i++) {
			String string = new StringBuilder(tmp[i])
					.reverse()
					.toString();
			if (i < tmp.length - 1) {
				result.append(string).append(" ");
			} else {
				result.append(string);
			}
		}

		return result.toString();
	}

	public String stringInvertWithSpacesWithStringApi(String st) {
		return Arrays.stream(st.split("\\s+"))
				.map(string -> new StringBuilder(string)
						.reverse()
						.toString())
				.collect(Collectors.joining(" "));
	}

	public String invertWithAnySymbol(String st, String separator) {
		String result;
		List<String> validSeparators = List.of(".", ",", "!", "?", ";");
		if (validSeparators.contains(separator)) {
			result = Arrays.stream(st.split(separator))
					.map(string -> new StringBuilder(string).reverse().toString().replaceAll("\\s+", ""))
					.collect(Collectors.joining(" "));
		} else {
			result = "Non valid separator";
		}
		return result;
	}

	public String stringInvertWithSpacesWithStringApiAndReverseWordOrder(String st) {
		List<String> strings = new ArrayList<>(Arrays.stream(st.split("\\s+"))
				.map(string -> new StringBuilder(string)
						.reverse()
						.toString())
				.toList());
		Collections.reverse(strings);

		return String.join(" ", strings);
	}
}
