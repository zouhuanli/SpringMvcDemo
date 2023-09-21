package com.homura.config;

import com.homura.bean.Beta;
import com.homura.bean.Sigma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zouhl
 */
@Configuration
public class MyBeanConfig {

    /**
     * 设置bean的name，如果不设置默认是方法名字
     * If left unspecified, the name of the bean is the name of the annotated method.
     *
     * @param sigma
     * @return
     */

    @Bean(name = "myBetaBean")
    public Beta myBetaBean(@Autowired Sigma sigma) {
        return new Beta(sigma);
    }
}
