package a.b.c.client;

import a.b.c.client.place.NameTokens;

import com.google.gwt.dom.client.DivElement;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.Window;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class TreeSamplePresenter extends
		Presenter<TreeSamplePresenter.MyView, TreeSamplePresenter.MyProxy> {

	public interface MyView extends View {

		public DivElement getChartLayout();

		public void setChartLayout(DivElement chartLayout);

	}

	@ProxyCodeSplit
	@NameToken(NameTokens.tree)
	public interface MyProxy extends ProxyPlace<TreeSamplePresenter> {
	}

	@Inject
	public TreeSamplePresenter(final EventBus eventBus, final MyView view,
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
		String id = getView().getChartLayout().getId();
		Window.alert("ASDF"+id);
		//initWave(id);

	}

	public static native void initWave(String id) /*-{

		var container = $doc.getElementById(id);

		$wnd.alert(container);

		//		var chart = new $wnd.google.visualization.Timeline(container);

	}-*/;

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
