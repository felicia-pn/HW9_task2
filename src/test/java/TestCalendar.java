import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.assertEquals;


class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {1900, 1972, 1956, 1946, 1992})
	public void Should_return_true(int year) {
		// Implement
		GregorianCalendar g = new GregorianCalendar();
		Calendar c = new Calendar(year);
		boolean expected = g.isLeapYear(year);
		boolean actual = c.isLeapYear();
		assertEquals(expected, actual);
	}

	@ParameterizedTest
	@ValueSource(ints = {1825, 1910, 1955, 2002, 2021})
	public void Should_return_false(int year) {
		// Implement
		GregorianCalendar g = new GregorianCalendar();
		Calendar c = new Calendar(year);
		boolean expected = g.isLeapYear(year);
		boolean actual = c.isLeapYear();
		assertEquals(expected, actual);
	}

	/*
	@ParameterizedTest
	@ValueSource()
	public void Should_return_if_year_is_leap(int year) {
		// Implement
	 */

	


	// Create a new method for boundary testing
}
