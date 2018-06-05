package como.etoonet.common.hugoproject.base;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.Utils;

import como.etoonet.common.hugoproject.BuildConfig;
import como.etoonet.common.hugoproject.di.component.ApplicationComponent;
import como.etoonet.common.hugoproject.di.component.DaggerApplicationComponent;
import como.etoonet.common.hugoproject.di.module.ApplicationModule;
import me.yokeyword.fragmentation.Fragmentation;

/**
 * Created by Administrator on 2018/6/4.
 */

public class App extends Application{
    private static App mInstance;
    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        //初始化application插件
        initApplicationComponent();
        //初始化工具库
        Utils.init(this);
        //初始化路由
        intARouter();
        //为"单Activity ＋ 多Fragment的架构","多模块Activity + 多Fragment的架构"而生
        Fragmentation.builder()
                .stackViewMode(Fragmentation.NONE)  // 显示悬浮球 ; 其他Mode:SHAKE: 摇一摇唤出   NONE：隐藏
                .debug(BuildConfig.DEBUG)
                .install();
    }


    /**
     * 初始化路由
     */
    private void intARouter() {
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }

    /**
     * 初始化ApplicationComponent，
     *
     */
    private void initApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static Context getAppContext() {
        return mInstance.getApplicationContext();
    }

    public static App getInstance() {
        return mInstance;
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
