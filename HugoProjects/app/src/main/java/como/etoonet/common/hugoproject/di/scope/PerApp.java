package como.etoonet.common.hugoproject.di.scope;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by lw on 2017/1/19.
 */
@Scope //作用域
@Documented  //起到文档提示作用
@Retention(RetentionPolicy.RUNTIME)  //注意注解范围是Runtime级别
public @interface PerApp {
}
