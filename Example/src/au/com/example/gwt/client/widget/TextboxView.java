package au.com.example.gwt.client.widget;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;

public class TextboxView extends ViewImpl implements TextboxPresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TextboxView> {
	}

	@Inject
	public TextboxView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	TextBox textField;
	
	@UiField
	TextBox 	result;
	
	public TextBox getResult() {
		return result;
	}

	public void setResult(TextBox result) {
		this.result = result;
	}

	public TextBox getTextField() {
		return textField;
	}

	public void setTextField(TextBox textField) {
		this.textField = textField;
	}
}
