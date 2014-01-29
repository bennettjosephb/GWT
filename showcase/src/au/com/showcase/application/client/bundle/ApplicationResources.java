package au.com.showcase.application.client.bundle;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface ApplicationResources extends ClientBundle {
	
	public static final ApplicationResources INSTANCE = GWT.create(ApplicationResources.class);

	@Source("RegistrationFormStyle.css")
	RegistrationFormStyle registrationFormStyle();

	@Source("../images/Abort.png")
	ImageResource abort();

	@Source("../images/About.png")
	ImageResource about();

	@Source("../images/Accept.png")
	ImageResource accept();

	@Source("../images/Application.png")
	ImageResource application();

	@Source("../images/Attention.png")
	ImageResource attention();

	@Source("../images/Cancel.png")
	ImageResource cancel();

	@Source("../images/Close.png")
	ImageResource close();

	@Source("../images/Create.png")
	ImageResource create();

	@Source("../images/Cut.png")
	ImageResource cut();

	@Source("../images/Delete.png")
	ImageResource delete();

	@Source("../images/Error.png")
	ImageResource error();

	@Source("../images/Forward.png")
	ImageResource forward();

	@Source("../images/Info.png")
	ImageResource info();

	@Source("../images/Logout.png")
	ImageResource logout();

	@Source("../images/Move.png")
	ImageResource move();

	@Source("../images/Noentry.png")
	ImageResource noentry();

	@Source("../images/OK.png")
	ImageResource ok();

	@Source("../images/Plus.png")
	ImageResource plus();

	@Source("../images/Problem.png")
	ImageResource problem();

	@Source("../images/Redo.png")
	ImageResource redo();

	@Source("../images/Remove.png")
	ImageResource remove();

	@Source("../images/Repeat.png")
	ImageResource repeat();

	@Source("../images/Save.png")
	ImageResource save();

	@Source("../images/Settings.png")
	ImageResource settings();

	@Source("../images/Switching.png")
	ImageResource switching();

	@Source("../images/Sync.png")
	ImageResource sync();

	@Source("../images/Turnoff.png")
	ImageResource turnoff();

	@Source("../images/Undo.png")
	ImageResource undo();

	@Source("../images/Up.png")
	ImageResource up();

	@Source("../images/Update.png")
	ImageResource update();

	@Source("../images/View.png")
	ImageResource view();

	@Source("../images/Warning.png")
	ImageResource warning();

	@Source("../images/Yes.png")
	ImageResource yes();

	@Source("../images/Add.png")
	ImageResource add();

	@Source("../images/Apply.png")
	ImageResource apply();

	@Source("../images/Back.png")
	ImageResource back();

	@Source("../images/Circulation.png")
	ImageResource circulation();

	@Source("../images/Danger.png")
	ImageResource danger();

	@Source("../images/Down.png")
	ImageResource down();

	@Source("../images/Erase.png")
	ImageResource erase();

	@Source("../images/Help.png")
	ImageResource help();

	@Source("../images/Information.png")
	ImageResource information();

	@Source("../images/Minus.png")
	ImageResource minus();

	@Source("../images/Next.png")
	ImageResource next();

	@Source("../images/No.png")
	ImageResource no();

	@Source("../images/Options.png")
	ImageResource options();

	@Source("../images/Previous.png")
	ImageResource previous();

	@Source("../images/Question.png")
	ImageResource question();

	@Source("../images/Refresh.png")
	ImageResource refresh();

	@Source("../images/Renew.png")
	ImageResource renew();

	@Source("../images/Run.png")
	ImageResource run();

	@Source("../images/Search.png")
	ImageResource search();

	@Source("../images/Stop.png")
	ImageResource stop();

	@Source("../images/System.png")
	ImageResource system();

}
