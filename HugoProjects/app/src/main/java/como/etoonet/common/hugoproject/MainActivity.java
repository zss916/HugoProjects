package como.etoonet.common.hugoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import como.etoonet.common.hugoproject.base.BaseActivity;
import como.etoonet.common.hugoproject.bean.Banner;
import como.etoonet.common.hugoproject.bean.DataResponse;
import como.etoonet.common.hugoproject.net.ApiService;
import como.etoonet.common.hugoproject.net.RetrofitManager;
import como.etoonet.common.hugoproject.utils.RxSchedulers;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class MainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initView() {



    }


}
