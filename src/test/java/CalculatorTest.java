import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
	@Test
	public void useInvalidNumbers() {
		Calculator calc = new Calculator();
		assertThrows(NumberFormatException.class, () -> {
			calc.parseInput("a + b");
		});
	}

	@Test
	public void useInvalidOperator() {
		Calculator calc = new Calculator();
		assertThrows(UnsupportedOperationException.class, () -> {
			calc.parseInput("1 a 2");
		});
	}

	@Test
	public void useEmptyString() {
		Calculator calc = new Calculator();
		assertThrows(IllegalArgumentException.class, () -> {
			calc.parseInput("");
		});
	}

	@Test
	public void useValidInput() {
		Calculator calc = new Calculator();

		double result = calc.parseInput("5 * 8");
		assertEquals(result, 40, "Method should have returned value 40");
	}

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
	public void multiplyTwoNumbers() {
		Calculator calc = new Calculator();

		double result = calc.multiply(2.0, 3.0);
		assertEquals(result, 6.0, "2.0 * 3.0 should be 6.0");
	}

	@Test
	public void multiplyTwoDoubles() {
		Calculator calc = new Calculator();

		double result = calc.multiply(12.4, 19.8);
		assertEquals(result, 245.52, "12.4 * 19.8 should be 245.52");
	}

	@Test
	public void multiplyWithZero() {
		Calculator calc = new Calculator();

		double result = calc.multiply(912.41, 0);
		assertEquals(result, 0, "Anything multiplied by 0 should be 0");
	}

	@Test
	public void multiplyTwoNegatives() {
		Calculator calc = new Calculator();

		double result = calc.multiply(-4.5, -9.2);
		assertEquals(result, 41.4, "-4.5 * -9.2 should be 41.4");
	}

	@Test
	public void subtractionTwoIntegers() {
		Calculator calc = new Calculator();

		double result = calc.subtraction(50, 20);
		assertEquals(result, 30," 50 - 20 should be 30");
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

	@Test
	public void subtractionZeroNegativeIsPositive() {
		Calculator calc = new Calculator();

		double result = calc.subtraction(0, -4);
		assertEquals(result, 4, "0-(-4) should be 4");
	}

	@Test
	public void divideByZero() {
		Calculator calc = new Calculator();

		assertThrows(ArithmeticException.class, () -> {
			calc.divide(7, 0);
		});
	}

	@Test
	public void divideTwoIntegers() {
		Calculator calc = new Calculator();

		double result = calc.divide(10, 2);
		assertEquals(result, 5, "10/2 should be 5");
	}

	@Test
	public void divideTwoNegatives() {
		Calculator calc = new Calculator();
	
		double result = calc.divide(-2, -2);
		assertEquals(result, 1, "Dividing two negatives should result in a positive");
	}

	@Test
	public void divideNegativePositive() {
		Calculator calc = new Calculator();

		double result = calc.divide(-27.95, 6.5);
		assertEquals(result, -4.3, "Dividing a negative i.e. -27.95 by a positive i.e. 6.5 must give a negative i.e. -4.3");
	}

	@Test
	public void divideZeroByNumber() {
		Calculator calc = new Calculator();

		double result = calc.divide(0, 8);
		assertEquals(result, 0, "Zero divided by any number except zero must be a zero");
	}
  
	@Test
	public void divideDecimals() {
		Calculator calc = new Calculator();

		double result = calc.divide(46.89638, 3.252);
		assertEquals(result, 14.42078105781058, "46.89638 divided by 3.252 is 14.42078105781058");
 	}

  	@Test
	public void powerPositiveToNegative() {
		Calculator calc = new Calculator();

		double result = calc.power(2, -1);
		assertEquals(result, 0.5, "2 to the power of -1 should be 0.5");
	}

	@Test
	public void powerDoubleAndInt() {
		Calculator calc = new Calculator();

		double res = calc.power(2.5, 3);
		assertEquals(res, 15.625, "2.5^3 should be 15.625");
	}

	@Test
	public void powerNtoZeroIsOne() {
		Calculator calc = new Calculator();

		double res = calc.power(6, 0);
		assertEquals(res, 1, "6^0 should be 1");
	}

	@Test
	public void powerNtoOneIsN() {
		Calculator calc = new Calculator();

		double res = calc.power(12.5, 1);
		assertEquals(res, 12.5, "12.5^1 should be 12.5");
	}
  
	@Test
	public void powerTwoDoubles() {
		Calculator calc = new Calculator();

		double res = calc.power(0.76, 4.5);
		assertEquals(res,0.29084470744123603 , "0.76^4.5 should be 0.29084470744123603");
	}
}
