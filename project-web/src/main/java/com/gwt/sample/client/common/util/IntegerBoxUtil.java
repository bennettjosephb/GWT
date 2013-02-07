package com.gwt.sample.client.common.util;

import com.google.gwt.user.client.ui.IntegerBox;

public class IntegerBoxUtil extends WidgetUtil {

	public static Boolean isEmpty(IntegerBox integerbox) {
		if (integerbox.getText() == null || integerbox.getText().trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}
}
