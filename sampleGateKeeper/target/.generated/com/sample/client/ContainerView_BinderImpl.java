package com.sample.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ContainerView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.sample.client.ContainerView>, com.sample.client.ContainerView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
    @Template("")
    SafeHtml html2();
     
    @Template("")
    SafeHtml html3();
     
    @Template("")
    SafeHtml html4();
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.sample.client.ContainerView owner) {


    return new Widgets(owner).get_f_DockLayoutPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final com.sample.client.ContainerView owner;


    public Widgets(final com.sample.client.ContainerView owner) {
      this.owner = owner;
      build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();  // more than one getter call detected. Type: GENERATED_BUNDLE, precedence: 1
      build_footer();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_header();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
      build_menu();  // generated css resource must be always created. Type: GENERATED_CSS. Precedence: 1
    }

    SafeHtml template_html1() {
      return template.html1();
    }
    SafeHtml template_html2() {
      return template.html2();
    }
    SafeHtml template_html3() {
      return template.html3();
    }
    SafeHtml template_html4() {
      return template.html4();
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 3 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private com.sample.client.ContainerView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    private com.sample.client.ContainerView_BinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }
    private com.sample.client.ContainerView_BinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.sample.client.ContainerView_BinderImpl_GenBundle) GWT.create(com.sample.client.ContainerView_BinderImpl_GenBundle.class);
      // Setup section.


      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for footer called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sample.client.ContainerView_BinderImpl_GenCss_footer get_footer() {
      return build_footer();
    }
    private com.sample.client.ContainerView_BinderImpl_GenCss_footer build_footer() {
      // Creation section.
      final com.sample.client.ContainerView_BinderImpl_GenCss_footer footer = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().footer();
      // Setup section.
      footer.ensureInjected();


      return footer;
    }

    /**
     * Getter for header called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sample.client.ContainerView_BinderImpl_GenCss_header get_header() {
      return build_header();
    }
    private com.sample.client.ContainerView_BinderImpl_GenCss_header build_header() {
      // Creation section.
      final com.sample.client.ContainerView_BinderImpl_GenCss_header header = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().header();
      // Setup section.
      header.ensureInjected();


      return header;
    }

    /**
     * Getter for menu called 1 times. Type: GENERATED_CSS. Build precedence: 1.
     */
    private com.sample.client.ContainerView_BinderImpl_GenCss_menu get_menu() {
      return build_menu();
    }
    private com.sample.client.ContainerView_BinderImpl_GenCss_menu build_menu() {
      // Creation section.
      final com.sample.client.ContainerView_BinderImpl_GenCss_menu menu = get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay().menu();
      // Setup section.
      menu.ensureInjected();


      return menu;
    }

    /**
     * Getter for f_DockLayoutPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.DockLayoutPanel get_f_DockLayoutPanel1() {
      return build_f_DockLayoutPanel1();
    }
    private com.google.gwt.user.client.ui.DockLayoutPanel build_f_DockLayoutPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.PX);
      // Setup section.
      f_DockLayoutPanel1.addNorth(get_northPanel(), 50);
      f_DockLayoutPanel1.addSouth(get_southPanel(), 40.0);
      f_DockLayoutPanel1.addWest(get_westPanel(), 200);
      f_DockLayoutPanel1.add(get_centerPanel());
      f_DockLayoutPanel1.setHeight("100%");
      f_DockLayoutPanel1.setWidth("100%");


      return f_DockLayoutPanel1;
    }

    /**
     * Getter for northPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_northPanel() {
      return build_northPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_northPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel northPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.
      northPanel.setStyleName("" + get_header().header() + "");
      northPanel.setHeight("50px");
      northPanel.setWidth("100%");


      owner.northPanel = northPanel;

      return northPanel;
    }

    /**
     * Getter for southPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_southPanel() {
      return build_southPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_southPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel southPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html2().asString());
      // Setup section.
      southPanel.setStyleName("" + get_footer().footer() + "");
      southPanel.setHeight("50px");
      southPanel.setWidth("100%");


      owner.southPanel = southPanel;

      return southPanel;
    }

    /**
     * Getter for westPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_westPanel() {
      return build_westPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_westPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel westPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html3().asString());
      // Setup section.
      westPanel.setStyleName("" + get_menu().menu() + "");
      westPanel.setHeight("100%");
      westPanel.setWidth("200px");


      owner.westPanel = westPanel;

      return westPanel;
    }

    /**
     * Getter for centerPanel called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_centerPanel() {
      return build_centerPanel();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_centerPanel() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel centerPanel = new com.google.gwt.user.client.ui.HTMLPanel(template_html4().asString());
      // Setup section.
      centerPanel.setHeight("100%");
      centerPanel.setWidth("100%");


      owner.centerPanel = centerPanel;

      return centerPanel;
    }
  }
}
