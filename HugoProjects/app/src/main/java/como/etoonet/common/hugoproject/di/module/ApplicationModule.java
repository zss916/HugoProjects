package como.etoonet.common.hugoproject.di.module;

import android.content.Context;


import como.etoonet.common.hugoproject.base.App;
import como.etoonet.common.hugoproject.di.scope.ContextLife;
import como.etoonet.common.hugoproject.di.scope.PerApp;
import dagger.Module;
import dagger.Provides;


/**
 * Created by lw on 2017/1/19.
 */
@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }

    @Provides
    @PerApp
    @ContextLife("Application")
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }
}
