package au.com.showcase.application.client.scroll;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Document;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class RegistrationForm extends Composite {

	private static RegistrationFormUiBinder uiBinder = GWT
			.create(RegistrationFormUiBinder.class);

	interface RegistrationFormUiBinder extends
			UiBinder<Widget, RegistrationForm> {
	}

	public RegistrationForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		Window.alert("Before Wrap" + Document.get().getElementById("firstName"));
		TextBox.wrap(Document.get().getElementById("firstName"));
		Window.alert("After Wrap");
	}

}
