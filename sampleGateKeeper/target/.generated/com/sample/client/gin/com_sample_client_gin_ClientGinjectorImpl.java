package com.sample.client.gin;

public class com_sample_client_gin_ClientGinjectorImpl implements com.sample.client.gin.ClientGinjector {
  
  /**
   * Top-level injector instance for injector interface com.sample.client.gin.ClientGinjector.
   */
  private final com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector = new com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector(this);
  public com_sample_client_gin_ClientGinjectorImpl() {
    fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.initializeEagerSingletons();
    
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.sample.client.ContainerPresenter> getContainerPresenter() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_sample_client().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$sample$client$ContainerPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.sample.client.ContentPresenter> getContentPresenter() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_sample_client().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$sample$client$ContentPresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.sample.client.error.ErrorPresenter> getErrorPresenter() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_sample_client_error().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$sample$client$error$ErrorPresenter$$_annotation$$none$$();
  }
  
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.sample.client.RestrictedPresenter> getRestrictedPresenter() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_sample_client().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$sample$client$RestrictedPresenter$$_annotation$$none$$();
  }
  
  public com.sample.client.filter.SampleGateKeeper getSampleGateKeeper() {
    return fieldcom_sample_client_gin_ClientGinjector_ClientGinjectorGinjector.getFragment_com_sample_client_filter().get_Key$type$com$sample$client$filter$SampleGateKeeper$_annotation$$none$$();
  }
  
}
