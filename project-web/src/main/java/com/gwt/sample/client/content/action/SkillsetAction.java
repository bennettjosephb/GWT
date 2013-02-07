package com.gwt.sample.client.content.action;

import com.gwtplatform.dispatch.shared.ActionImpl;
import com.gwt.sample.client.content.action.SkillsetActionResult;
import java.lang.String;
import java.lang.Integer;

public class SkillsetAction extends ActionImpl<SkillsetActionResult> {

	private String skillName;
	private String version;
	private Integer expYear;
	private Integer expMonth;
	private Integer lastUsedYear;
	private Integer lastUsedMonth;

	@SuppressWarnings("unused")
	private SkillsetAction() {
		// For serialization only
	}
	
	@Override
	public boolean isSecured() {
		// TODO Auto-generated method stub
		return false;
	}

	public SkillsetAction(String skillName, String version, Integer expYear,
			Integer expMonth, Integer lastUsedYear, Integer lastUsedMonth) {
		this.skillName = skillName;
		this.version = version;
		this.expYear = expYear;
		this.expMonth = expMonth;
		this.lastUsedYear = lastUsedYear;
		this.lastUsedMonth = lastUsedMonth;
	}

	public String getSkillName() {
		return skillName;
	}

	public String getVersion() {
		return version;
	}

	public Integer getExpYear() {
		return expYear;
	}

	public Integer getExpMonth() {
		return expMonth;
	}

	public Integer getLastUsedYear() {
		return lastUsedYear;
	}

	public Integer getLastUsedMonth() {
		return lastUsedMonth;
	}
}
