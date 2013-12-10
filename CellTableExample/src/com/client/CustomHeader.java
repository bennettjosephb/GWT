package com.client;

import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.Cell.Context;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.cellview.client.Header;
import com.shared.ContactInfo;

public class CustomHeader extends Header<ContactInfo> {

	public CustomHeader(Cell<ContactInfo> cell) {
		super(cell);
	}

	public String getName() {
		return null;
	}

	@Override
	public ContactInfo getValue() {
		return null;
	}
	
	@Override
    public void render(Context context, SafeHtmlBuilder sb) {
        super.render(context, sb);
    }
}
