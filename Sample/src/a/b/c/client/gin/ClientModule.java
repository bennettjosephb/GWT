package a.b.c.client.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;
import a.b.c.client.place.ClientPlaceManager;
import a.b.c.client.TreeSamplePresenter;
import a.b.c.client.TreeSampleView;
import a.b.c.client.place.DefaultPlace;
import a.b.c.client.place.NameTokens;

public class ClientModule extends AbstractPresenterModule {

	@Override
	protected void configure() {
		install(new DefaultModule(ClientPlaceManager.class));

		bindPresenter(TreeSamplePresenter.class,
				TreeSamplePresenter.MyView.class, TreeSampleView.class,
				TreeSamplePresenter.MyProxy.class);

		bindConstant().annotatedWith(DefaultPlace.class).to(NameTokens.tree);
	}
}
