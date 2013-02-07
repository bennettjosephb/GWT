package com.gwt.sample.client.content.event;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.event.shared.HasHandlers;

public class SkillsetEvent extends GwtEvent<SkillsetHandler> {

	public static Type<SkillsetHandler> TYPE = new Type<SkillsetHandler>();
	private String skillName;
	private String version;
	private Integer lastUsedMonth;
	private Integer lastUsedYear;
	private Integer expYear;
	private Integer expMonth;

//	public interface SkillsetHandler extends EventHandler {
//		void onSkillset(SkillsetEvent event);
//	}

	public SkillsetEvent(String skillName, String version, Integer lastUsedMonth,
			Integer lastUsedYear, Integer expYear, Integer expMonth) {
		this.skillName = skillName;
		this.version = version;
		this.lastUsedMonth = lastUsedMonth;
		this.lastUsedYear = lastUsedYear;
		this.expYear = expYear;
		this.expMonth = expMonth;
	}

	public String getSkillName() {
		return skillName;
	}

	public String getVersion() {
		return version;
	}

	public Integer getLastUsedMonth() {
		return lastUsedMonth;
	}

	public Integer getLastUsedYear() {
		return lastUsedYear;
	}

	public Integer getExpYear() {
		return expYear;
	}

	public Integer getExpMonth() {
		return expMonth;
	}

	@Override
	protected void dispatch(SkillsetHandler handler) {
		handler.onSkillset(this);
	}

	@Override
	public Type<SkillsetHandler> getAssociatedType() {
		return TYPE;
	}

	public static Type<SkillsetHandler> getType() {
		return TYPE;
	}

	public static void fire(HasHandlers source, String skillName, String version,
			Integer lastUsedMonth, Integer lastUsedYear, Integer expYear,
			Integer expMonth) {
		source.fireEvent(new SkillsetEvent(skillName, version, lastUsedMonth,
				lastUsedYear, expYear, expMonth));
	}
}
