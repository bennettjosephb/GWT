package com.gwt.sample.client.common.util;

import com.google.gwt.user.client.ui.SuggestBox;

public class SuggestBoxUtil extends WidgetUtil {

	public static Boolean isEmpty(SuggestBox suggestbox) {
		if (suggestbox.getText() == null || suggestbox.getText().trim().equals("")) {
			return true;
		} else {
			return false;
		}
	}

}
