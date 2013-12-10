package com.client;

import com.google.gwt.user.cellview.client.CellTable;

public interface TableRes extends CellTable.Resources {
	@Source({ CellTable.Style.DEFAULT_CSS, "com/client/table.css" })
	TableStyle cellTableStyle();

	interface TableStyle extends CellTable.Style {

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