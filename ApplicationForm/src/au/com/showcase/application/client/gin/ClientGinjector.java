package au.com.showcase.application.client.gin;

import au.com.showcase.application.client.ApplicationFormPresenter;
import au.com.showcase.application.client.HomePresenter;
import au.com.showcase.application.client.LoginPresenter;
import au.com.showcase.application.client.NewRegistrationContainerPresenter;
import au.com.showcase.application.client.NewRegistrationPresenter;
import au.com.showcase.application.client.SignUpPresenter;
import au.com.showcase.application.client.scroll.ScrollTestPresenter;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import au.com.showcase.application.client.scroll.TestInsertPresenter;
import au.com.showcase.application.client.ui.process.CustomerDetailPresenter;
import au.com.showcase.application.client.counter.MainPresenter;
import au.com.showcase.application.client.ui.process.CustomerIDProofSavePresenter;
import au.com.showcase.application.client.ui.process.BeneficiaryDetailsPresenter;
import au.com.showcase.application.client.ui.process.BeneficiaryBankDetailsPresenter;
import au.com.showcase.application.client.ui.process.ProcessSummaryPresenter;
import au.com.showcase.application.client.ui.process.DealReceiptPresenter;

@GinModules({ DispatchAsyncModule.class, ClientModule.class })
public interface ClientGinjector extends Ginjector {

	EventBus getEventBus();

	PlaceManager getPlaceManager();

	AsyncProvider<HomePresenter> getHomePresenter();

	AsyncProvider<ApplicationFormPresenter> getApplicationFormPresenter();

	AsyncProvider<LoginPresenter> getLoginPresenter();

	AsyncProvider<NewRegistrationPresenter> getNewRegistrationPresenter();

	AsyncProvider<NewRegistrationContainerPresenter> getNewRegistrationContainerPresenter();

	AsyncProvider<SignUpPresenter> getSignUpPresenter();

	AsyncProvider<ScrollTestPresenter> getScrollTestPresenter();

	AsyncProvider<TestInsertPresenter> getTestInsertPresenter();

	AsyncProvider<CustomerDetailPresenter> getCustomerDetailPresenter();

	AsyncProvider<MainPresenter> getMainPresenter();

	AsyncProvider<CustomerIDProofSavePresenter> getCustomerIDProofSavePresenter();

	AsyncProvider<BeneficiaryDetailsPresenter> getBeneficiaryDetailsPresenter();

	AsyncProvider<BeneficiaryBankDetailsPresenter> getBeneficiaryBankDetailsPresenter();

	AsyncProvider<ProcessSummaryPresenter> getProcessSummaryPresenter();

	AsyncProvider<DealReceiptPresenter> getDealReceiptPresenter();
}
