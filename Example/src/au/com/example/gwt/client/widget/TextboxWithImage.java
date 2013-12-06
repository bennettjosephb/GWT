package au.com.example.gwt.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class TextboxWithImage extends Composite implements HasText {

	private static TextboxWithImageUiBinder uiBinder = GWT
			.create(TextboxWithImageUiBinder.class);

	interface TextboxWithImageUiBinder extends
			UiBinder<Widget, TextboxWithImage> {
	}

	public TextboxWithImage() {
		AbsolutePanel p = new AbsolutePanel();
        p.add(new TextBox());       
        Image image = new Image("images/down.png");
        image.getElement().getStyle().setMarginLeft(-20, Unit.PX);
        p.add(image);       
        image.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Window.alert("Clicked!");
            }
        });		initWidget(uiBinder.createAndBindUi(this));
	}

	public TextboxWithImage(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	TextBox field;

	public TextBox getField() {
		return field;
	}

	public void setField(TextBox field) {
		this.field = field;
	}

	public void setText(String text) {
	}

	public String getText() {
		return null;
	}

}
