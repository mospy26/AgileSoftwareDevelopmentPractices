import java.util.Scanner;

class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Calculator usage: a OPERATOR b (e.g. 5 + 2). Available operators: + - * ^");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input: ");
		String s = scanner.nextLine();
		
		try {
			double result = calc.parseInput(s);
			System.out.println(s + " = " + result);
		} catch (Exception e) {
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

	public double power(double a, double b) {
		return Math.pow(a, b);
	}

	// Returns pair of status code (0 if success) and result (if applicable)
	public double parseInput(String s) {
		double result = 0;

		String[] parms = s.split(" ");
		if (parms.length != 3) {
			throw new IllegalArgumentException("Invalid number of parameters");
		}

		double a = Double.parseDouble(parms[0]);
		double b = Double.parseDouble(parms[2]);

		switch (parms[1]) {
			case "+":
				return add(a, b);
			case "-":
				return subtraction(a, b);
			case "*":
				return multiply(a, b);
			case "^":
				return power(a, b);
			default:
				throw new UnsupportedOperationException("Invalid operation");
		}
	}

}
