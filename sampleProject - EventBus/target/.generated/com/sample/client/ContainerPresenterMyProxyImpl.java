package com.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class ContainerPresenterMyProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyImpl<ContainerPresenter> implements com.sample.client.ContainerPresenter.MyProxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.sample.client.gin.ClientGinjector ginjector;
  
  public ContainerPresenterMyProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.sample.client.gin.ClientGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    presenter = new CodeSplitProvider<ContainerPresenter>( ginjector.getContainerPresenter() );
    
    RevealContentHandler<ContainerPresenter> revealContentHandler = new RevealContentHandler<ContainerPresenter>( eventBus, this );
    getEventBus().addHandler( ContainerPresenter.MAIN_CONTENT_SLOT, revealContentHandler );
    getEventBus().addHandler( ContainerPresenter.MENU_CONTENT_SLOT, revealContentHandler );
    getEventBus().addHandler( ContainerPresenter.RIGHT_MENU_CONTENT_SLOT, revealContentHandler );
    getEventBus().addHandler( ContainerPresenter.FOOTER_CONTENT_SLOT, revealContentHandler );
    getEventBus().addHandler( ContainerPresenter.HEADER_CONTENT_SLOT, revealContentHandler );
  }
}
