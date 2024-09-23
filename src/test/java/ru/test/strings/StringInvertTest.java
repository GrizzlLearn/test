package ru.test.strings;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * @author dl
 * @date 23.09.2024 21:15
 */
public class StringInvertTest {
	@Test
	public void invertWithSpacesTest1() {
		StringInvert si = new StringInvert();
		String string = "public static void main";
		String expected = "cilbup citats diov niam";
		assertThat(si.invertWithSpaces(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithSpacesTest2() {
		StringInvert si = new StringInvert();
		String string = "private String      name";
		String expected = "etavirp gnirtS eman";
		assertThat(si.invertWithSpaces(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithSpacesTest3() {
		StringInvert si = new StringInvert();
		String string = "int count = 0    ";
		String expected = "tni tnuoc = 0";
		assertThat(si.invertWithSpaces(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithSpacesWithStringBuilder1() {
		StringInvert si = new StringInvert();
		String string = "public static void main";
		String expected = "cilbup citats diov niam";
		assertThat(si.invertWithSpacesWithStringBuilder(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithSpacesWithStringBuilder2() {
		StringInvert si = new StringInvert();
		String string = "private String name";
		String expected = "etavirp gnirtS eman";
		assertThat(si.invertWithSpacesWithStringBuilder(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithSpacesWithStringBuilder3() {
		StringInvert si = new StringInvert();
		String string = "int count = 0";
		String expected = "tni tnuoc = 0";
		assertThat(si.invertWithSpacesWithStringBuilder(string)).isEqualTo(expected);
	}

	@Test
	public void stringinvertWithSpacesWithStringApi1() {
		StringInvert si = new StringInvert();
		String string = "public static void main";
		String expected = "cilbup citats diov niam";
		assertThat(si.stringInvertWithSpacesWithStringApi(string)).isEqualTo(expected);
	}

	@Test
	public void stringinvertWithSpacesWithStringApi2() {
		StringInvert si = new StringInvert();
		String string = "private String name";
		String expected = "etavirp gnirtS eman";
		assertThat(si.stringInvertWithSpacesWithStringApi(string)).isEqualTo(expected);
	}

	@Test
	public void stringinvertWithSpacesWithStringApi3() {
		StringInvert si = new StringInvert();
		String string = "int count = 0";
		String expected = "tni tnuoc = 0";
		assertThat(si.stringInvertWithSpacesWithStringApi(string)).isEqualTo(expected);
	}

	@Test
	public void invertWithAnySymbol1() {
		StringInvert si = new StringInvert();
		String string = "public;static;void;main";
		String separator = ";";
		String expected = "cilbup citats diov niam";
		assertThat(si.invertWithAnySymbol(string, separator)).isEqualTo(expected);
	}

	@Test
	public void invertWithAnySymbol2() {
		StringInvert si = new StringInvert();
		String string = "public; static ; void;   main";
		String separator = ";";
		String expected = "cilbup citats diov niam";
		assertThat(si.invertWithAnySymbol(string, separator)).isEqualTo(expected);
	}

	@Test
	public void invertWithAnySymbol3ThenExpectedIsNonValid() {
		StringInvert si = new StringInvert();
		String string = "public; static ; void;   main";
		String separator = "%";
		String expected = "Non valid separator";
		assertThat(si.invertWithAnySymbol(string, separator)).isEqualTo(expected);
	}

	@Test
	public void stringInvertWithSpacesWithStringApiAndReverseWordOrder1() {
		StringInvert si = new StringInvert();
		String string = "public static void main";
		String expected = "niam diov citats cilbup";
		assertThat(si.stringInvertWithSpacesWithStringApiAndReverseWordOrder(string)).isEqualTo(expected);
	}
}
