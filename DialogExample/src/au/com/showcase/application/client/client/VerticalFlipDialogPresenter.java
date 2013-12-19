package au.com.showcase.application.client.client;

import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.PopupView;
import com.google.inject.Inject;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.PopupPanel;

public class VerticalFlipDialogPresenter extends
		PresenterWidget<VerticalFlipDialogPresenter.MyView> {

	public interface MyView extends PopupView {
		public PopupPanel getContainer();

		public void setContainer(PopupPanel container);
	}

	@Inject
	public VerticalFlipDialogPresenter(final EventBus eventBus,
			final MyView view) {
		super(eventBus, view);
	}

	@Override
	protected void onBind() {
		super.onBind();
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
