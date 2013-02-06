package com.gwt.sample.project.client.gin;

public class com_gwt_sample_project_client_gin_ClientGinjectorImpl implements com.gwt.sample.project.client.gin.ClientGinjector {
  
  /**
   * Top-level injector instance for injector interface com.gwt.sample.project.client.gin.ClientGinjector.
   */
  private final com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector fieldcom_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector = new com_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector(this);
  public com_gwt_sample_project_client_gin_ClientGinjectorImpl() {
    fieldcom_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector.initializeEagerSingletons();
    
  }
  
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return fieldcom_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return fieldcom_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.gwt.sample.project.client.SamplePresenter> getSamplePresenter() {
    return fieldcom_gwt_sample_project_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_gwt_sample_project_client().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$gwt$sample$project$client$SamplePresenter$$_annotation$$none$$();
  }
  
}
