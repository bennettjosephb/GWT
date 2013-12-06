package au.com.example.gwt.client.widget;

import au.com.example.gwt.client.home.HomePresenter;
import au.com.example.gwt.client.place.NameTokens;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.GestureChangeEvent;
import com.google.gwt.event.dom.client.GestureChangeHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class TextboxPresenter extends
		Presenter<TextboxPresenter.MyView, TextboxPresenter.MyProxy> {

	public interface MyView extends View {

		public TextBox getTextField();

		public void setTextField(TextBox textField);

		public TextBox getResult();

		public void setResult(TextBox result);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.textbox)
	public interface MyProxy extends ProxyPlace<TextboxPresenter> {
	}

	@Inject
	public TextboxPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, HomePresenter.MAIN_CONTENT_SLOT, this);
	}

	@Override
	protected void onBind() {

		super.onBind();

		getView().getTextField().addKeyUpHandler(new KeyUpHandler() {

			@Override
			public void onKeyUp(KeyUpEvent event) {
				if (getView().getTextField().getText() != null
						&& !getView().getTextField().getText().trim()
								.equals("")) {
					if (!getView().getTextField().getText()
							.matches("[a-zA-Z0-9\\s]+")) {

						getView().getTextField().setStyleName(
								"gwt-TextBoxError");
					} else {
						getView().getTextField().setStyleName("gwt-TextBox");
					}
				} else {
					getView().getTextField().setStyleName("gwt-TextBox");
				}
				getView().getResult().setText(
						getView().getTextField().getText()
								+ ""
								+ getView().getTextField().getText()
										.matches("[a-zA-Z0-9\\s]+"));
			}
		});

		getView().getTextField().addGestureChangeHandler(
				new GestureChangeHandler() {

					@Override
					public void onGestureChange(GestureChangeEvent event) {

						if (getView().getTextField().getText()
								.matches("[a-zA-Z0-9\\s]+")) {
							getView().getTextField().setStyleName(
									"gwt-TextBoxError");
						} else {
							getView().getTextField()
									.setStyleName("gwt-TextBox");
						}
						getView().getResult().setText(
								getView().getTextField().getText()
										+ ""
										+ getView().getTextField().getText()
												.matches("[a-zA-Z0-9\\s]+"));
					}
				});

		getView().getTextField().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {

				if (getView().getTextField().getText()
						.matches("[^[a-zA-Z0-9 ]]")) {
					getView().getTextField().setStyleName("gwt-TextBoxError");
				} else {
					getView().getTextField().setStyleName("gwt-TextBox");
				}
				getView().getResult().setText(
						getView().getTextField().getText()
								+ ""
								+ getView().getTextField().getText()
										.matches("[^[a-zA-Z0-9 ]]"));
			}
		});

	}

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
