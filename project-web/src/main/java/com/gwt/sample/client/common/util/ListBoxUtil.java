package com.gwt.sample.client.common.util;

import com.google.gwt.user.client.ui.ListBox;


public class ListBoxUtil extends WidgetUtil {

	public static Boolean isSelected(ListBox listbox) {
		if (listbox.getValue(listbox.getSelectedIndex()).trim().equals("-1")) {
			return false;
		} else {
			return true;
		}
	}

}
