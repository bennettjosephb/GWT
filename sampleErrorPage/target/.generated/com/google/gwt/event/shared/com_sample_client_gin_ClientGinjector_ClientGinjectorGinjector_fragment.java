package com.google.gwt.event.shared;

import com.google.gwt.core.client.GWT;
import com.sample.client.gin.com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(com.google.gwt.event.shared.EventBus injectee) {
    
  }
  
  
  /**
   * Binding for com.google.gwt.event.shared.EventBus declared at:
   *   Implicit GWT.create binding for com.google.gwt.event.shared.EventBus
   */
  public com.google.gwt.event.shared.EventBus get_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$() {
    Object created = GWT.create(com.google.gwt.event.shared.EventBus.class);
    assert created instanceof com.google.gwt.event.shared.EventBus;
    com.google.gwt.event.shared.EventBus result = (com.google.gwt.event.shared.EventBus) created;
    
    memberInject_Key$type$com$google$gwt$event$shared$EventBus$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector;
  public com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment(com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
