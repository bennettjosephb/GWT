package com.gwt.sample.client.gin;

import com.google.web.bindery.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.inject.Provider;
import com.gwt.sample.client.content.ContactDetailsOverviewPresenter;
import com.gwt.sample.client.content.ContactDetailsPresenter;
import com.gwt.sample.client.content.ContentContainerPresenter;
import com.gwt.sample.client.content.ContentPresenter;
import com.gwt.sample.client.content.CurrentDetailsOverviewPresenter;
import com.gwt.sample.client.content.EducationDetailsPresenter;
import com.gwt.sample.client.content.EmployerPresenter;
import com.gwt.sample.client.content.MainContentPresenter;
import com.gwt.sample.client.content.ManageCoverLetterPresenter;
import com.gwt.sample.client.content.ManagePhotoPresenter;
import com.gwt.sample.client.content.ManageResumePresenter;
import com.gwt.sample.client.content.ProfileEditPresenter;
import com.gwt.sample.client.content.ProfileOverviewPresenter;
import com.gwt.sample.client.content.ProjectDetailsPresenter;
import com.gwt.sample.client.content.SettingsPresenter;
import com.gwt.sample.client.content.SkillDetailsPresenter;
import com.gwt.sample.client.content.SnapshotPresenter;
import com.gwt.sample.client.content.SummaryPresenter;
import com.gwt.sample.client.content.VisibilitySettingsPresenter;
import com.gwt.sample.client.core.MainPagePresenter;
import com.gwt.sample.client.core.ResponsePresenter;
import com.gwt.sample.client.login.LoginPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountDetailPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountRootPresenter;
import com.gwt.sample.client.login.createaccount.TestPresenter;
import com.gwt.sample.client.login.createaccount.temp.RootTempPresenter;
import com.gwt.sample.client.login.createaccount.temp.SimpleContentPresenter;
import com.gwt.sample.client.login.createaccount.temp.SimpleTestPresenter;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwt.sample.client.content.SkillSetPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	Provider<MainPagePresenter> getMainPagePresenter();

	Provider<ResponsePresenter> getResponsePresenter();

	AsyncProvider<LoginPresenter> getLoginPresenter();

	AsyncProvider<ContentPresenter> getContentPresenter();

	AsyncProvider<MainContentPresenter> getMainContentPresenter();

	AsyncProvider<ContentContainerPresenter> getContentContainerPresenter();

	AsyncProvider<ProfileOverviewPresenter> getProfileOverviewPresenter();

	AsyncProvider<ProfileEditPresenter> getProfileEditPresenter();

	AsyncProvider<CreateAccountRootPresenter> getCreateAccountRootPresenter();

	AsyncProvider<CreateAccountDetailPresenter> getCreateAccountDetailPresenter();

	AsyncProvider<RootTempPresenter> getRootTempPresenter();

	AsyncProvider<SimpleTestPresenter> getSimpleTestPresenter();

	AsyncProvider<SimpleContentPresenter> getSimpleContentPresenter();

	AsyncProvider<TestPresenter> getTestPresenter();

	AsyncProvider<CurrentDetailsOverviewPresenter> getCurrentDetailsOverviewPresenter();

	AsyncProvider<ManageResumePresenter> getManageResumePresenter();

	AsyncProvider<ManagePhotoPresenter> getManagePhotoPresenter();

	AsyncProvider<ManageCoverLetterPresenter> getManageCoverLetterPresenter();

	AsyncProvider<EmployerPresenter> getEmployerPresenter();

	AsyncProvider<EducationDetailsPresenter> getEducationDetailPresenter();

	AsyncProvider<ProjectDetailsPresenter> getProjectDetailsPresenter();

	AsyncProvider<SnapshotPresenter> getSnapshotPresenter();

	AsyncProvider<SummaryPresenter> getSummaryPresenter();

	AsyncProvider<VisibilitySettingsPresenter> getVisibilitySettingsPresenter();

	AsyncProvider<SettingsPresenter> getSettingsPresenter();

	AsyncProvider<ContactDetailsPresenter> getContactDetailsPresenter();

	AsyncProvider<ContactDetailsOverviewPresenter> getContactDetailsOverviewPresenter();

	AsyncProvider<SkillDetailsPresenter> getSkillDetailsPresenter();

	AsyncProvider<SkillSetPresenter> getSkillsetPresenter();

}
