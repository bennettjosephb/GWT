package au.com.showcase.application.client;

import java.util.Date;

import au.com.showcase.application.client.place.NameTokens;

import com.chap.links.client.Timeline;
import com.chap.links.client.Timeline.Options.STYLE;
import com.google.gwt.dom.client.Document;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.visualization.client.DataTable;
import com.google.gwt.visualization.client.VisualizationUtils;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class TimeLineGroupPresenter
		extends
		Presenter<TimeLineGroupPresenter.MyView, TimeLineGroupPresenter.MyProxy> {

	Timeline timeline = null;

	public interface MyView extends View {
		public HTMLPanel getContainer();

		public void setContainer(HTMLPanel container);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.home)
	public interface MyProxy extends ProxyPlace<TimeLineGroupPresenter> {
	}

	@Inject
	public TimeLineGroupPresenter(final EventBus eventBus, final MyView view,
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

		Runnable onLoadCallback = new Runnable() {
			public void run() {
				// create a data table
				DataTable data = DataTable.create();
				data.addColumn(DataTable.ColumnType.DATETIME, "startdate");
				data.addColumn(DataTable.ColumnType.DATETIME, "enddate");
				data.addColumn(DataTable.ColumnType.STRING, "content");
				data.addColumn(DataTable.ColumnType.STRING, "group");

				DateTimeFormat dtf = DateTimeFormat
						.getFormat("yyyy-MM-dd HH:mm:ss");

				// fill the table with some random data
				int row = 0;
				for (int truck = 11; truck < 15; truck++) {
					Date date = dtf.parse("2010-12-14 08:00:00");
					for (int i = 0; i < 8; i++) {
						int diffHour = 1 * 4 * (Math.random() < 0.2 ? 1 : 0);
						date.setTime(date.getTime() + diffHour * 60 * 60 * 1000);

						Date start = new Date(date.getTime());

						diffHour = 2 + (int) Math.floor(Math.random() * 4);
						date.setTime(date.getTime() + diffHour * 60 * 60 * 1000);

						Date end = new Date(date.getTime());

						String orderText = "Order " + row;
//						if (Math.random() < 0.25)
//							orderText = "<img src='img/product-icon.png' style='width:24px; height:24px; vertical-align: middle'> "
//									+ orderText;
//						orderText = "<div title='Order " + row
//								+ "' class='order'>" + orderText + "</div>";
//
//						String truckText = "<img src='img/truck-icon.png' style='width:24px; height:24px; vertical-align: middle'> "
//						+ "Truck " + truck;
						String truckText = "Truck " + truck;

						data.addRow();
						data.setValue(row, 0, start);
						data.setValue(row, 1, end);
						data.setValue(row, 2, orderText);
						data.setValue(row, 3, truckText);

						row++;
					}
				}

				// create options
				Timeline.Options options = Timeline.Options.create();
				options.setWidth("100%");
				options.setHeight("500px");
				options.setStyle(Timeline.Options.STYLE.BOX);
				options.setEditable(false);
				options.setAnimate(false);
				options.setEventMargin(1); // minimal margin between events
				options.setEventMarginAxis(3); // minimal margin beteen events
												// and the axis
				options.setShowMajorLabels(false);
				options.setAxisOnTop(true);
				// options.setGroupsOnRight(true);
				// options.setGroupsWidth("200px");
				options.setGroupsChangeable(true);

				// Note that we have defined custom styles for the timeline
				// in the file public/timelinestyle.css

				// create the timeline, with data and options
				timeline = new Timeline(data, options);

				Frame frame = new Frame();
				
				getView().getContainer().add(timeline);
				
				//HTMLPanel container = HTMLPanel.wrap(Document.get().getElementById("mytimeline"));
				
//				container.add(timeline);

//				DOM.getElementById("mytimeline").sadd(timeline);
				
			}
		};
		
		VisualizationUtils.loadVisualizationApi(onLoadCallback);


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
