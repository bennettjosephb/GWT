package au.com.showcase.application.client.client;

import au.com.showcase.application.client.client.place.NameTokens;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.Button;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

public class FlipDialogPresenter extends
		Presenter<FlipDialogPresenter.MyView, FlipDialogPresenter.MyProxy> {

	public interface MyView extends View {
		public Button getButton();

		public void setButton(Button button);
	}

	@ProxyCodeSplit
	@NameToken(NameTokens.flip)
	public interface MyProxy extends ProxyPlace<FlipDialogPresenter> {
	}

	@Inject
	public FlipDialogPresenter(final EventBus eventBus, final MyView view,
			final MyProxy proxy) {
		super(eventBus, view, proxy);
	}

	@Override
	protected void revealInParent() {
		RevealRootContentEvent.fire(this, this);
	}

	@Inject
	VerticalFlipDialogPresenter flipDialog;

	@Override
	protected void onBind() {
		super.onBind();
		getView().getButton().addStyleName("md-trigger");
		getView().getButton().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				flipDialog.getView().getContainer().addStyleName("md-show");
				addToPopupSlot(flipDialog);
				bind1();
			}
		});
	}

	private static native void bind1()/*-{
		var ModalEffects = (function() {

			function init() {
								function(el, i) {
									alert("2");

									var modal = document.querySelector('#'
											+ el.getAttribute('data-modal')), close = modal
											.querySelector('.md-close');
									alert("3");

									function removeModal(hasPerspective) {
										classie.remove(modal, 'md-show');
										alert("4");

										if (hasPerspective) {
											classie.remove(
													document.documentElement,
													'md-perspective');
										}
									}

									function removeModalHandler() {
										removeModal(classie.has(el,
												'md-setperspective'));
									}

									el
											.addEventListener(
													'click',
													function(ev) {
														classie.add(modal,
																'md-show');

														if (classie
																.has(el,
																		'md-setperspective')) {
															setTimeout(
																	function() {
																		classie
																				.add(
																						document.documentElement,
																						'md-perspective');
																	}, 25);
														}
													});

									close.addEventListener('click',
											function(ev) {
												ev.stopPropagation();
												removeModalHandler();
											});

								}

			}

			init();

		})();
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
