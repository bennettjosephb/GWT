package com.gwt.sample.project.client;

import com.google.gwt.core.client.GWT;
import com.gwt.sample.project.client.gin.com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$(com.gwt.sample.project.client.SamplePresenter.MyProxy injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$(com.gwt.sample.project.client.SamplePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    
  }
  
  public void memberInject_Key$type$com$gwt$sample$project$client$SampleView$Binder$_annotation$$none$$(com.gwt.sample.project.client.SampleView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$(com.gwt.sample.project.client.SampleView injectee) {
    
  }
  
  
  /**
   * Binding for com.gwt.sample.project.client.SamplePresenter$MyView declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  public com.gwt.sample.project.client.SamplePresenter.MyView get_Key$type$com$gwt$sample$project$client$SamplePresenter$MyView$_annotation$$none$$() {
    com.gwt.sample.project.client.SamplePresenter.MyView result = get_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$();
    return result;
    
  }
  
  private com.gwt.sample.project.client.SamplePresenter.MyProxy singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$ = null;
  
  public com.gwt.sample.project.client.SamplePresenter.MyProxy get_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.gwt.sample.project.client.SamplePresenter.MyProxy.class);
    assert created instanceof com.gwt.sample.project.client.SamplePresenter.MyProxy;
    com.gwt.sample.project.client.SamplePresenter.MyProxy result = (com.gwt.sample.project.client.SamplePresenter.MyProxy) created;
    
    memberInject_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$;
    
  }
  
  private com.gwt.sample.project.client.SamplePresenter singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$ = null;
  
  public com.gwt.sample.project.client.SamplePresenter get_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$ == null) {
    com.gwt.sample.project.client.SamplePresenter result = com$gwt$sample$project$client$SamplePresenter_com$gwt$sample$project$client$SamplePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$gwt$sample$project$client$SamplePresenter$MyView$_annotation$$none$$(), get_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$());
    memberInject_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$;
    
  }
  
  public com.gwt.sample.project.client.SamplePresenter com$gwt$sample$project$client$SamplePresenter_com$gwt$sample$project$client$SamplePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwt.sample.project.client.SamplePresenter.MyView _1, com.gwt.sample.project.client.SamplePresenter.MyProxy _2) {
    return new com.gwt.sample.project.client.SamplePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwt$sample$project$client$SamplePresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.gwt.sample.project.client.SamplePresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.gwt.sample.project.client.SamplePresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$gwt$sample$project$client$SamplePresenter$_annotation$$none$$());
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
   * Binding for com.gwt.sample.project.client.SampleView$Binder declared at:
   *   Implicit GWT.create binding for com.gwt.sample.project.client.SampleView$Binder
   */
  public com.gwt.sample.project.client.SampleView.Binder get_Key$type$com$gwt$sample$project$client$SampleView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.gwt.sample.project.client.SampleView.Binder.class);
    assert created instanceof com.gwt.sample.project.client.SampleView.Binder;
    com.gwt.sample.project.client.SampleView.Binder result = (com.gwt.sample.project.client.SampleView.Binder) created;
    
    memberInject_Key$type$com$gwt$sample$project$client$SampleView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.gwt.sample.project.client.SampleView singleton_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$ = null;
  
  public com.gwt.sample.project.client.SampleView get_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$ == null) {
    com.gwt.sample.project.client.SampleView result = com$gwt$sample$project$client$SampleView_com$gwt$sample$project$client$SampleView_methodInjection(get_Key$type$com$gwt$sample$project$client$SampleView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$(result);
    
        singleton_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwt$sample$project$client$SampleView$_annotation$$none$$;
    
  }
  
  public com.gwt.sample.project.client.SampleView com$gwt$sample$project$client$SampleView_com$gwt$sample$project$client$SampleView_methodInjection(com.gwt.sample.project.client.SampleView.Binder _0) {
    return new com.gwt.sample.project.client.SampleView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector injector;
  public com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment(com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.gwt.sample.project.client.SamplePresenter$MyProxy
    get_Key$type$com$gwt$sample$project$client$SamplePresenter$MyProxy$_annotation$$none$$();
    
  }
  
}
