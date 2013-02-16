package com.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ContainerView_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.sample.client.ContainerView_BinderImpl_GenBundle {
  private static ContainerView_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new ContainerView_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void footerInitializer() {
    footer = new com.sample.client.ContainerView_BinderImpl_GenCss_footer() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "footer";
      }
      public String getText() {
        return (".GKUHBP5BEI{background-color:" + ("#f00")  + ";border-top-color:" + ("#ebebeb")  + ";border-top-style:" + ("solid")  + ";border-top-width:" + ("1px")  + ";bottom:" + ("0")  + ";height:" + ("35px")  + ";overflow:" + ("hidden")  + ";position:" + ("absolute")  + ";width:" + ("100%")  + ";}");
      }
      public java.lang.String footer(){
        return "GKUHBP5BEI";
      }
    }
    ;
  }
  private static class footerInitializer {
    static {
      _instance0.footerInitializer();
    }
    static com.sample.client.ContainerView_BinderImpl_GenCss_footer get() {
      return footer;
    }
  }
  public com.sample.client.ContainerView_BinderImpl_GenCss_footer footer() {
    return footerInitializer.get();
  }
  private void headerInitializer() {
    header = new com.sample.client.ContainerView_BinderImpl_GenCss_header() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "header";
      }
      public String getText() {
        return (".GKUHBP5BFI{background-color:" + ("#0f0")  + ";}");
      }
      public java.lang.String header(){
        return "GKUHBP5BFI";
      }
    }
    ;
  }
  private static class headerInitializer {
    static {
      _instance0.headerInitializer();
    }
    static com.sample.client.ContainerView_BinderImpl_GenCss_header get() {
      return header;
    }
  }
  public com.sample.client.ContainerView_BinderImpl_GenCss_header header() {
    return headerInitializer.get();
  }
  private void menuInitializer() {
    menu = new com.sample.client.ContainerView_BinderImpl_GenCss_menu() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "menu";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GKUHBP5BHI{background-color:" + ("#ff0")  + ";height:" + ("100%")  + ";min-height:" + ("100%")  + ";}.GKUHBP5BGI{width:" + ("200px")  + ";border-style:" + ("solid"+ " " +"solid"+ " " +"none"+ " " +"solid")  + ";border-color:" + ("#0e69be")  + ";border-size:" + ("1px")  + ";border-width:" + ("1px")  + ";}.GKUHBP5BGI ul{list-style:" + ("none")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";}.GKUHBP5BGI li a{height:" + ("32px")  + ";height:" + ("24px")  + ";text-decoration:" + ("none")  + ";font-weight:" + ("normal")  + ";}.GKUHBP5BGI li a:link,.GKUHBP5BGI li a:visited{color:" + ("#0e69be")  + ";display:" + ("block")  + ";background:" + ("url(v3.jpg)")  + ";padding:" + ("8px"+ " " +"10px"+ " " +"0"+ " " +"0")  + ";}.GKUHBP5BGI li a:hover{color:" + ("#0e69be")  + ";background:" + ("url(v3.jpg)"+ " " +"0"+ " " +"-32px") ) + (";padding:" + ("8px"+ " " +"10px"+ " " +"0"+ " " +"0")  + ";}.GKUHBP5BGI li a:active{color:" + ("#0e69be")  + ";background:" + ("url(v3.jpg)"+ " " +"0"+ " " +"-64px")  + ";background-repeat:" + ("no-repeat")  + ";padding:" + ("8px"+ " " +"10px"+ " " +"0"+ " " +"0")  + ";}")) : ((".GKUHBP5BHI{background-color:" + ("#ff0")  + ";height:" + ("100%")  + ";min-height:" + ("100%")  + ";}.GKUHBP5BGI{width:" + ("200px")  + ";border-style:" + ("solid"+ " " +"solid"+ " " +"none"+ " " +"solid")  + ";border-color:" + ("#0e69be")  + ";border-size:" + ("1px")  + ";border-width:" + ("1px")  + ";}.GKUHBP5BGI ul{list-style:" + ("none")  + ";margin:" + ("0")  + ";padding:") + (("0")  + ";}.GKUHBP5BGI li a{height:" + ("32px")  + ";height:" + ("24px")  + ";text-decoration:" + ("none")  + ";font-weight:" + ("normal")  + ";}.GKUHBP5BGI li a:link,.GKUHBP5BGI li a:visited{color:" + ("#0e69be")  + ";display:" + ("block")  + ";background:" + ("url(v3.jpg)")  + ";padding:" + ("8px"+ " " +"0"+ " " +"0"+ " " +"10px")  + ";}.GKUHBP5BGI li a:hover{color:" + ("#0e69be")  + ";background:" + ("url(v3.jpg)"+ " " +"0"+ " " +"-32px") ) + (";padding:" + ("8px"+ " " +"0"+ " " +"0"+ " " +"10px")  + ";}.GKUHBP5BGI li a:active{color:" + ("#0e69be")  + ";background:" + ("url(v3.jpg)"+ " " +"0"+ " " +"-64px")  + ";background-repeat:" + ("no-repeat")  + ";padding:" + ("8px"+ " " +"0"+ " " +"0"+ " " +"10px")  + ";}"));
      }
      public java.lang.String cssmenu(){
        return "GKUHBP5BGI";
      }
      public java.lang.String menu(){
        return "GKUHBP5BHI";
      }
    }
    ;
  }
  private static class menuInitializer {
    static {
      _instance0.menuInitializer();
    }
    static com.sample.client.ContainerView_BinderImpl_GenCss_menu get() {
      return menu;
    }
  }
  public com.sample.client.ContainerView_BinderImpl_GenCss_menu menu() {
    return menuInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.sample.client.ContainerView_BinderImpl_GenCss_footer footer;
  private static com.sample.client.ContainerView_BinderImpl_GenCss_header header;
  private static com.sample.client.ContainerView_BinderImpl_GenCss_menu menu;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      footer(), 
      header(), 
      menu(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("footer", footer());
        resourceMap.put("header", header());
        resourceMap.put("menu", menu());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'footer': return this.@com.sample.client.ContainerView_BinderImpl_GenBundle::footer()();
      case 'header': return this.@com.sample.client.ContainerView_BinderImpl_GenBundle::header()();
      case 'menu': return this.@com.sample.client.ContainerView_BinderImpl_GenBundle::menu()();
    }
    return null;
  }-*/;
}
