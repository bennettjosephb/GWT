package au.com.showcase.application.client.ui.event;

import java.util.Date;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class DateTextBoxBlurHandler implements BlurHandler {

	private Boolean error;

	private ListBox monthList;

	private TextBox yearTextBox;

	public TextBox getYearTextBox() {
		return yearTextBox;
	}

	public void setYearTextBox(TextBox yearTextBox) {
		this.yearTextBox = yearTextBox;
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
	public DateTextBoxBlurHandler() {
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

	public DateTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public DateTextBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		TextBox textBox = (TextBox) event.getSource();
		Integer noOfDays = 0;
		Integer year = Integer.parseInt(yearTextBox.getText());
		Date date = new Date(2014, 1, 22);

		// Window.alert(""+DateTimeFormat.getShortDateFormat().format(date));

		DateTimeFormat myDateTimeFormat = DateTimeFormat.getFormat("ddMMyyyy");
		 Window.alert("asdf" + myDateTimeFormat.parseStrict("29021996"));

		if (textBox.getText() != null && !textBox.getText().trim().equals("")) {
			try {
				noOfDays = Integer.parseInt(textBox.getText());
				if (!MonthListBoxFocusHandler.FOCUSED) {
					if (noOfDays < 1 || noOfDays > 31) {
						setError(true);
						errorLabel.setVisible(true);
						textBox.addStyleName(ApplicationResources.INSTANCE
								.registrationFormStyle()
								.textboxFirstNameError());
					}
				} else if (MonthListBoxFocusHandler.FOCUSED) {
					int monthIndex = monthList.getSelectedIndex();
					if (monthIndex == 0 || monthIndex == 2 || monthIndex == 4
							|| monthIndex == 6 || monthIndex == 7
							|| monthIndex == 9 || monthIndex == 11) {
						if (noOfDays < 1 || noOfDays > 31) {
							setError(true);
							errorLabel.setVisible(true);
							textBox.addStyleName(ApplicationResources.INSTANCE
									.registrationFormStyle()
									.textboxFirstNameError());
							Window.alert("3");
						} else {
							setError(false);
							errorLabel.setVisible(false);
							Window.alert("4");
						}
					} else if (monthIndex == 4 || monthIndex == 6
							|| monthIndex == 9 || monthIndex == 11) {
						if (noOfDays < 1 || noOfDays > 30) {
							setError(true);
							errorLabel.setVisible(true);
							textBox.addStyleName(ApplicationResources.INSTANCE
									.registrationFormStyle()
									.textboxFirstNameError());
							Window.alert("5");
						} else {
							setError(false);
							errorLabel.setVisible(false);
							Window.alert("6");
						}
					} else if (monthIndex == 2) {
						
						if(!YearTextBoxFocusHandler.FOCUSED){
							if (noOfDays < 1 || noOfDays > 29) {
								setError(true);
								errorLabel.setVisible(true);
								textBox.addStyleName(ApplicationResources.INSTANCE
										.registrationFormStyle()
										.textboxFirstNameError());
								Window.alert("7");
							} else {
								setError(false);
								errorLabel.setVisible(false);
								Window.alert("8");
							}
						}
						else if (YearTextBoxFocusHandler.FOCUSED){
							if (((year % 4 == 0) && (year % 100 != 0))
									|| (year % 400 == 0)) {	
								if (noOfDays < 1 || noOfDays > 29) {
									setError(true);
									errorLabel.setVisible(true);
									textBox.addStyleName(ApplicationResources.INSTANCE
											.registrationFormStyle()
											.textboxFirstNameError());
									Window.alert("7");
								} else {
									setError(false);
									errorLabel.setVisible(false);
									Window.alert("8");
								}
								
							}
						}
					}
				} 
				
				if (!YearTextBoxFocusHandler.FOCUSED) {
					

				} else if (YearTextBoxFocusHandler.FOCUSED) {
					
				}
			} catch (NumberFormatException nfe) {
				setError(true);
				errorLabel.setVisible(true);
				textBox.addStyleName(ApplicationResources.INSTANCE
						.registrationFormStyle().textboxFirstNameError());
			}
		} else if (textBox.getText() != null
				&& textBox.getText().trim().equals("")) {
			setError(true);
			errorLabel.setVisible(true);
			textBox.addStyleName(ApplicationResources.INSTANCE
					.registrationFormStyle().textboxFirstNameError());
		}
		decoratedPopupPanel.hide();
	}
}
