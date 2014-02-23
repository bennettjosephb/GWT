package au.com.showcase.application.client;

import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;

public class JSNIExampleView extends ViewImpl implements
		JSNIExamplePresenter.MyView {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, JSNIExampleView> {
	}

	@Inject
	public JSNIExampleView(final Binder binder) {
		ScriptInjector
				.fromUrl(
						"https://www.google.com/jsapi?autoload={'modules':[{'name':'visualization','version':'1','packages':['timeline']}]}")
				.setCallback(new Callback() {
					public void onFailure(Exception reason) {
						Window.alert("Script load failed.");
					}

					public void onSuccess(Object result) {
						Window.alert("Script load success.");
					}

					@Override
					public void onFailure(Object reason) {
						Window.alert("Script load failed.");
					}
				}).inject();
		widget = binder.createAndBindUi(this);
	}

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button clickThis;

	public Button getClickThis() {
		return clickThis;
	}

	public void setClickThis(Button clickThis) {
		this.clickThis = clickThis;
	}
}
