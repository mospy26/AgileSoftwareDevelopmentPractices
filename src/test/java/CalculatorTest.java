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
		Calculator calc = new Calculator();

		double result = calc.add(-45.0, -78.9);
		assertEquals(result, -123.9);
	}

	@Test
	public void addNegativePositive() {
		Calculator calc = new Calculator();

		double result = calc.add(420, -1234);
		assertEquals(result, -814);
	}

	@Test
	public void addTwoDecimalPlaces() {
		Calculator calc = new Calculator();

		double result = calc.add(150.52, 150.21);
		assertEquals(result, 300.73);
	}
}
