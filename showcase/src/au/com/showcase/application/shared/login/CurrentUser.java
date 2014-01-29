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

package au.com.showcase.application.shared.login;

public class CurrentUser {

	private String login;

	private Boolean loggedIn = true;
	private Boolean administrator;

	private String role;

	// private Boolean authenticated = true;
	// private String email;
	// private String nickname;
	// private String realName;
	// private String locale;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public CurrentUser(String login) {
		this.login = login;
	}

	public String getLogin() {
		return login;
	}

	public Boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public Boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(Boolean administrator) {
		this.administrator = administrator;
	}
}
