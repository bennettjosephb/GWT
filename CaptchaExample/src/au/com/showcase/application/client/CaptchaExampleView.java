package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;

public class CaptchaExampleView extends ViewImpl implements
		CaptchaExamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, CaptchaExampleView> {
	}

	@Inject
	public CaptchaExampleView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button clickButton;
	public Button getClickButton() {
		return clickButton;
	}

	public void setClickButton(Button clickButton) {
		this.clickButton = clickButton;
	}

	public HTMLPanel getRoot() {
		return root;
	}

	public void setRoot(HTMLPanel root) {
		this.root = root;
	}

	@UiField
	HTMLPanel root;
	@UiField
	Image imageRes;
	public Image getImageRes() {
		return imageRes;
	}

	public void setImageRes(Image imageRes) {
		this.imageRes = imageRes;
	}
}
