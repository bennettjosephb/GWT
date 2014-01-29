package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.shared.util.NumberUtil;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DecoratedPopupPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;

public class MonthListBoxBlurHandler implements BlurHandler {

	private Boolean error;

	private DivElement container;

	private TextBox dateTextBox;

	private TextBox yearTextBox;

	private DateTextBoxBlurHandler dateBlurHandler;

	private YearTextBoxBlurHandler yearBlurHandler;

	private Label yearError;

	public Label getYearError() {
		return yearError;
	}

	public void setYearError(Label yearError) {
		this.yearError = yearError;
	}

	public Label getDateError() {
		return dateError;
	}

	public void setDateError(Label dateError) {
		this.dateError = dateError;
	}

	private Label dateError;

	public DateTextBoxBlurHandler getDateBlurHandler() {
		return dateBlurHandler;
	}

	public void setDateBlurHandler(DateTextBoxBlurHandler dateBlurHandler) {
		this.dateBlurHandler = dateBlurHandler;
	}

	public YearTextBoxBlurHandler getYearBlurHandler() {
		return yearBlurHandler;
	}

	public void setYearBlurHandler(YearTextBoxBlurHandler yearBlurHandler) {
		this.yearBlurHandler = yearBlurHandler;
	}

	public Boolean getError() {
		return error;
	}

	public TextBox getDateTextBox() {
		return dateTextBox;
	}

	public void setDateTextBox(TextBox dateTextBox) {
		this.dateTextBox = dateTextBox;
	}

	public TextBox getYearTextBox() {
		return yearTextBox;
	}

	public void setYearTextBox(TextBox yearTextBox) {
		this.yearTextBox = yearTextBox;
	}

	public DivElement getContainer() {
		return container;
	}

	public void setContainer(DivElement container) {
		this.container = container;
	}

	public Boolean isError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Inject
	public MonthListBoxBlurHandler() {
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

	public MonthListBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

	}

	public MonthListBoxBlurHandler(DecoratedPopupPanel decoratedPopupPanel,
			Label errorLabel) {

		this.decoratedPopupPanel = decoratedPopupPanel;

		this.errorLabel = errorLabel;

	}

	@Override
	public void onBlur(BlurEvent event) {
		ListBox textBox = (ListBox) event.getSource();

		// if (textBox.getSelectedIndex() == 0) {
		// ApplicationResources.INSTANCE.customWidget().ensureInjected();
		// container.addClassName(ApplicationResources.INSTANCE
		// .registrationFormStyle().selectStyleError());
		// setHasError(true);
		// errorLabel.setVisible(true);
		// } else {
		//
		// }
		DateTimeFormat myDateTimeFormat = DateTimeFormat.getFormat("ddMMyyyy");

		if (DateTextBoxFocusHandler.FOCUSED && YearTextBoxFocusHandler.FOCUSED) {
			try {
				Integer year = Integer.parseInt(yearTextBox.getText());
				Integer date = Integer.parseInt(dateTextBox.getText());
				Integer month = textBox.getSelectedIndex();
				String formattedDate = NumberUtil.format('0', 2,
						date.intValue());
				String formattedMonth = NumberUtil.format('0', 2,
						month.intValue() + 1);
				String formattedYear = NumberUtil.format('0', 4,
						year.intValue());
				myDateTimeFormat.parseStrict(formattedDate + formattedMonth
						+ formattedYear);
				dateBlurHandler.setError(false);
				yearBlurHandler.setError(false);
				setError(false);
				yearTextBox.removeStyleName(ApplicationResources.INSTANCE
						.registrationFormStyle().textboxFirstNameError());
				dateTextBox.removeStyleName(ApplicationResources.INSTANCE
						.registrationFormStyle().textboxFirstNameError());
				errorLabel.setVisible(false);
			} catch (IllegalArgumentException iae) {
				Window.alert(""
						+ ApplicationResources.INSTANCE.registrationFormStyle()
								.selectStyleError());

				setError(true);
				errorLabel.setVisible(true);
				container.addClassName(ApplicationResources.INSTANCE
						.registrationFormStyle().selectStyleError());
			} catch (RuntimeException re) {
				Window.alert(""
						+ ApplicationResources.INSTANCE.registrationFormStyle()
								.selectStyleError());

				setError(true);
				errorLabel.setVisible(true);
				container.addClassName(ApplicationResources.INSTANCE
						.registrationFormStyle().selectStyleError());
			}
		}

		decoratedPopupPanel.hide();
	}

}
