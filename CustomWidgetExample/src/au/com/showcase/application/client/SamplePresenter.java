package au.com.showcase.application.client;

import java.util.Iterator;

import au.com.showcase.application.client.place.NameTokens;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class SamplePresenter extends
		Presenter<SamplePresenter.MyView, SamplePresenter.MyProxy> {

	public interface MyView extends View {
		public FlowPanel getRadioContainer();

		public void setRadioContainer(FlowPanel radioContainer);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.sample)
	public interface MyProxy extends ProxyPlace<SamplePresenter> {
	}

	@Inject
	public SamplePresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Override
	protected void onBind() {
		super.onBind();
		Iterator<Widget> i = ((HasWidgets) getView().getRadioContainer())
				.iterator();

		while (i.hasNext()) {
			final RadioButton widget = (RadioButton) i.next();
			widget.addClickHandler(new ClickHandler() {

				@Override
				public void onClick(ClickEvent event) {

					Window.alert(widget.getText());

				}
			});

		}

	}
}
