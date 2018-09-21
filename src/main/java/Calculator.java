import java.util.Scanner;
import javafx.util.Pair;

class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Calculator usage: a OPERATOR b (e.g. 5 + 2)");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		String s = scanner.nextLine();
		
		Pair<Integer, Double> result = calc.parseInput(s);
		if (result.getKey() == 0) {
			System.out.println(s + " = " + result.getValue());
		} else {
			System.out.println("Invalid input!");
		}
	}

	public double add(double a, double b) {
		return a + b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double subtraction(double a , double b){
		return a - b;
	}

	public double divide(double a, double b) throws ArithmeticException {
		if(b == 0) throw new ArithmeticException("Denominator cannot be zero!");
		return a / b;
	}

	// Returns pair of status code (0 if success) and result (if applicable)
	public Pair<Integer, Double> parseInput(String s) {
		double result = 0;

		String[] parms = s.split(" ");
		if (parms.length != 3) {
			return new Pair<Integer, Double>(1, result);
		}

		double a, b;
		try {
			a = Double.parseDouble(parms[0]);
			b = Double.parseDouble(parms[2]);
		} catch (NumberFormatException e) {
			return new Pair<Integer, Double>(1, result);
		}

		switch (parms[1]) {
			case "+":
				result = add(a, b);
				break;
			case "-":
				result = subtraction(a, b);
				break;
			case "*":
				result = multiply(a, b);
				break;
			case "/":
				result = divide(a, b);
				break;
			default:
				return new Pair<Integer, Double>(1, result);
		}

		return new Pair<Integer, Double>(0, result);
	}

}
