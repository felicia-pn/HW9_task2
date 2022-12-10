import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		int expected = 5+11;
		int output = calculator.add(5, 11);
		assertEquals(expected, output);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		int expected = 11-5;
		int output = calculator.sub(11, 5);
		assertEquals(expected, output);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		int expected = 4*3;
		int outcome = calculator.multiply(4,3);
		assertEquals(expected, outcome);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		float expected = 12/4;
		float outcome = calculator.divide(12, 4);
		assertEquals(expected, outcome);
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			calculator.divide(10,0);
		});

		String outcome = exception.getMessage();
		assertTrue(outcome.contains("ZeroDivisionError"));
	}
}
