package au.com.showcase.application.client.bundle;

public class DecoratedPopupPanel extends
		com.google.gwt.user.client.ui.DecoratedPopupPanel {

	public DecoratedPopupPanel() {

	}

	public DecoratedPopupPanel(Short left, Short top) {

		this.left = left;

		this.top = top;

		ApplicationResources.INSTANCE.customWidget().ensureInjected();

		setStyleName(ApplicationResources.INSTANCE.customWidget()
				.errorInfoBubble());

	}

	private Short left = 100;

	private Short top = 100;

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Short getLeft() {
		return left;
	}

	public void setLeft(Short left) {
		this.left = left;
	}

	public Short getTop() {
		return top;
	}

	public void setTop(Short top) {
		this.top = top;
	}

}