package au.com.showcase.application.client;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.EventHandler;
import java.lang.String;
import com.google.gwt.event.shared.HasHandlers;

public class MessageEvent extends GwtEvent<MessageEvent.MessageHandler> {

	public static Type<MessageHandler> TYPE = new Type<MessageHandler>();
	private String first;
	private String second;
	private String third;
	private String forth;
	private String fifth;

	public interface MessageHandler extends EventHandler {
		void onMessage(MessageEvent event);
	}

	public MessageEvent(String first, String second, String third, String forth,
			String fifth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.forth = forth;
		this.fifth = fifth;
	}

	public String getFirst() {
		return first;
	}

	public String getSecond() {
		return second;
	}

	public String getThird() {
		return third;
	}

	public String getForth() {
		return forth;
	}

	public String getFifth() {
		return fifth;
	}

	@Override
	protected void dispatch(MessageHandler handler) {
		handler.onMessage(this);
	}

	@Override
	public Type<MessageHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<MessageHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String first, String second,
			String third, String forth, String fifth) {
		source.fireEvent(new MessageEvent(first, second, third, forth, fifth));
	}
}
