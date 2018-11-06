package uk.gergely.kiss.stringtoint.util;

import uk.gergely.kiss.stringtoint.rsc.Constants;

/**
 * Converter to convert String to int and show the result on the console.
 * 
 * @author kiss-
 *
 */

public class Converter {

	/**
	 * Printing the result or the error message on the console.
	 * 
	 * @param input
	 */
	public void printConvenrtedIntFromString(String input) {
		try {
			System.out.println("Input String: " + input + ". Converted int: " + convertStringToInt(input) + ".");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**Converting the input String to int with the help of 
	 * integer values of the characters.
	 * 
	 * @param input String to convert
	 * @return int converted from the String
	 * @throws Exception if the input is not a number
	 */
	private int convertStringToInt(String input) throws Exception {
		int convertedNumber = 0;
		if (Validator.isNumber(input)) {
			if (Validator.isNegative()) {
				input = input.substring(1);
			}
			for (int i = 0; i < input.length(); i++) {
				convertedNumber = convertedNumber * 10;
				convertedNumber += input.charAt(i) - Constants.ZERO;
			}
		} else {
			throw new Exception(input + Constants.ERROR_MESSAGE);
		}
		if (Validator.isNegative()) {
			return -convertedNumber;
		}
		return convertedNumber;
	}

}
