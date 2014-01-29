/**
 * (C) Copyright 2010, 2011 upTick Pty Ltd
 *
 * Licensed under the terms of the GNU General Public License version 3
 * as published by the Free Software Foundation. You may obtain a copy of the
 * License at: http://www.gnu.org/copyleft/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package au.com.showcase.application.client.login;

import au.com.showcase.application.shared.login.CurrentUser;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.GwtEvent;

public class LoginAuthenticatedEvent extends GwtEvent<LoginAuthenticatedEventHandler> {

  private static final Type<LoginAuthenticatedEventHandler> TYPE = new Type<LoginAuthenticatedEventHandler>();

  public static Type<LoginAuthenticatedEventHandler> getType() {
    return TYPE;
  }

  public static void fire(EventBus eventBus, CurrentUser currentUser) {
    eventBus.fireEvent(new LoginAuthenticatedEvent(currentUser));
  }

  private final CurrentUser currentUser;

  public LoginAuthenticatedEvent(CurrentUser currentUser) {
    this.currentUser = currentUser;
  }

  public CurrentUser getCurrentUser() {
    return currentUser;
  }

  @Override
  protected void dispatch(LoginAuthenticatedEventHandler handler) {
    handler.onLogin(this);
  }

  @Override
  public Type<LoginAuthenticatedEventHandler> getAssociatedType() {
    return getType();
  }
}
