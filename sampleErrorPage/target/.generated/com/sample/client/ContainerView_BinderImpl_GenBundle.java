package com.sample.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.resources.client.ImageResource.ImageOptions;
import com.google.gwt.resources.client.CssResource.Import;

public interface ContainerView_BinderImpl_GenBundle extends ClientBundle {
  @Source("ContentFooter.css")
  ContainerView_BinderImpl_GenCss_footer footer();

  @Source("ContentHeader.css")
  ContainerView_BinderImpl_GenCss_header header();

  @Source("ContentMenu.css")
  ContainerView_BinderImpl_GenCss_menu menu();

}
