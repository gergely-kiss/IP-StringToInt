package uk.gergely.kiss.stringtoint.util;

import uk.gergely.kiss.stringtoint.rsc.Constants;

/**Validator to help the converting process
 * 
 * @author kiss-
 *
 */
public class Validator {

	/**Storing the information if the validated number is negative or not. 
	 * 
	 */
	private static boolean isNegative;
	
	/**For determining if the input string is a number or not.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isNumber(String input) {
		
		for (int index = isNegative(input) ? 1 : 0; index < input.length(); index++) {
			if(input.charAt(index) < Constants.ZERO || input.charAt(index) > Constants.NINE ) {
				return false;
			}
		}		
		return true;
	}

	/**For determining if the input is starting with "'' sing or not.
	 * 
	 * @param input
	 * @return
	 */
	private static boolean isNegative(String input) {
		isNegative = input.charAt(0) == '-';
		return isNegative;
	}

	/**Getter for isNegative
	 * 
	 * @return
	 */
	public static boolean isNegative() {
		return isNegative;
	}

}
