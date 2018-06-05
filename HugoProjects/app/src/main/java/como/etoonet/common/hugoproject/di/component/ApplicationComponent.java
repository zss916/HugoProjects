
package como.etoonet.common.hugoproject.di.component;

import android.content.Context;


import como.etoonet.common.hugoproject.MainActivity;
import como.etoonet.common.hugoproject.di.module.ApplicationModule;
import como.etoonet.common.hugoproject.di.scope.ContextLife;
import como.etoonet.common.hugoproject.di.scope.PerApp;
import dagger.Component;



/**
 * Created by lw on 2017/1/19.
 */


@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    //方法1
    @ContextLife("Application")
    Context getApplication();
    //方法2
    //例：void inject(MainActivity activity);

}

