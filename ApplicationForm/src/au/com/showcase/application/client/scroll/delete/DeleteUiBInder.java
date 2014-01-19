package au.com.showcase.application.client.scroll.delete;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class DeleteUiBInder extends Composite {

	private static DeleteUiBInderUiBinder uiBinder = GWT
			.create(DeleteUiBInderUiBinder.class);

	interface DeleteUiBInderUiBinder extends UiBinder<Widget, DeleteUiBInder> {
	}

	public DeleteUiBInder() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	protected void onLoad() {
		// TODO Auto-generated method stub
		super.onLoad();
	}

}
