package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.Result;
import java.lang.String;

public class ContactDetailsOverviewResult implements Result {

	private String temporaryStreet1;
	private String temporaryStreet2;
	private String temporaryCity;
	private String temporaryState;
	private String temporaryZipCode;
	private String temporaryCountry;
	private String permanentStreet1;
	private String permanentStreet2;
	private String permanentCity;
	private String permanentState;
	private String permanentZipCode;
	private String permanentCountry;
	private String faxNumber;
	private String workNumber;
	private String homeNumber;
	private String mobileNumber;
	private String eMailId;
	private String copyAddress;

	@SuppressWarnings("unused")
	private ContactDetailsOverviewResult() {
		// For serialization only
	}

	public ContactDetailsOverviewResult(String temporaryStreet1,
			String temporaryStreet2, String temporaryCity, String temporaryState,
			String temporaryZipCode, String temporaryCountry,
			String permanentStreet1, String permanentStreet2, String permanentCity,
			String permanentState, String permanentZipCode,
			String permanentCountry, String faxNumber, String workNumber,
			String homeNumber, String mobileNumber, String eMailId, String copyAddress) {
		this.temporaryStreet1 = temporaryStreet1;
		this.temporaryStreet2 = temporaryStreet2;
		this.temporaryCity = temporaryCity;
		this.temporaryState = temporaryState;
		this.temporaryZipCode = temporaryZipCode;
		this.temporaryCountry = temporaryCountry;
		this.permanentStreet1 = permanentStreet1;
		this.permanentStreet2 = permanentStreet2;
		this.permanentCity = permanentCity;
		this.permanentState = permanentState;
		this.permanentZipCode = permanentZipCode;
		this.permanentCountry = permanentCountry;
		this.faxNumber = faxNumber;
		this.workNumber = workNumber;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
		this.eMailId = eMailId;
		this.copyAddress = copyAddress;
	}

	public String getTemporaryStreet1() {
		return temporaryStreet1;
	}

	public String getTemporaryStreet2() {
		return temporaryStreet2;
	}

	public String getTemporaryCity() {
		return temporaryCity;
	}

	public String getTemporaryState() {
		return temporaryState;
	}

	public String getTemporaryZipCode() {
		return temporaryZipCode;
	}

	public String getTemporaryCountry() {
		return temporaryCountry;
	}

	public String getPermanentStreet1() {
		return permanentStreet1;
	}

	public String getPermanentStreet2() {
		return permanentStreet2;
	}

	public String getPermanentCity() {
		return permanentCity;
	}

	public String getPermanentState() {
		return permanentState;
	}

	public String getPermanentZipCode() {
		return permanentZipCode;
	}

	public String getPermanentCountry() {
		return permanentCountry;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public String getWorkNumber() {
		return workNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getCopyAddress() {
		return copyAddress;
	}

	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}
}
