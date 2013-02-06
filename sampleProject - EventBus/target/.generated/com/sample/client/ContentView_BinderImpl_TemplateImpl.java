package com.sample.client;

public class ContentView_BinderImpl_TemplateImpl implements com.sample.client.ContentView_BinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> <p> <br> <b> PLEASE ENTER SOME VALUE INTO TEXT BOX AND CLICK SUBMIT, YOU CAN SEE THE TEXT BOX CONTENT IN LABEL BOX ABOVE IN CONTENT VIEW, WHICH IS IN THE CENTER OF DOCKLAYOUT</b> <br> </p>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
