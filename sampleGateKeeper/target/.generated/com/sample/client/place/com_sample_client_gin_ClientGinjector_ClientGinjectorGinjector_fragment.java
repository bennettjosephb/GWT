package com.sample.client.place;

import com.google.gwt.core.client.GWT;
import com.sample.client.gin.com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$sample$client$place$ClientPlaceManager$_annotation$$none$$(com.sample.client.place.ClientPlaceManager injectee) {
    
  }
  
  
  /**
   * Binding for com.sample.client.place.ClientPlaceManager declared at:
   *   Implicit binding for com.sample.client.place.ClientPlaceManager
   */
  public com.sample.client.place.ClientPlaceManager get_Key$type$com$sample$client$place$ClientPlaceManager$_annotation$$none$$() {
    com.sample.client.place.ClientPlaceManager result = com$sample$client$place$ClientPlaceManager_com$sample$client$place$ClientPlaceManager_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), injector.getFragment_com_sample_client_gin().get_Key$type$java$lang$String$_annotation$$com$sample$client$place$DefaultPlace$());
    memberInject_Key$type$com$sample$client$place$ClientPlaceManager$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.sample.client.place.ClientPlaceManager com$sample$client$place$ClientPlaceManager_com$sample$client$place$ClientPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2) {
    return new com.sample.client.place.ClientPlaceManager(_0, _1, _2);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector;
  public com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment(com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
