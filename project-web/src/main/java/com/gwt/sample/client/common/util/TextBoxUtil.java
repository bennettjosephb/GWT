package com.gwt.sample.client.common.util;

import com.google.gwt.user.client.ui.TextBox;

public class TextBoxUtil extends WidgetUtil {

	public static Integer getTextLength(TextBox textbox) {
		try {
			return textbox.getText().trim().length();
		} catch (NullPointerException npe) {
			return 0;
		}
	}

	public static Boolean isEmpty(TextBox textbox) {
		if (textbox.getText() == null || textbox.getText().trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean containsOnlyAlphabets(TextBox textBox) {
		// if(textBox.getText() != null &&
		// textBox.getText().trim().matches("[a-zA-Z\\s']+")){
		if (textBox.getText() != null
				&& textBox.getText().trim().matches("[a-zA-Z]+")) {
			return true;
		}
		return false;
	}

}