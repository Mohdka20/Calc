/*
 * Author Name :  Jeong mi Park
 * Modified : Dec 21, 2021.
 * Description : Team Project Calculator - Created Computation class and function to calculate.  
 * */
public class Computation {

	public Computation() {

	}
	
	// calculate number and return double value
	public double computeNumber(char type, double num1, double num2) {
		double result = 0.0;
		switch (type) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;  
		default:

			break;

		}
		return 0.0;
	}

}
