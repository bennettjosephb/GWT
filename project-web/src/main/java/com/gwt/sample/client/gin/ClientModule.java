package com.gwt.sample.client.gin;

import com.gwt.sample.client.content.AddressPresenter;
import com.gwt.sample.client.content.AddressView;
import com.gwt.sample.client.content.ContactDetailsOverviewPresenter;
import com.gwt.sample.client.content.ContactDetailsOverviewView;
import com.gwt.sample.client.content.ContactDetailsPresenter;
import com.gwt.sample.client.content.ContactDetailsView;
import com.gwt.sample.client.content.ContentContainerPresenter;
import com.gwt.sample.client.content.ContentContainerView;
import com.gwt.sample.client.content.ContentFooterPresenter;
import com.gwt.sample.client.content.ContentFooterView;
import com.gwt.sample.client.content.ContentHeaderPresenter;
import com.gwt.sample.client.content.ContentHeaderView;
import com.gwt.sample.client.content.ContentMenuPresenter;
import com.gwt.sample.client.content.ContentMenuView;
import com.gwt.sample.client.content.ContentPresenter;
import com.gwt.sample.client.content.ContentView;
import com.gwt.sample.client.content.CurrentDetailsOverviewPresenter;
import com.gwt.sample.client.content.CurrentDetailsOverviewView;
import com.gwt.sample.client.content.EducationDetailsPresenter;
import com.gwt.sample.client.content.EducationDetailsView;
import com.gwt.sample.client.content.EducationDetailsDialogPresenter;
import com.gwt.sample.client.content.EducationDetailsDialogView;
import com.gwt.sample.client.content.EmployerDetailsDialogPresenter;
import com.gwt.sample.client.content.EmployerDetailsDialogView;
import com.gwt.sample.client.content.EmployerPresenter;
import com.gwt.sample.client.content.EmployerView;
import com.gwt.sample.client.content.MainContentPresenter;
import com.gwt.sample.client.content.MainContentView;
import com.gwt.sample.client.content.ManageCoverLetterPresenter;
import com.gwt.sample.client.content.ManageCoverLetterView;
import com.gwt.sample.client.content.ManagePhotoPresenter;
import com.gwt.sample.client.content.ManagePhotoView;
import com.gwt.sample.client.content.ManageResumePresenter;
import com.gwt.sample.client.content.ManageResumeView;
import com.gwt.sample.client.content.ProfileEditPresenter;
import com.gwt.sample.client.content.ProfileEditView;
import com.gwt.sample.client.content.ProfileOverviewPresenter;
import com.gwt.sample.client.content.ProfileOverviewView;
import com.gwt.sample.client.content.ProjectDetailsPresenter;
import com.gwt.sample.client.content.ProjectDetailsView;
import com.gwt.sample.client.content.SettingsPresenter;
import com.gwt.sample.client.content.SettingsView;
import com.gwt.sample.client.content.SkillDetailsPresenter;
import com.gwt.sample.client.content.SkillDetailsView;
import com.gwt.sample.client.content.SkillsetDialogPresenter;
import com.gwt.sample.client.content.SkillsetDialogView;
import com.gwt.sample.client.content.SnapshotPresenter;
import com.gwt.sample.client.content.SnapshotView;
import com.gwt.sample.client.content.SummaryPresenter;
import com.gwt.sample.client.content.SummaryView;
import com.gwt.sample.client.content.VisibilitySettingsPresenter;
import com.gwt.sample.client.content.VisibilitySettingsView;
import com.gwt.sample.client.core.MainPagePresenter;
import com.gwt.sample.client.core.MainPageView;
import com.gwt.sample.client.core.ResponsePresenter;
import com.gwt.sample.client.core.ResponseView;
import com.gwt.sample.client.login.LoginPresenter;
import com.gwt.sample.client.login.LoginView;
import com.gwt.sample.client.login.createaccount.CreateAccountDetailPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountDetailView;
import com.gwt.sample.client.login.createaccount.CreateAccountDetailViewInterface;
import com.gwt.sample.client.login.createaccount.CreateAccountFooterPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountFooterView;
import com.gwt.sample.client.login.createaccount.CreateAccountHeaderPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountHeaderView;
import com.gwt.sample.client.login.createaccount.CreateAccountRootPresenter;
import com.gwt.sample.client.login.createaccount.CreateAccountRootView;
import com.gwt.sample.client.login.createaccount.TestPresenter;
import com.gwt.sample.client.login.createaccount.TestView;
import com.gwt.sample.client.login.createaccount.temp.RootTempPresenter;
import com.gwt.sample.client.login.createaccount.temp.RootTempView;
import com.gwt.sample.client.login.createaccount.temp.SimpleContentPresenter;
import com.gwt.sample.client.login.createaccount.temp.SimpleContentView;
import com.gwt.sample.client.login.createaccount.temp.SimpleTestPresenter;
import com.gwt.sample.client.login.createaccount.temp.SimpleTestView;
import com.gwt.sample.client.place.ClientPlaceManager;
import com.gwt.sample.client.place.DefaultPlace;
import com.gwt.sample.client.place.NameTokens;
import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import com.gwt.sample.client.content.SkillSetPresenter;
import com.gwt.sample.client.content.SkillSetView;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(MainPagePresenter.class, MainPagePresenter.MyView.class,
				MainPageView.class, MainPagePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.main);

		bindPresenter(ResponsePresenter.class, ResponsePresenter.MyView.class,
				ResponseView.class, ResponsePresenter.MyProxy.class);

		bindPresenter(LoginPresenter.class, LoginPresenter.MyView.class,
				LoginView.class, LoginPresenter.MyProxy.class);

		bindPresenter(ContentPresenter.class, ContentPresenter.MyView.class,
				ContentView.class, ContentPresenter.MyProxy.class);
