package au.com.showcase.application.client.ui.event;

import au.com.showcase.application.client.bundle.ApplicationResources;
import au.com.showcase.application.client.bundle.DecoratedPopupPanel;
import au.com.showcase.application.shared.util.NumberUtil;

import com.google.gwt.dom.client.DivElement;
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

	private DivElement monthContainer;

	public DivElement getMonthContainer() {
		return monthContainer;
	}

	public void setMonthContainer(DivElement monthContainer) {
		this.monthContainer = monthContainer;
	}

	private TextBox yearTextBox;

	private YearTextBoxBlurHandler yearBlurHandler;

	private MonthListBoxBlurHandler monthBlurHandler;

	private Label monthError;

	private Label yearError;

	public Label getMonthError() {
		return monthError;
	}

	public void setMonthError(Label monthError) {
		this.monthError = monthError;
	}

	public Label getYearError() {
		return yearError;
	}

	public void setYearError(Label yearError) {
		this.yearError = yearError;
	}

	public YearTextBoxBlurHandler getYearBlurHandler() {
		return yearBlurHandler;
	}

	public void setYearBlurHandler(YearTextBoxBlurHandler yearBlurHandler) {
		this.yearBlurHandler = yearBlurHandler;
	}

	public MonthListBoxBlurHandler getMonthBlurHandler() {
		return monthBlurHandler;
	}

	public void setMonthBlurHandler(MonthListBoxBlurHandler monthBlurHandler) {
		this.monthBlurHandler = monthBlurHandler;
	}

	public Boolean getError() {
		return error;
	}

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
		DateTimeFormat myDateTimeFormat = DateTimeFormat.getFormat("ddMMyyyy");

		if (textBox.getText() != null && !textBox.getText().trim().equals("")) {
			try {
				Integer date = Integer.parseInt(textBox.getText());
				if (MonthListBoxFocusHandler.FOCUSED
						&& YearTextBoxFocusHandler.FOCUSED) {
					try {
						Integer year = Integer.parseInt(yearTextBox.getText());
						Integer month = monthList.getSelectedIndex();
						String formattedDate = NumberUtil.format('0', 2,
								date.intValue());
						String formattedMonth = NumberUtil.format('0', 2,
								month.intValue() + 1);
						String formattedYear = NumberUtil.format('0', 4,
								year.intValue());
						myDateTimeFormat.parseStrict(formattedDate
								+ formattedMonth + formattedYear);
						yearBlurHandler.setError(false);
						monthBlurHandler.setError(false);
						yearTextBox
								.removeStyleName(ApplicationResources.INSTANCE
										.registrationFormStyle()
										.textboxFirstNameError());
						Window.alert(""
								+ ApplicationResources.INSTANCE
										.registrationFormStyle()
										.selectStyleError());
						monthContainer
								.removeClassName(ApplicationResources.INSTANCE
										.registrationFormStyle()
										.selectStyleError());
						setError(false);
						errorLabel.setVisible(false);
					} catch (IllegalArgumentException iae) {
						setError(true);
						errorLabel.setVisible(true);
						textBox.addStyleName(ApplicationResources.INSTANCE
								.registrationFormStyle()
								.textboxFirstNameError());
					} catch (RuntimeException e) {
						setError(true);
						errorLabel.setVisible(true);
						textBox.addStyleName(ApplicationResources.INSTANCE
								.registrationFormStyle()
								.textboxFirstNameError());
					}
				} else {
					if (date < 1 || date > 31) {
						setError(true);
						errorLabel.setVisible(true);
						textBox.addStyleName(ApplicationResources.INSTANCE
								.registrationFormStyle()
								.textboxFirstNameError());
					}
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
