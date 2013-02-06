package com.sample.client;

public class ContentView_BinderImpl_TemplateImpl implements com.sample.client.ContentView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span>ACTUAL CONTENT ACTUAL CONTENT ACTUAL CONTENT ACTUAL CONTENT ACTUAL CONTENT");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
