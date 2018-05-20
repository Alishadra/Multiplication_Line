package org.itstep;

import javax.print.attribute.standard.RequestingUserName;

public class AppRunner {

	public static void main(String[] args) {

		int factor = 2345;
		int multiplied = 1764;

		String result = getResult(factor, multiplied);
		System.out.println(result);

	}

	private static String getResult(int factor, int multiplied) {

		String result = "";

		int finalLength = String.valueOf(factor * multiplied).length();
		result += getSpaces(finalLength - String.valueOf(factor).length()) + factor + "\n";
		result += getSpaces(finalLength - String.valueOf(multiplied).length() - 1) + "*" + multiplied + "\n";
		result += getSpaces(finalLength - String.valueOf(multiplied).length())
				+ getMinuses(String.valueOf(multiplied).length()) + "\n";
		result += getRows(finalLength, factor, multiplied);
		result += getMinuses(finalLength) + "\n" + (factor*multiplied);
		return result;
	}

	private static String getRows(int fLength, int factor, int multiplied) {
		String result = "";
		char [] numbers = String.valueOf(multiplied).toCharArray();
		int counter = 0;
		for (int i = (numbers.length-1); i >= 0; i--) {
			int number = Character.getNumericValue(numbers[i]);
			int rowResult = number*factor;
			result += getSpaces(fLength - (String.valueOf(rowResult).length() + counter)) + rowResult + "\n";	
			counter++;
		}
		
		return result;
	}

	private static String getMinuses(int i) {
		String minuses = "";
		for (int j = 0; j < i; j++) {
			minuses += "-";
		}
		return minuses;
	}

	static String getSpaces(int i) {
		String spaces = "";
		for (int j = 0; j < i; j++) {
			spaces += " ";
		}
		return spaces;
	}

}
