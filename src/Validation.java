/*
 * Author Name :  Jeong mi Park
 * Modified : Dec 21, 2021.
 * Description : Team Project Calculator - Created Validation class and function to validate the number type.  
 * */
public class Validation {

	public Validation() {

	}
	
	// check entered string is numeric
	public boolean isNumber(String number) {
		boolean result;
		
		if (number == null) {
			result = false;
		}
		
		try {
			Double.parseDouble(number);
			result = true;
		} catch (NumberFormatException e) {
			result = false;
		}
		return result;  
	}
	
	// check number is non-decimal
	public boolean isInt(double number) {
		boolean result;
		if (number % 1 == 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
	

}
