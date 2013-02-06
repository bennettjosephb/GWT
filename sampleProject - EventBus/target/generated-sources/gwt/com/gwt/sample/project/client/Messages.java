package com.gwt.sample.project.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	I:/home/project/java/jee/juno/workspace/sampleProject/target/sampleProject-1.0/WEB-INF/classes/com/gwt/sample/project/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();
}
