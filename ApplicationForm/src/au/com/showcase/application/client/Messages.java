package au.com.showcase.application.client;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	D:/PFG_Applications/workspace/gwt-showcase-application/src/main/resources/au/com/showcase/application/client/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "Enter the above letters".
   * 
   * @return translated "Enter the above letters"
   */
  @DefaultMessage("Enter the above letters")
  @Key("enterTheLettersAbove")
  String enterTheLettersAbove();

  /**
   * Translated "Enter your password.".
   * 
   * @return translated "Enter your password."
   */
  @DefaultMessage("Enter your password.")
  @Key("loginEnterPassword")
  String loginEnterPassword();

  /**
   * Translated "Enter your username.".
   * 
   * @return translated "Enter your username."
   */
  @DefaultMessage("Enter your username.")
  @Key("loginEnterUsername")
  String loginEnterUsername();

  /**
   * Translated "Username or Password is incorrect.".
   * 
   * @return translated "Username or Password is incorrect."
   */
  @DefaultMessage("Username or Password is incorrect.")
  @Key("loginErrorMessage")
  String loginErrorMessage();

  /**
   * Translated "Sign in".
   * 
   * @return translated "Sign in"
   */
  @DefaultMessage("Sign in")
  @Key("loginSignIn")
  String loginSignIn();

  /**
   * Translated "Username or Password is incorrect.".
   * 
   * @return translated "Username or Password is incorrect."
   */
  @DefaultMessage("Username or Password is incorrect.")
  @Key("loginUsernameOrPasswordIsWrogng")
  String loginUsernameOrPasswordIsWrogng();

  /**
   * Translated "Enter your name".
   * 
   * @return translated "Enter your name"
   */
  @DefaultMessage("Enter your name")
  @Key("nameField")
  String nameField();

  /**
   * Translated "Password".
   * 
   * @return translated "Password"
   */
  @DefaultMessage("Password")
  @Key("password")
  String password();

  /**
   * Translated "Send".
   * 
   * @return translated "Send"
   */
  @DefaultMessage("Send")
  @Key("sendButton")
  String sendButton();

  /**
   * Translated "Username".
   * 
   * @return translated "Username"
   */
  @DefaultMessage("Username")
  @Key("username")
  String username();
}
