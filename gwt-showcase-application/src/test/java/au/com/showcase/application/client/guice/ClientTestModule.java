/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/
package au.com.showcase.application.client.guice;

import au.com.showcase.application.client.home.MainContentPresenter;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.event.shared.testing.CountingEventBus;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.gwtplatform.dispatch.server.Dispatch;
import com.gwtplatform.dispatch.shared.Action;
import com.gwtplatform.dispatch.shared.ActionException;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.dispatch.shared.Result;
import com.gwtplatform.mvp.client.proxy.PlaceManager;

/**
 * Guice module used to test presenters
 * 
 * @author manolo
 * 
 */
//public class ClientTestModule extends AbstractModule {

//  protected DispatchAsync dispatchAsyncInstance = null;
//  protected Class<? extends DispatchAsync> dispatchAsyncClass = MockedDispatchAsync.class;
//  
//  @Override
//  protected void configure() {
//
//    if (dispatchAsyncInstance == null) {
//      bind(DispatchAsync.class).to(dispatchAsyncClass).in(Singleton.class);
//    } else {
//      bind(DispatchAsync.class).toInstance(dispatchAsyncInstance);
//    }
//
//    bind(EventBus.class).to(CountingEventBus.class).asEagerSingleton();
//
//    easyBind(PlaceManager.class);
//
////    bind(MainContentPresenter.class).asEagerSingleton();
////    bind(MainContentPresenter.MyView.class).to(MockedMainView.class).asEagerSingleton();
//
////    bind(ContactsPresenter.class).asEagerSingleton();
////    easyBind(ContactsPresenter.Display.class);
////    
////    bind(EditContactPresenter.class).asEagerSingleton();
////    bind(EditContactPresenter.Display.class).to(MockedEditContactsView.class).asEagerSingleton();
//    
////    EasyMock.createNiceMock(MainPresenter.Display.class);
//  }
//
//  protected <D> void easyBind(final Class<D> clazz) {
////    final D mockDisplay = EasyMock.createNiceMock(clazz);
////    bind(clazz).toInstance(mockDisplay);
//  }

  /**
   * Dispatch Asynchronous implementation for testing 
   */
//  static public class MockedDispatchAsync implements DispatchAsync {
//    private DefaultDispatch dispatch;
//
//    @Inject
//    public MockedDispatchAsync(Dispatch dispatch) {
//      this.dispatch = (DefaultDispatch) dispatch;
//    }
//
//    public <A extends Action<R>, R extends Result> void execute(A action,
//        AsyncCallback<R> callback) {
//      try {
//        R result = dispatch.execute(action);
//        callback.onSuccess(result);
//      } catch (ActionException e) {
//        callback.onFailure(e);
//      }
//    }
//  }
//
//  public static class MockedMainView implements MainContentPresenter.MyView {
//    Widget w;
//    public void addWidget(Widget widget) {
//    }
//    public void removeWidget(Widget widget) {
//    }
//    public void showWidget(Widget widget) {
//      w = widget;
//    }
//    public Widget asWidget() {
//      return w;
//    }
//	public void addToSlot(Object slot, Widget content) {
//		
//	}
//	public void removeFromSlot(Object slot, Widget content) {
//		
//	}
//	public void setInSlot(Object slot, Widget content) {
//		
//	}
//  }
//  
//  public static class MockedEditContactsView implements EditContactPresenter.Display {
//    HasClickHandlers aClick = new HasClickHandlers() {
//      public void fireEvent(GwtEvent<?> event) {
//      }
//      public HandlerRegistration addClickHandler(ClickHandler handler) {
//        return null;
//      }
//    };
//    Widget aWidget = new Widget();
//    HasText aText = EasyMock.createNiceMock(HasText.class);
//
//    public HasClickHandlers getCancelButton() {
//      return aClick;
//    }
//    public HasClickHandlers getSaveButton() {
//      return aClick;
//    }
//    public Widget asWidget() {
//      return aWidget;
//    }
//    public HasText getEmailAddress() {
//      return aText;
//    }
//    public HasText getFirstName() {
//      return aText;
//    }
//    public HasText getLastName() {
//      return aText;
//    }
//  }

//}