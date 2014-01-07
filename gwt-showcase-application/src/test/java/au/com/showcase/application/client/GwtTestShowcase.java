package au.com.showcase.application.client;

import au.com.showcase.application.client.home.MainContentPresenter;
import au.com.showcase.application.shared.FieldVerifier;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

/**
 * GWT JUnit <b>integration</b> tests must extend GWTTestCase. Using
 * <code>"GwtTest*"</code> naming pattern exclude them from running with
 * surefire during the test phase.
 * 
 * If you run the tests using the Maven command line, you will have to navigate
 * with your browser to a specific url given by Maven. See
 * http://mojo.codehaus.org/gwt-maven-plugin/user-guide/testing.html for
 * details.
 */
public class GwtTestShowcase extends GWTTestCase {

	/**
	 * Must refer to a valid module that sources this class.
	 */
	public String getModuleName() {
		return "au.com.showcase.application.ShowcaseJUnit";
	}

	/**
	 * Tests the FieldVerifier.
	 */
	public void testFieldVerifier() {
		assertFalse(FieldVerifier.isValidName(null));
		assertFalse(FieldVerifier.isValidName(""));
		assertFalse(FieldVerifier.isValidName("a"));
		assertFalse(FieldVerifier.isValidName("ab"));
		assertFalse(FieldVerifier.isValidName("abc"));
		assertTrue(FieldVerifier.isValidName("abcd"));
	}

	/**
	 * This test will send a request to the server using the greetServer method
	 * in GreetingService and verify the response.
	 */
	public void testGreetingService() {
		// Create the service that we will test.
		GreetingServiceAsync greetingService = GWT
				.create(GreetingService.class);
		ServiceDefTarget target = (ServiceDefTarget) greetingService;
		target.setServiceEntryPoint(GWT.getModuleBaseURL() + "Showcase/greet");

		// Since RPC calls are asynchronous, we will need to wait for a response
		// after this test method returns. This line tells the test runner to
		// wait
		// up to 10 seconds before timing out.
		delayTestFinish(10000);

		// Send a request to the server.
		greetingService.greetServer("GWT User", new AsyncCallback<String>() {
			public void onFailure(Throwable caught) {
				// The request resulted in an unexpected error.
				fail("Request failure: " + caught.getMessage());
			}

			public void onSuccess(String result) {
				// Verify that the response is correct.
				assertTrue(result.startsWith("Hello, GWT User!"));

				// Now that we have received a response, we need to tell the
				// test runner
				// that the test is complete. You must call finishTest() after
				// an
				// asynchronous test finishes successfully, or the test will
				// time out.
				finishTest();
			}
		});
	}
	
	@Inject
	MainContentPresenter mainContentPresenter;
	

	public void testApplication() {
		// Run the application
		final Showcase entryPoint = new Showcase();
		
		entryPoint.onModuleLoad();
		new Timer() {
		      public void run() {
		        EventBus eventBus = entryPoint.ginjector.getEventBus();
		        AsyncProvider<MainContentPresenter> mainPresenter = entryPoint.ginjector.getMainContentPresenter();
		        MainContentPresenter.MyView mainView = mainContentPresenter.getView();
//		        mainView.
//		        ContactsPresenter contactsPresenter = entryPoint.injector.getContactsPresenter();
//		        ContactsPresenter.Display contactsView = contactsPresenter.getDisplay();
//		        EditContactPresenter editPresenter =  entryPoint.injector.getEditContactPresenter();
//		        EditContactPresenter.Display editView = editPresenter.getDisplay();
		        
		        // When the application starts, it ask for all the contacts to the presenter
//		        assertEquals(22, contactsPresenter.getContactDetails().size());
//		        
//		        // The first view presented id the list of contacts
//		        assertEquals(contactsView.asWidget(), mainView.asWidget());
//
//		        // Different events make change the view
//		        eventBus.fireEvent(new AddContactEvent());
//		        assertEquals(editView.asWidget(), mainView.asWidget());
//
//		        eventBus.fireEvent(new EditContactCancelledEvent());
//		        assertEquals(contactsView.asWidget(), mainView.asWidget());
//
//		        eventBus.fireEvent(new EditContactEvent("1"));
//		        assertEquals(editView.asWidget(), mainView.asWidget());
//
//		        eventBus.fireEvent(new ContactUpdatedEvent(null));
//		        assertEquals(contactsView.asWidget(), mainView.asWidget());
//
//		        eventBus.fireEvent(new ContactDeletedEvent());
//		        assertEquals(contactsView.asWidget(), mainView.asWidget());
		        
		        // Notify to the test system that everything was OK
//		        finishTest();
		      }
		      // wait enough time to get the first rpc data
		    }.schedule(500);
	}

}
