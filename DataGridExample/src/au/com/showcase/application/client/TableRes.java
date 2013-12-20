package au.com.showcase.application.client;

import com.google.gwt.user.cellview.client.DataGrid;

public interface TableRes extends DataGrid.Resources {
	
	@Source({ DataGrid.Style.DEFAULT_CSS, "au/com/showcase/application/client/table.css" })
	TableStyle cellTableStyle();

	interface TableStyle extends DataGrid.Style {

		/**
		 * Applied to every cell.
		 */
		// cellTableCell2
		String cellTableCellLow();

		/**
		 * Applied to every cell.
		 */
		String cellTableCellHigh();

		String imgCrop();

	}
}