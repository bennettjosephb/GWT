package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.HasKeyDownHandlers;
import com.google.gwt.event.dom.client.HasKeyPressHandlers;
import com.google.gwt.event.dom.client.HasKeyUpHandlers;


public interface HasAllKeyHandlers extends HasKeyDownHandlers, HasKeyUpHandlers,
HasKeyPressHandlers {

}
