package au.com.showcase.application.client.ui.event;

import java.util.Date;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class YearTextBoxBlurHandler implements BlurHandler {

	private Boolean error;

	private ListBox monthList;

	private TextBox dateBox;

	public TextBox getDateBox() {
		return dateBox;
	}

	public void setDateBox(TextBox dateBox) {
		this.dateBox = dateBox;
	}

	public ListBox getMonthList() {
		return monthList;
	}

	public void setMonthList(ListBox monthList) {
		this.monthList = monthList;
	}

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Inject
	public YearTextBoxBlurHandler() {
		ApplicationResources.INSTANCE.registrationFormStyle().ensureInjected();
	}

	private DecoratedPopupPanel decoratedPopupPanel;

	private Label errorLabel;

	public Label getErrorLabel() {
		return errorLabel;
	}

	public void setErrorLabel(Label errorLabel) {
		this.errorLabel = errorLabel;
	}

	public DecoratedPopupPanel getDecoratedPopupPanel() {
		return decoratedPopupPanel;
	}

	public void setDecoratedPopupPanel(DecoratedPopupPanel decoratedPopupPanel) {
		this.decoratedPopupPanel = decoratedPopupPanel;
	}

	public YearTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public YearTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();
		Integer year = 0;
		Date date = new Date();
		Integer noOfDays = 0;

		if (textBox.getText() != null && !textBox.getText().trim().equals("")) {
			try {
				year = Integer.parseInt(textBox.getText());
				noOfDays = Integer.parseInt(dateBox.getText());
				if (year < 1850 || year > (1900 + date.getYear())) {
					setError(true);
				} else {
					setError(false);
				}
			} catch (NumberFormatException nfe) {
				setError(true);
			}
		} else if (textBox.getText() != null
				&& textBox.getText().trim().equals("")) {
			setError(true);
		}

		if (error) {
			errorLabel.setVisible(true);
			textBox.addStyleName(ApplicationResources.INSTANCE
					.registrationFormStyle().textboxFirstNameError());
		}
		decoratedPopupPanel.hide();
	}
}
