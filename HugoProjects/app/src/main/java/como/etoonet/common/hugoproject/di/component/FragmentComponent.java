package como.etoonet.common.hugoproject.di.component;

import android.app.Activity;
import android.content.Context;


import como.etoonet.common.hugoproject.di.module.FragmentModule;
import como.etoonet.common.hugoproject.di.scope.ContextLife;
import como.etoonet.common.hugoproject.di.scope.PerFragment;
import dagger.Component;

/**
 * Created by lw on 2017/1/19.
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

   /* void inject(HomeFragment fragment);

    void inject(KnowledgeSystemFragment fragment);

    void inject(MyFragment fragment);

    void inject(ArticleListFragment fragment);

    void inject(HotFragment fragment);*/
}
