package com.gwt.sample.client.login.createaccount;

import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.SuggestBox;
import com.google.gwt.user.client.ui.TextBox;
import com.gwt.sample.client.common.util.IntegerBoxUtil;
import com.gwt.sample.client.common.util.ListBoxUtil;
import com.gwt.sample.client.common.util.SuggestBoxUtil;
import com.gwt.sample.client.common.util.TextBoxUtil;

public class CreateAccountHelper {

	public static void checkWidget(TextBox textbox, Label label, String message) {
		if (TextBoxUtil.isEmpty(textbox)) {
			label.setText(message);
			textbox.addStyleName("form-error");
		} else {
			label.setText("");
			textbox.removeStyleName("form-error");
			
		}
	}

	public static void checkWidget(IntegerBox integebox, Label label, String message) {
		if (IntegerBoxUtil.isEmpty(integebox)) {
			label.setText(message);
		} else {
			label.setText("");
		}
	}

	public static void checkWidget(SuggestBox suggestbox, Label label,
			String message) {
		if (SuggestBoxUtil.isEmpty(suggestbox)) {
			label.setText(message);
		} else {
			label.setText("");
		}
	}

	public static void checkWidget(ListBox listbox, Label label, String message) {
		if (!ListBoxUtil.isSelected(listbox)) {
			label.setText(message);
		} else {
			label.setText("");
		}
	}

	public static void checkFirstName(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");

	}

	public static void checkName(Boolean firstNameTextBoxEntered,
			Boolean lastNameTextBoxEntered, TextBox firstName, TextBox lastName, Label label) {
		if (firstNameTextBoxEntered) {
			checkWidget(firstName, label, "Error");
		}
		if (lastNameTextBoxEntered && label.getText().trim().equals("")) {
			checkWidget(lastName, label, "Error");
		}
	}

	public static void checkLastName(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkUsername(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkPassword(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkConfirmPassword(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkLocation(SuggestBox suggestbox, Label label) {
		checkWidget(suggestbox, label, "Error");
	}

	public static void checkPhoneNumber(TextBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkDateBD(IntegerBox integerbox, Label label) {
		checkWidget(integerbox, label, "Error");
	}

	public static void checkMonthBD(ListBox listbox, Label label) {
		checkWidget(listbox, label, "Error");
	}

	public static void checkYearBD(IntegerBox textbox, Label label) {
		checkWidget(textbox, label, "Error");
	}

	public static void checkGender(ListBox listbox, Label label) {
		checkWidget(listbox, label, "Error");
	}

	private void passwordEquals(TextBox password, TextBox confirmPassword,
			Label label, String message) {
		// getView().getPassword().getText()
		// .equals(getView().getConfirmPassword().getText());
		// label.setText(message);
	}

}
