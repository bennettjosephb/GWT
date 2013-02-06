package com.sample.client;

public class RestrictedView_BinderImpl_TemplateImpl implements com.sample.client.RestrictedView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1() {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("THIS PLACE WAS RESTRICTED !!!");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
