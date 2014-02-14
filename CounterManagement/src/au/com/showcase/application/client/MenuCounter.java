package au.com.showcase.application.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class MenuCounter extends Composite {

	private static MenuCounterUiBinder uiBinder = GWT
			.create(MenuCounterUiBinder.class);

	interface MenuCounterUiBinder extends UiBinder<Widget, MenuCounter> {
	}

	public MenuCounter() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
