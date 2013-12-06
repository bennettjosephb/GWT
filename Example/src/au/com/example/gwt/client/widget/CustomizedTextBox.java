package au.com.example.gwt.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CustomizedTextBox extends Composite implements HasText {

	private static CustomizedTextBoxUiBinder uiBinder = GWT
			.create(CustomizedTextBoxUiBinder.class);

	interface CustomizedTextBoxUiBinder extends
			UiBinder<Widget, CustomizedTextBox> {
	}

	public CustomizedTextBox() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	TextBox field;

	String placeHolder;

	public String getPlaceHolder() {
		return getField().getElement().getAttribute("placeHolder");
	}

	public void setPlaceHolder(String placeHolder) {
		this.placeHolder = placeHolder;
		getField().getElement().setAttribute("placeHolder", placeHolder);
	}

	public TextBox getField() {
		return field;
	}

	public void setField(TextBox field) {
		this.field = field;
	}

	public CustomizedTextBox(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		field.setText(firstName);
	}

	@UiHandler("field")
	void onClick(ClickEvent e) {
	}

	@Override
	public String getText() {
		return getField().getText();
	}

	@Override
	public void setText(String text) {
		getField().setText(text);
	}

}
