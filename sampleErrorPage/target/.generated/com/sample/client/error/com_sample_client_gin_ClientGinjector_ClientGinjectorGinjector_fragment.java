package com.sample.client.error;

import com.google.gwt.core.client.GWT;
import com.sample.client.gin.com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$(com.sample.client.error.ErrorPresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$(com.sample.client.error.ErrorPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_____(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$sample$client$error$ErrorView$Binder$_annotation$$none$$(com.sample.client.error.ErrorView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$(com.sample.client.error.ErrorView injectee) {
    
  }
  
  
  /**
   * Binding for com.sample.client.error.ErrorPresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  public com.sample.client.error.ErrorPresenter.MyView get_Key$type$com$sample$client$error$ErrorPresenter$MyView$_annotation$$none$$() {
    com.sample.client.error.ErrorPresenter.MyView result = get_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$();
    return result;
    
  }
  
  private com.sample.client.error.ErrorPresenter.MyProxy singleton_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.sample.client.error.ErrorPresenter.MyProxy get_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.sample.client.error.ErrorPresenter.MyProxy.class);
    assert created instanceof com.sample.client.error.ErrorPresenter.MyProxy;
    com.sample.client.error.ErrorPresenter.MyProxy result = (com.sample.client.error.ErrorPresenter.MyProxy) created;
    
    memberInject_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.sample.client.error.ErrorPresenter singleton_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$ = null;
  
  public com.sample.client.error.ErrorPresenter get_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$ == null) {
    com.sample.client.error.ErrorPresenter result = com$sample$client$error$ErrorPresenter_com$sample$client$error$ErrorPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$sample$client$error$ErrorPresenter$MyView$_annotation$$none$$(), get_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$;
    
  }
  
  public com.sample.client.error.ErrorPresenter com$sample$client$error$ErrorPresenter_com$sample$client$error$ErrorPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.sample.client.error.ErrorPresenter.MyView _1, com.sample.client.error.ErrorPresenter.MyProxy _2) {
    return new com.sample.client.error.ErrorPresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$sample$client$error$ErrorPresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.sample.client.error.ErrorPresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.sample.client.error.ErrorPresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$sample$client$error$ErrorPresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  
  /**
   * Binding for com.sample.client.error.ErrorView$Binder declared at:
   *   Implicit GWT.create binding for com.sample.client.error.ErrorView$Binder
   */
  public com.sample.client.error.ErrorView.Binder get_Key$type$com$sample$client$error$ErrorView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.sample.client.error.ErrorView.Binder.class);
    assert created instanceof com.sample.client.error.ErrorView.Binder;
    com.sample.client.error.ErrorView.Binder result = (com.sample.client.error.ErrorView.Binder) created;
    
    memberInject_Key$type$com$sample$client$error$ErrorView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.sample.client.error.ErrorView singleton_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$ = null;
  
  public com.sample.client.error.ErrorView get_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$ == null) {
    com.sample.client.error.ErrorView result = com$sample$client$error$ErrorView_com$sample$client$error$ErrorView_methodInjection(get_Key$type$com$sample$client$error$ErrorView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$(result);
    
        singleton_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$sample$client$error$ErrorView$_annotation$$none$$;
    
  }
  
  public com.sample.client.error.ErrorView com$sample$client$error$ErrorView_com$sample$client$error$ErrorView_methodInjection(com.sample.client.error.ErrorView.Binder _0) {
    return new com.sample.client.error.ErrorView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector;
  public com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment(com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.sample.client.error.ErrorPresenter$MyProxy
    get_Key$type$com$sample$client$error$ErrorPresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
