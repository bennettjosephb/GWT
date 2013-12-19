package au.com.showcase.application.client.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class FlipDialog extends DialogBox{

	private static FlipDialogUiBinder uiBinder = GWT
			.create(FlipDialogUiBinder.class);

	interface FlipDialogUiBinder extends UiBinder<Widget, FlipDialog> {
	}

	public FlipDialog() {
		setWidget(uiBinder.createAndBindUi(this));
	}

	public FlipDialog(String firstName) {
		setWidget(uiBinder.createAndBindUi(this));
	}

	public void setText(String text) {
	}

	public String getText() {
		return null;
	}

}
