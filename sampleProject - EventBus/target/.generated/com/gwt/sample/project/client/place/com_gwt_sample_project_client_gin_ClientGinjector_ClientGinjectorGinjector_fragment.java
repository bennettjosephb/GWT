package com.gwt.sample.project.client.place;

import com.google.gwt.core.client.GWT;
import com.gwt.sample.project.client.gin.com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwt$sample$project$client$place$ClientPlaceManager$_annotation$$none$$(com.gwt.sample.project.client.place.ClientPlaceManager injectee) {
    
  }
  
  
  /**
   * Binding for com.gwt.sample.project.client.place.ClientPlaceManager declared at:
   *   Implicit binding for com.gwt.sample.project.client.place.ClientPlaceManager
   */
  public com.gwt.sample.project.client.place.ClientPlaceManager get_Key$type$com$gwt$sample$project$client$place$ClientPlaceManager$_annotation$$none$$() {
    com.gwt.sample.project.client.place.ClientPlaceManager result = com$gwt$sample$project$client$place$ClientPlaceManager_com$gwt$sample$project$client$place$ClientPlaceManager_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$(), injector.getFragment_com_gwt_sample_project_client_gin().get_Key$type$java$lang$String$_annotation$$com$gwt$sample$project$client$place$DefaultPlace$());
    memberInject_Key$type$com$gwt$sample$project$client$place$ClientPlaceManager$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwt.sample.project.client.place.ClientPlaceManager com$gwt$sample$project$client$place$ClientPlaceManager_com$gwt$sample$project$client$place$ClientPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1, java.lang.String _2) {
    return new com.gwt.sample.project.client.place.ClientPlaceManager(_0, _1, _2);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector injector;
  public com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment(com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
