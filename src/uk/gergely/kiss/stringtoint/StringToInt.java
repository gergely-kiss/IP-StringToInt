package uk.gergely.kiss.stringtoint;

import uk.gergely.kiss.stringtoint.util.Converter;

/**Main method with 6 test cases of the converting a String to 
 * int implementation without using any additional libraries
 * 
 * @author kiss-
 *
 */
public class StringToInt {

	
	public static void main(String[] args) {

		Converter conv = new Converter();
		String test1 = "1239034";
		String test2 = "-123";
		String test3 = "-12O";
		String test4 = "string";
		String test5 = "0";
		
		conv.printConvenrtedIntFromString(test1);
		conv.printConvenrtedIntFromString(test2);
		conv.printConvenrtedIntFromString(test3);
		conv.printConvenrtedIntFromString(test4);
		conv.printConvenrtedIntFromString(test5);
		conv.printConvenrtedIntFromString(1234567890+"");
		
	}

}
