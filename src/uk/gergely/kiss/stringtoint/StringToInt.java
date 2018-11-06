package uk.gergely.kiss.stringtoint;

import uk.gergely.kiss.stringtoint.util.Converter;
import uk.gergely.kiss.stringtoint.util.ConverterWithBuiltInValidation;

/**
 * Main method with 7 test cases of the converting a String to int
 * implementation without using any additional libraries.  
 * 
 * @author kiss-
 *
 */
public class StringToInt {

	public static void main(String[] args) {

		String test1 = "1239034";
		String test2 = "-1231293048";
		String test3 = "-12O";
		String test4 = "string";
		String test5 = "0";
		String test6 = "--12340";

		Converter converter = new Converter();
		long startTime = System.currentTimeMillis();
		converter.printConvenrtedIntFromString(test1);
		converter.printConvenrtedIntFromString(test2);
		converter.printConvenrtedIntFromString(test3);
		converter.printConvenrtedIntFromString(test4);
		converter.printConvenrtedIntFromString(test5);
		converter.printConvenrtedIntFromString(test6);
		converter.printConvenrtedIntFromString(1234567890 + "");
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("Time toke to excute: " + elapsedTime + " ms" +"\n");

		ConverterWithBuiltInValidation converterWithBuiltInValidation = new ConverterWithBuiltInValidation();
		startTime = System.currentTimeMillis();
		converterWithBuiltInValidation.printConvenrtedIntFromString(test1);
		converterWithBuiltInValidation.printConvenrtedIntFromString(test2);
		converterWithBuiltInValidation.printConvenrtedIntFromString(test3);
		converterWithBuiltInValidation.printConvenrtedIntFromString(test4);
		converterWithBuiltInValidation.printConvenrtedIntFromString(test5);
		converterWithBuiltInValidation.printConvenrtedIntFromString(test6);
		converterWithBuiltInValidation.printConvenrtedIntFromString(1234567890 + "");
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Time toke to excute: " + elapsedTime + " ms");

	}

}
