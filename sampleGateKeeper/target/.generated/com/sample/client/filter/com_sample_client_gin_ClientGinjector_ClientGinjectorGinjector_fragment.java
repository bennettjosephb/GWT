package com.sample.client.filter;

import com.google.gwt.core.client.GWT;
import com.sample.client.gin.com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector;

public class com_sample_client_gin_ClientGinjector_ClientGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$sample$client$filter$SampleGateKeeper$_annotation$$none$$(com.sample.client.filter.SampleGateKeeper injectee) {
    
  }
  
  
  /**
   * Binding for com.sample.client.filter.SampleGateKeeper declared at:
   *   Implicit GWT.create binding for com.sample.client.filter.SampleGateKeeper
   */
  public com.sample.client.filter.SampleGateKeeper get_Key$type$com$sample$client$filter$SampleGateKeeper$_annotation$$none$$() {
    Object created = GWT.create(com.sample.client.filter.SampleGateKeeper.class);
    assert created instanceof com.sample.client.filter.SampleGateKeeper;
    com.sample.client.filter.SampleGateKeeper result = (com.sample.client.filter.SampleGateKeeper) created;
    
    memberInject_Key$type$com$sample$client$filter$SampleGateKeeper$_annotation$$none$$(result);
    
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
