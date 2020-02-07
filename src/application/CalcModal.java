package application;

public class CalcModal {
	public double calculate(double num1, double num2, String operator) {
		
		switch (operator) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case "/":
			if(num1 == 0 || num2 ==0)
				return 0;
			return num1 / num2;	
		default:
			break;
		}
		
		return 0;
	}
}
