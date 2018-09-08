class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();

		double a = 5;
		double b = 2.5;

		System.out.println(calc.Add(a, b));
	}

	public double Add(double a, double b) {
		return a + b;
	}
}