package uk.gergely.kiss.stringtoint.util;

import uk.gergely.kiss.stringtoint.rsc.Constants;
/**
 * Converter to convert String to int and show the result on the console.
 * Takes care of validation during the conversion 
 * 
 * @author kiss-
 *
 */
public class ConverterWithBuiltInValidation {
	/**
	 * Printing the result or the error message on the console.
	 * 
	 * @param input
	 */
	public void printConvenrtedIntFromString(String input) {
		try {
			System.out.println("ConverterWithBuiltInValidation: Input String: " + input + ". Converted int: " + validateAndConvertStringToInt(input) + ".");
		} catch (Exception e) {
			System.out.println("ConverterWithBuiltInValidation: Input String: " + e.getMessage());
		}
	}

	/**
	 * Converting the input String to int with the help of integer values of the characters
	 * while validating the input during the process.
	 * 
	 * @param input String to convert
	 * @return int converted from the String
	 * @throws Exception if the input is not a number
	 */
	private int validateAndConvertStringToInt(String input) throws Exception {
		boolean isNegative = Validator.isNegative(input);
		int convertedNumber = 0;

		if (isNegative) {
			input = input.substring(1);
		}
		for (int i = 0; i < input.length(); i++) {
			if(Validator.isValid(input.charAt(i))) {
				throw new Exception(input + Constants.ERROR_MESSAGE);
			}
			convertedNumber = convertedNumber * 10;
			convertedNumber += input.charAt(i) - Constants.ZERO;
		}
		if (isNegative) {
			return -convertedNumber;
		}
		return convertedNumber;
	}
}
