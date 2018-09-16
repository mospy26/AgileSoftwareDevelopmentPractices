import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	@Test
	public void addTwoIntegers() {
		Calculator calc = new Calculator();

		int a = 3;
		int b = 4;
		double result = calc.add(a, b);

		assertEquals(result, 7, "4 + 3 should be 7");
	}

	@Test
	public void addTwoDoubles() {
		Calculator calc = new Calculator();

		double result = calc.add(64.5, 84.7);
		assertEquals(result, 149.2, "64.5 + 84.7 should be 149.2");
	}

	@Test
	public void addTwoNegative() {
		Calculator calc = new Calculator();

		double result = calc.add(-45.0, -78.9);
		assertEquals(result, -123.9, "-45.0 + (-78.9) should be -123.9");
	}

	@Test
	public void addNegativePositive() {
		Calculator calc = new Calculator();

		double result = calc.add(420, -1234);
		assertEquals(result, -814, "420 plus (-1234) should be -814");
	}

	@Test
	public void addTwoDecimalPlaces() {
		Calculator calc = new Calculator();

		double result = calc.add(150.52, 150.21);
		assertEquals(result, 300.73, "150.52 + 150.21 should be 300.73");
	}

	@Test
	public void subtractionTwoIntegers(){

		Calculator calc = new Calculator();

		double result = calc.subtraction(50.0,20.0);
		assertEquals(result, 30.0," 50.0 - 20.0 should be 30.0");

	}

	@Test
	public void subtractionTwoDoubles() {
		Calculator calc = new Calculator();

		double result = calc.subtraction(100.8, 58.3);
		assertEquals(result, 42.5, "100.8 - 58.3 should be 42.5");
	}

	@Test
	public void subtractionNegativePositive() {
		Calculator calc = new Calculator();

		double result = calc.subtraction(50.0, -50.0);
		assertEquals(result, 100.0, "50.0 - -50.0 should be 100.0");
	}
}
