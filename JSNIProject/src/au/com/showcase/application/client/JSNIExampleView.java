package au.com.showcase.application.client;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;

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
					}

					public void onSuccess(Object result) {
						//alert("");
					}

					@Override
					public void onFailure(Object reason) {
						Window.alert("Script load failed.");
					}
				}).inject();
		widget = binder.createAndBindUi(this);
		// url.getElement().getStyle().setBorderWidth(0, Unit.PX);
	}

	public static native void alert(String msg) /*-{
		//google.setOnLoadCallback(drawChart);

		var container = document.getElementById('example2.1');
		var chart = new google.visualization.Timeline(container);
		var dataTable = new google.visualization.DataTable();

		dataTable.addColumn({
			type : 'string',
			id : 'Term'
		});
		dataTable.addColumn({
			type : 'string',
			id : 'Name'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'Start'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'End'
		});

		dataTable
				.addRows([
						[ '1', 'George Washington', new Date(1789, 3, 29),
								new Date(1797, 2, 3) ],
						[ '2', 'John Adams', new Date(1797, 2, 3),
								new Date(1801, 2, 3) ],
						[ '3', 'Thomas Jefferson', new Date(1801, 2, 3),
								new Date(1809, 2, 3) ] ]);

		chart.draw(dataTable);

	}-*/;

	@Override
	public Widget asWidget() {
		return widget;
	}

	@UiField
	Button clickThis;

	@UiField
	Frame url;

	@UiField
	HTML htmlContainer;

	public HTML getHtmlContainer() {
		return htmlContainer;
	}

	public void setHtmlContainer(HTML htmlContainer) {
		this.htmlContainer = htmlContainer;
	}

	public Frame getUrl() {
		return url;
	}

	public void setUrl(Frame url) {
		this.url = url;
	}

	public Button getClickThis() {
		return clickThis;
	}

	public void setClickThis(Button clickThis) {
		this.clickThis = clickThis;
	}
}
