package a.b.c.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ChartContent extends Composite {

	private static ChartContentUiBinder uiBinder = GWT
			.create(ChartContentUiBinder.class);

	interface ChartContentUiBinder extends UiBinder<Widget, ChartContent> {
	}

	public ChartContent() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public static native void initWave(String id) /*-{

		var container = $doc.getElementById('chartLayout');

		$wnd.alert("ASDFGHJKL" + container);

		var chart = new $wnd.google.visualization.Timeline(container);

		var dataTable = new $wnd.google.visualization.DataTable();

		dataTable.addColumn({
			type : 'string',
			id : 'President'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'Start'
		});
		dataTable.addColumn({
			type : 'date',
			id : 'End'
		});

		dataTable.addRows([
				[ 'Washington', new Date(1789, 3, 29), new Date(1797, 2, 3) ],
				[ 'Adams', new Date(1797, 2, 3), new Date(1801, 2, 3) ],
				[ 'Jefferson', new Date(1801, 2, 3), new Date(1809, 2, 3) ] ]);

		chart.draw(dataTable);
	}-*/;

	@Override
	protected void onLoad() {

		super.onLoad();

		DOM.getElementById("chartLayout");

		initWave("");
	}

}