//		bindConstant().annotatedWith(SecurityCookie.class).to("JSESSIONID");

		bindPresenter(MainContentPresenter.class,
				MainContentPresenter.MyView.class, MainContentView.class,
				MainContentPresenter.MyProxy.class);

		bindPresenterWidget(ContentHeaderPresenter.class,
				ContentHeaderPresenter.MyView.class, ContentHeaderView.class);

		bindPresenterWidget(ContentFooterPresenter.class,
				ContentFooterPresenter.MyView.class, ContentFooterView.class);

		bindPresenterWidget(ContentMenuPresenter.class,
				ContentMenuPresenter.MyView.class, ContentMenuView.class);

		bindPresenter(ContentContainerPresenter.class,
				ContentContainerPresenter.MyView.class,
				ContentContainerView.class,
				ContentContainerPresenter.MyProxy.class);

		bindPresenter(ProfileOverviewPresenter.class,
				ProfileOverviewPresenter.MyView.class,
				ProfileOverviewView.class,
				ProfileOverviewPresenter.MyProxy.class);

		bindPresenter(ProfileEditPresenter.class,
				ProfileEditPresenter.MyView.class, ProfileEditView.class,
				ProfileEditPresenter.MyProxy.class);

		bindPresenter(CreateAccountRootPresenter.class,
				CreateAccountRootPresenter.MyView.class,
				CreateAccountRootView.class,
				CreateAccountRootPresenter.MyProxy.class);

		bindPresenterWidget(CreateAccountHeaderPresenter.class,
				CreateAccountHeaderPresenter.MyView.class,
				CreateAccountHeaderView.class);

		bindPresenterWidget(CreateAccountFooterPresenter.class,
				CreateAccountFooterPresenter.MyView.class,
				CreateAccountFooterView.class);

		bindPresenter(CreateAccountDetailPresenter.class,
				CreateAccountDetailViewInterface.class,
				CreateAccountDetailView.class,
				CreateAccountDetailPresenter.MyProxy.class);

		bindPresenter(RootTempPresenter.class, RootTempPresenter.MyView.class,
				RootTempView.class, RootTempPresenter.MyProxy.class);

		bindPresenter(SimpleTestPresenter.class,
				SimpleTestPresenter.MyView.class, SimpleTestView.class,
				SimpleTestPresenter.MyProxy.class);

		bindPresenter(SimpleContentPresenter.class,
				SimpleContentPresenter.MyView.class, SimpleContentView.class,
				SimpleContentPresenter.MyProxy.class);

		bindPresenter(TestPresenter.class, TestPresenter.MyView.class,
				TestView.class, TestPresenter.MyProxy.class);

		bindPresenter(CurrentDetailsOverviewPresenter.class,
				CurrentDetailsOverviewPresenter.MyView.class,
				CurrentDetailsOverviewView.class,
				CurrentDetailsOverviewPresenter.MyProxy.class);

		bindPresenter(ManageResumePresenter.class,
				ManageResumePresenter.MyView.class, ManageResumeView.class,
				ManageResumePresenter.MyProxy.class);

		bindPresenter(ManagePhotoPresenter.class,
				ManagePhotoPresenter.MyView.class, ManagePhotoView.class,
				ManagePhotoPresenter.MyProxy.class);

		bindPresenter(ManageCoverLetterPresenter.class,
				ManageCoverLetterPresenter.MyView.class,
				ManageCoverLetterView.class,
				ManageCoverLetterPresenter.MyProxy.class);

		bindPresenter(EmployerPresenter.class, EmployerPresenter.MyView.class,
				EmployerView.class, EmployerPresenter.MyProxy.class);

		bindPresenter(EducationDetailsPresenter.class,
				EducationDetailsPresenter.MyView.class,
				EducationDetailsView.class,
				EducationDetailsPresenter.MyProxy.class);

		bindPresenter(ProjectDetailsPresenter.class,
				ProjectDetailsPresenter.MyView.class, ProjectDetailsView.class,
				ProjectDetailsPresenter.MyProxy.class);

		bindPresenter(SnapshotPresenter.class, SnapshotPresenter.MyView.class,
				SnapshotView.class, SnapshotPresenter.MyProxy.class);

		bindPresenter(SummaryPresenter.class, SummaryPresenter.MyView.class,
				SummaryView.class, SummaryPresenter.MyProxy.class);

		bindPresenter(VisibilitySettingsPresenter.class,
				VisibilitySettingsPresenter.MyView.class,
				VisibilitySettingsView.class,
				VisibilitySettingsPresenter.MyProxy.class);

		bindPresenter(SettingsPresenter.class, SettingsPresenter.MyView.class,
				SettingsView.class, SettingsPresenter.MyProxy.class);

		bindPresenter(ContactDetailsPresenter.class,
				ContactDetailsPresenter.MyView.class, ContactDetailsView.class,
				ContactDetailsPresenter.MyProxy.class);

		bindPresenterWidget(AddressPresenter.class,
				AddressPresenter.MyView.class, AddressView.class);

		bindPresenter(ContactDetailsOverviewPresenter.class,
				ContactDetailsOverviewPresenter.MyView.class,
				ContactDetailsOverviewView.class,
				ContactDetailsOverviewPresenter.MyProxy.class);

		bindPresenterWidget(EmployerDetailsDialogPresenter.class,
				EmployerDetailsDialogPresenter.MyView.class,
				EmployerDetailsDialogView.class);

		bindPresenterWidget(EducationDetailsDialogPresenter.class,
				EducationDetailsDialogPresenter.MyView.class,
				EducationDetailsDialogView.class);

		bindPresenterWidget(SkillsetDialogPresenter.class,
				SkillsetDialogPresenter.MyView.class, SkillsetDialogView.class);

		bindPresenter(SkillDetailsPresenter.class,
				SkillDetailsPresenter.MyView.class, SkillDetailsView.class,
				SkillDetailsPresenter.MyProxy.class);


		bindPresenter(SkillSetPresenter.class, SkillSetPresenter.MyView.class,
				SkillSetView.class, SkillSetPresenter.MyProxy.class);
	}
}
