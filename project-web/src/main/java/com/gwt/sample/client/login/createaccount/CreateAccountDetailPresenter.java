package com.gwt.sample.client.login.createaccount;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.i18n.client.constants.DateTimeConstantsImpl;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.inject.Inject;
import com.gwt.sample.client.login.createaccount.event.CreateAccountEvent;
import com.gwt.sample.client.login.createaccount.event.CreateAccountHandler;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.dispatch.shared.DispatchAsync;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;

public class CreateAccountDetailPresenter
		extends
		Presenter<CreateAccountDetailViewInterface, CreateAccountDetailPresenter.MyProxy> {

	// public interface MyView extends View {
	// public TextBox getFirstName();
	//
	// public void setFirstName(TextBox firstName);
	//
	// public TextBox getLastName();
	//
	// public void setLastName(TextBox lastName);
	//
	// public TextBox getUsername();
	//
	// public void setUsername(TextBox username);
	//
	// public PasswordTextBox getPassword();
	//
	// public void setPassword(PasswordTextBox password);
	//
	// public PasswordTextBox getConfirmPassword();
	//
	// public void setConfirmPassword(PasswordTextBox confirmPassword);
	//
	// public ListBox getMonthBD();
	//
	// public void setMonthBD(ListBox monthBD);
	//
	// public TextBox getDateBD();
	//
	// public void setDateBD(TextBox dateBD);
	//
	// public TextBox getYearBD();
	//
	// public void setYearBD(TextBox yearBD);
	//
	// public TextBox getGender();
	//
	// public void setGender(TextBox gender);
	//
	// public SuggestBox getLocation();
	//
	// public void setLocation(SuggestBox location);
	//
	// public TextBox getPhoneNumber();
	//
	// public void setPhoneNumber(TextBox phoneNumber);
	//
	// public SubmitButton getSubmit();
	//
	// public void setSubmit(SubmitButton submit);
	//
	// }

	private EventBus eventBus;

	@ProxyCodeSplit
	@NameToken(NameTokens.createaccount)
	public interface MyProxy extends ProxyPlace<CreateAccountDetailPresenter> {
	}

	@Inject
	public CreateAccountDetailPresenter(final EventBus eventBus,
			final CreateAccountDetailViewInterface view,
			final CreateAccountDetailPresenter.MyProxy proxy,
			DateTimeConstantsImpl dateTimeConstants,
			CreateAccountConstants createAccountConstants) {
		super(eventBus, view, proxy);
		this.eventBus = eventBus;
		this.dateTimeConstants = dateTimeConstants;
		this.createAccountConstants = createAccountConstants;
	}

	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this,
				CreateAccountRootPresenter.MAIN_CONTENT_SLOT, this);
	}

	Boolean confirmPasswordTextBoxEntered = false;

	Boolean passwordTextBoxEntered = false;

	Boolean usernameTextBoxEntered = false;

	Boolean locationSuggestBoxEntered = false;

	Boolean phoneNumberTextBoxEntered = false;

	Boolean firstNameTextBoxEntered = false;

	Boolean lastNameTextBoxEntered = false;

	DateTimeConstantsImpl dateTimeConstants;

	CreateAccountConstants createAccountConstants;

	@Override
	protected void onBind() {
		super.onBind();
		getView().getFirstName().getElement()
				.setAttribute("placeHolder", "First");
		getView().getLastName().getElement()
				.setAttribute("placeHolder", "Last");
		((MultiWordSuggestOracle) getView().getLocation().getSuggestOracle())
				.addAll(createCountriesOracle());

		String months[] = dateTimeConstants.months();
		getView().getMonthBD().addItem("Month", "-1");
		for (Integer i = 0; i < months.length; i++) {
			getView().getMonthBD().addItem(months[i], i.toString());
		}

		String genders[] = createAccountConstants.gender();
		getView().getGender().addItem("Gender", "-1");
		for (Integer i = 0; i < genders.length; i++) {
			getView().getGender().addItem(genders[i], i.toString());
		}

		getView().getUsername().addFocusHandler(new FocusHandler() {

			public void onFocus(FocusEvent event) {
				// usernameTextBoxEntered = true;
			}
		});

		getView().getUsername().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkUsername(getView().getUsername(),
						getView().getUsernameErrorLabel());
				// if (usernameTextBoxEntered
				// && (!TextBoxUtil.isEmpty(getView().getUsername()))) {
				// getView().getUsernameErrorLabel().setText("Error");
				// } else {
				// getView().getUsernameErrorLabel().setText("");
				// }
			}
		});

		getView().getPassword().addFocusHandler(new FocusHandler() {

			public void onFocus(FocusEvent event) {
				// passwordTextBoxEntered = true;
			}
		});

		getView().getPassword().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				// if (passwordTextBoxEntered
				// && (!TextBoxUtil.isEmpty(getView().getPassword()))) {
				// getView().getPasswordErrorLabel().setText("Error");
				// } else {
				// getView().getPasswordErrorLabel().setText("");
				// }
				CreateAccountHelper.checkPassword(getView().getPassword(),
						getView().getPasswordErrorLabel());
				// passwordEquals(getView().getPasswordErrorLabel(),
				// "Not Equal Password");
			}
		});

		getView().getConfirmPassword().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				// confirmPasswordTextBoxEntered = true;
			}
		});

		getView().getConfirmPassword().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkConfirmPassword(getView()
						.getConfirmPassword(), getView()
						.getConfirmPasswordErrorLabel());
				// if (confirmPasswordTextBoxEntered
				// && (!TextBoxUtil.isEmpty(getView().getConfirmPassword()))) {
				// getView().getConfirmPasswordErrorLabel().setText("Error");
				// } else {
				// getView().getConfirmPasswordErrorLabel().setText("");
				// }
				// passwordEquals(getView().getConfirmPasswordErrorLabel(),
				// "Not Equal Confirm Password");
			}
		});

		getView().getYearBD().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				// confirmPasswordTextBoxEntered = true;
			}
		});

		getView().getYearBD().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkYearBD(getView().getYearBD(),
						getView().getDateOfBirthErrorLabel());
				// if (confirmPasswordTextBoxEntered
				// && (!TextBoxUtil.isEmpty(getView().getConfirmPassword()))) {
				// getView().getConfirmPasswordErrorLabel().setText("Error");
				// } else {
				// getView().getConfirmPasswordErrorLabel().setText("");
				// }
				// passwordEquals(getView().getConfirmPasswordErrorLabel(),
				// "Not Equal Confirm Password");
			}
		});

		getView().getDateBD().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				// confirmPasswordTextBoxEntered = true;
			}
		});

		getView().getDateBD().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkDateBD(getView().getDateBD(),
						getView().getDateOfBirthErrorLabel());
			}
		});

		getView().getMonthBD().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				// confirmPasswordTextBoxEntered = true;
			}
		});

		getView().getMonthBD().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkMonthBD(getView().getMonthBD(),
						getView().getDateOfBirthErrorLabel());
			}
		});

		getView().getGender().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				// confirmPasswordTextBoxEntered = true;
			}
		});

		getView().getGender().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkGender(getView().getGender(),
						getView().getGenderErrorLabel());
			}
		});

		getView().getLocation().getValueBox()
				.addFocusHandler(new FocusHandler() {
					public void onFocus(FocusEvent event) {
						// locationSuggestBoxEntered = true;
					}
				});

		getView().getLocation().getValueBox().addBlurHandler(new BlurHandler() {
			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkLocation(getView().getLocation(),
						getView().getLocationErrorLabel());
				// if (locationSuggestBoxEntered
				// && (!SuggestBoxUtil.isEmpty(getView().getLocation()))) {
				// getView().getLocationErrorLabel().setText("Error");
				// } else {
				// getView().getLocationErrorLabel().setText("");
				// }
			}
		});

		getView().getPhoneNumber().addFocusHandler(new FocusHandler() {
			public void onFocus(FocusEvent event) {
				// phoneNumberTextBoxEntered = true;
			}
		});

		getView().getPhoneNumber().addBlurHandler(new BlurHandler() {
			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkPhoneNumber(
						getView().getPhoneNumber(), getView()
								.getPhoneNumberErrorLabel());
				// if (phoneNumberTextBoxEntered
				// && (!TextBoxUtil.isEmpty(getView().getPhoneNumber()))) {
				// getView().getPhoneNumberErrorLabel().setText("Error");
				// } else {
				// getView().getPhoneNumberErrorLabel().setText("");
				// }
			}
		});

		getView().getFirstName().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				firstNameTextBoxEntered = true;
			}
		});

		getView().getFirstName().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkName(firstNameTextBoxEntered, lastNameTextBoxEntered, getView().getFirstName(), getView().getLastName(),
						getView().getNameErrorLabel());
			}
		});

		getView().getLastName().addFocusHandler(new FocusHandler() {

			@Override
			public void onFocus(FocusEvent event) {
				lastNameTextBoxEntered = true;
				// if (getView().getFirstName().getText() == null
				// || getView().getFirstName().getText().trim().length() == 0
				// || getView().getFirstName().getText().trim()
				// .equalsIgnoreCase("first")) {
				// getView().getFirstName().getElement()
				// .setAttribute("placeHolder", "First");
				// }
			}
		});

		getView().getLastName().addBlurHandler(new BlurHandler() {

			@Override
			public void onBlur(BlurEvent event) {
				CreateAccountHelper.checkName(firstNameTextBoxEntered, lastNameTextBoxEntered, getView().getFirstName(), getView().getLastName(),
						getView().getNameErrorLabel());
			}
		});

		getView().getSubmit().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				CreateAccountEvent createAccountEvent = new CreateAccountEvent(
						getView().getUsername().getText(), getView()
								.getPassword().getText(), getView()
								.getConfirmPassword().getText(), getView()
								.getDateBD().getText()
								+ "/"
								+ getView().getMonthBD().getValue(
										getView().getMonthBD()
												.getSelectedIndex())
								+ "/"
								+ getView().getYearBD().getText(), getView()
								.getGender().getItemText(
										getView().getGender()
												.getSelectedIndex()), getView()
								.getLocation().getText(), getView()
								.getPhoneNumber().getText(), getView()
								.getFirstName().getText(), getView()
								.getLastName().getText());
				eventBus.fireEvent(createAccountEvent);
			}
		});

		getView().getFirstName();

		eventBus.addHandler(CreateAccountEvent.TYPE, createAccountHandler);

	}

	@Inject
	DispatchAsync dispatchAsync;

	private CreateAccountHandler createAccountHandler = new CreateAccountHandler() {

		@Override
		public void onCreateAccount(CreateAccountEvent event) {
			CreateAccountAction createAccountAction = new CreateAccountAction(
					event.getUsername(), event.getPassword(),
					event.getConfirmPassword(), event.getDateOfBirth(),
					event.getGender(), event.getLocation(),
					event.getPhoneNumber(), event.getFirstName(),
					event.getLastName());
			dispatchAsync.execute(createAccountAction,
					createAccountActionResult);
		}
	};

	private final AsyncCallback<CreateAccountActionResult> createAccountActionResult = new AsyncCallback<CreateAccountActionResult>() {

		@Override
		public void onSuccess(CreateAccountActionResult result) {
			if (result.getAccountedCreated()) {
				// Window.alert("redirect"+GWT.getModuleBaseURL()+"#newURL");
				// Window.Location.replace(GWT.getModuleBaseURL()+"#newURL");
				History.newItem("homepage");
			}
			// Window.alert(result.getSessionId());
		}

		@Override
		public void onFailure(Throwable caught) {
		}
	};

	@Override
	protected void onHide() {
		super.onHide();
	}

	@Override
	protected void onReset() {
		super.onReset();
	}

	@Override
	protected void onReveal() {
		super.onReveal();
	}

	@Override
	protected void onUnbind() {
		super.onUnbind();
	}

	List<String> createCountriesOracle() {
		List<String> oracle = new ArrayList<String>();

		oracle.add("Afghanistan");
		oracle.add("Albania");
		oracle.add("Algeria");
		oracle.add("American Samoa");
		oracle.add("Andorra");
		oracle.add("Angola");
		oracle.add("Anguilla");
		oracle.add("Antarctica");
		oracle.add("Antigua And Barbuda");
		oracle.add("Argentina");
		oracle.add("Armenia");
		oracle.add("Aruba");
		oracle.add("Australia");
		oracle.add("Austria");
		oracle.add("Azerbaijan");
		oracle.add("Bahamas");
		oracle.add("Bahrain");
		oracle.add("Bangladesh");
		oracle.add("Barbados");
		oracle.add("Belarus");
		oracle.add("Belgium");
		oracle.add("Belize");
		oracle.add("Benin");
		oracle.add("Bermuda");
		oracle.add("Bhutan");
		oracle.add("Bolivia");
		oracle.add("Bosnia And Herzegovina");
		oracle.add("Botswana");
		oracle.add("Bouvet Island");
		oracle.add("Brazil");
		oracle.add("British Indian Ocean Territory");
		oracle.add("Brunei Darussalam");
		oracle.add("Bulgaria");
		oracle.add("Burkina Faso");
		oracle.add("Burundi");
		oracle.add("Cambodia");
		oracle.add("Cameroon");
		oracle.add("Canada");
		oracle.add("Cape Verde");
		oracle.add("Cayman Islands");
		oracle.add("Central African Republic");
		oracle.add("Chad");
		oracle.add("Chile");
		oracle.add("China");
		oracle.add("Christmas Island");
		oracle.add("Cocos (Keeling) Islands");
		oracle.add("Colombia");
		oracle.add("Comoros");
		oracle.add("Congo, The Democratic Republic Of The");
		oracle.add("Congo");
		oracle.add("Cook Islands");
		oracle.add("Costa Rica");
		oracle.add("Cote D''ivoire");
		oracle.add("Croatia");
		oracle.add("Cuba");
		oracle.add("Cyprus");
		oracle.add("Czech Republic");
		oracle.add("Denmark");
		oracle.add("Djibouti");
		oracle.add("Dominica");
		oracle.add("Dominican Republic");
		oracle.add("East Timor");
		oracle.add("Ecuador");
		oracle.add("Egypt");
		oracle.add("El Salvador");
		oracle.add("Equatorial Guinea");
		oracle.add("Eritrea");
		oracle.add("Estonia");
		oracle.add("Ethiopia");
		oracle.add("Falkland Islands (Malvinas)");
		oracle.add("Faroe Islands");
		oracle.add("Fiji");
		oracle.add("Finland");
		oracle.add("France");
		oracle.add("French Guiana");
		oracle.add("French Polynesia");
		oracle.add("French Southern Territories");
		oracle.add("Gabon");
		oracle.add("Gambia");
		oracle.add("Georgia");
		oracle.add("Germany");
		oracle.add("Ghana");
		oracle.add("Gibraltar");
		oracle.add("Greece");
		oracle.add("Greenland");
		oracle.add("Grenada");
		oracle.add("Guadeloupe");
		oracle.add("Guam");
		oracle.add("Guatemala");
		oracle.add("Guinea-Bissau");
		oracle.add("Guinea");
		oracle.add("Guyana");
		oracle.add("Haiti");
		oracle.add("Heard Island And Mcdonald Islands");
		oracle.add("Holy See (Vatican City State)");
		oracle.add("Honduras");
		oracle.add("Hong Kong");
		oracle.add("Hungary");
		oracle.add("Iceland");
		oracle.add("India");
		oracle.add("Indonesia");
		oracle.add("Iran, Islamic Republic Of");
		oracle.add("Iraq");
		oracle.add("Ireland");
		oracle.add("Israel");
		oracle.add("Italy");
		oracle.add("Jamaica");
		oracle.add("Japan");
		oracle.add("Jordan");
		oracle.add("Kazakstan");
		oracle.add("Kenya");
		oracle.add("Kiribati");
		oracle.add("Korea, Democratic People''s Republic Of");
		oracle.add("Korea, Republic Of");
		oracle.add("Kuwait");
		oracle.add("Kyrgyzstan");
		oracle.add("Lao People''s Democratic Republic");
		oracle.add("Latvia");
		oracle.add("Lebanon");
		oracle.add("Lesotho");
		oracle.add("Liberia");
		oracle.add("Libyan Arab Jamahiriya");
		oracle.add("Liechtenstein");
		oracle.add("Lithuania");
		oracle.add("Luxembourg");
		oracle.add("Macau");
		oracle.add("Macedonia, The Former Yugoslav Republic Of");
		oracle.add("Madagascar");
		oracle.add("Malawi");
		oracle.add("Malaysia");
		oracle.add("Maldives");
		oracle.add("Mali");
		oracle.add("Malta");
		oracle.add("Marshall Islands");
		oracle.add("Martinique");
		oracle.add("Mauritania");
		oracle.add("Mauritius");
		oracle.add("Mayotte");
		oracle.add("Mexico");
		oracle.add("Micronesia, Federated States Of");
		oracle.add("Moldova, Republic Of");
		oracle.add("Monaco");
		oracle.add("Mongolia");
		oracle.add("Montserrat");
		oracle.add("Morocco");
		oracle.add("Mozambique");
		oracle.add("Myanmar");
		oracle.add("Namibia");
		oracle.add("Nauru");
		oracle.add("Nepal");
		oracle.add("Netherlands Antilles");
		oracle.add("Netherlands");
		oracle.add("New Caledonia");
		oracle.add("New Zealand");
		oracle.add("Nicaragua");
		oracle.add("Niger");
		oracle.add("Nigeria");
		oracle.add("Niue");
		oracle.add("Norfolk Island");
		oracle.add("Northern Mariana Islands");
		oracle.add("Norway");
		oracle.add("Oman");
		oracle.add("Pakistan");
		oracle.add("Palau");
		oracle.add("Palestinian Territory, Occupied");
		oracle.add("Panama");
		oracle.add("Papua New Guinea");
		oracle.add("Paraguay");
		oracle.add("Peru");
		oracle.add("Philippines");
		oracle.add("Pitcairn");
		oracle.add("Poland");
		oracle.add("Portugal");
		oracle.add("Puerto Rico");
		oracle.add("Qatar");
		oracle.add("Reunion");
		oracle.add("Romania");
		oracle.add("Russian Federation");
		oracle.add("Rwanda");
		oracle.add("Saint Helena");
		oracle.add("Saint Kitts And Nevis");
		oracle.add("Saint Lucia");
		oracle.add("Saint Pierre And Miquelon");
		oracle.add("Saint Vincent And The Grenadines");
		oracle.add("Samoa");
		oracle.add("San Marino");
		oracle.add("Sao Tome And Principe");
		oracle.add("Saudi Arabia");
		oracle.add("Senegal");
		oracle.add("Seychelles");
		oracle.add("Sierra Leone");
		oracle.add("Singapore");
		oracle.add("Slovakia");
		oracle.add("Slovenia");
		oracle.add("Solomon Islands");
		oracle.add("Somalia");
		oracle.add("South Africa");
		oracle.add("South Georgia And The South Sandwich Islands");
		oracle.add("Spain");
		oracle.add("Sri Lanka");
		oracle.add("Sudan");
		oracle.add("Suriname");
		oracle.add("Svalbard And Jan Mayen");
		oracle.add("Swaziland");
		oracle.add("Sweden");
		oracle.add("Switzerland");
		oracle.add("Syrian Arab Republic");
		oracle.add("Taiwan, Province Of China");
		oracle.add("Tajikistan");
		oracle.add("Tanzania, United Republic Of");
		oracle.add("Thailand");
		oracle.add("Togo");
		oracle.add("Tokelau");
		oracle.add("Tonga");
		oracle.add("Trinidad And Tobago");
		oracle.add("Tunisia");
		oracle.add("Turkey");
		oracle.add("Turkmenistan");
		oracle.add("Turks And Caicos Islands");
		oracle.add("Tuvalu");
		oracle.add("Uganda");
		oracle.add("Ukraine");
		oracle.add("United Arab Emirates");
		oracle.add("United Kingdom");
		oracle.add("United States Minor Outlying Islands");
		oracle.add("United States");
		oracle.add("Uruguay");
		oracle.add("Uzbekistan");
		oracle.add("Vanuatu");
		oracle.add("Venezuela");
		oracle.add("Viet Nam");
		oracle.add("Virgin Islands, British");
		oracle.add("Virgin Islands, U.S.");
		oracle.add("Wallis And Futuna");
		oracle.add("Western Sahara");
		oracle.add("Yemen");
		oracle.add("Yugoslavia");
		oracle.add("Zambia");
		oracle.add("Zimbabwe");

		return oracle;
	}
}
