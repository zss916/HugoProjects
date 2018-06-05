package como.etoonet.common.hugoproject.di.component;

import android.app.Activity;
import android.content.Context;

import como.etoonet.common.hugoproject.di.module.ActivityModule;
import como.etoonet.common.hugoproject.di.scope.ContextLife;
import como.etoonet.common.hugoproject.di.scope.PerActivity;
import dagger.Component;

/**
 * Created by lw on 2017/1/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

   /* void inject(SearchActivity activity);

    void inject(LoginActivity activity);

    void inject(ArticleContentActivity activity);

    void inject(MyCollectionActivity activity);

    void inject(MyBookmarkActivity activity);*/
}
