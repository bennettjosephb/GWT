package au.com.showcase.application.client.ui.event;

import com.google.gwt.event.dom.client.HasMouseDownHandlers;
import com.google.gwt.event.dom.client.HasMouseMoveHandlers;
import com.google.gwt.event.dom.client.HasMouseOutHandlers;
import com.google.gwt.event.dom.client.HasMouseOverHandlers;
import com.google.gwt.event.dom.client.HasMouseUpHandlers;
import com.google.gwt.event.dom.client.HasMouseWheelHandlers;

public interface HasAllMouseHandlers extends HasMouseDownHandlers, HasMouseUpHandlers,
HasMouseOutHandlers, HasMouseOverHandlers, HasMouseMoveHandlers, HasMouseWheelHandlers {

}
