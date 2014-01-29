package au.com.showcase.application.shared.util;

public class NumberUtil {

	public static String format(Character formatCharacter, int length,
			int argument) {
		Integer stringInt = Integer.valueOf(argument);
		int difference = length - stringInt.toString().length();
		if (difference < 0) {
			throw new RuntimeException();
		}
		String temp = "";
		for (int i = 0; i < difference; i++) {
			temp += formatCharacter;
		}

		temp += stringInt.toString();

		return temp;
	}

}
