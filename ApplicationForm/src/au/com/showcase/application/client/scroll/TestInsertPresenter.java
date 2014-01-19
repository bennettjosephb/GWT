package au.com.showcase.application.client.scroll;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class TestInsertPresenter extends
		Presenter<TestInsertPresenter.MyView, TestInsertPresenter.MyProxy> {

	public interface MyView extends View {
		// public InputElement getFirstName();
		//
		// public void setFirstName(InputElement firstName);

		public TextBox getFirstName();

		public void setFirstName(TextBox firstName);

		public FormPanel getFormPanel1();

		public void setFormPanel1(FormPanel formPanel1);

		public HTMLPanel getContainerPanel1();

		public void setContainerPanel1(HTMLPanel containerPanel1);
		
		public RegistrationForm getRegistrationForm();

		public void setRegistrationForm(RegistrationForm registrationForm);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.insert)
	public interface MyProxy extends ProxyPlace<TestInsertPresenter> {
	}

	@Inject
	public TestInsertPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, ScrollTestPresenter.MAIN_CONTENT_SLOT,
				this);
	}

	@Override
	protected void onBind() {
		super.onBind();

		//RootPanel.get().add(getView().getContainerPanel1());

		//Window.alert("" + getView().getContainerPanel1());
		//Window.alert(""
			//	+ getView().getContainerPanel1().getElementById("firstName"));

		//RootPanel.get().add(getView().getContainerPanel1().getElementById("firstName"));

//		TextBox.wrap(getView().getContainerPanel1().getElementById("firstName"));

		//Window.alert("" + getView().getFirstName());

		// getView().getFirstName().addClickHandler(new ClickHandler() {
		// @Override
		// public void onClick(ClickEvent event) {
		// Window.alert("Bennet");
		// }
		// });

		//Window.alert("" + DOM.getElementById("firstName"));
		// RootPanel.get().get

		// getView().getFirstName().setValue("XYZ");
		// Window.alert(""+TextBox.wrap(getView().getFirstName()));
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

		//Window.alert("" + DOM.getElementById("firstName"));
		//
		// TextBox textBox = TextBox.wrap(DOM.getElementById("firstName"));

		// Window.alert("" + textBox);

		// .addFocusHandler(new FocusHandler() {
		// @Override
		// public void onFocus(FocusEvent event) {
		// Window.alert("XSDF");
		// }
		// });
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}
}
