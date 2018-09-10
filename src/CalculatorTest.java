import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	@Test
	public void addTwoIntegers() {
		Calculator calc = new Calculator();

		int a = 3;
		int b = 4;
		double result = calc.add(a, b);

		assertEquals(result, 7);
	}

	@Test
	public void addTwoDoubles() {
		Calculator calc = new Calculator();

		double result = calc.add(64.5, 84.7);
		assertEquals(result, 149.2);
	}
	
	@Test
	public void addTwoNegative() {
		Calculator calc2 = new Calculator();

		double result = calc2.add(-45.0, -78.9);
		assertEquals("2 negatives result is incorrect.",result, -123.9);
	}
}
