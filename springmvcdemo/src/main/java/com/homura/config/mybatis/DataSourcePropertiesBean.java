package com.homura.config.mybatis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class DataSourcePropertiesBean {
    /**
     * <property name="driverClassName" value="${db.driver}"/>
     * <property name="jdbcUrl" value="${db.url}"/>
     * <property name="username" value="${db.username}"/>
     * <property name="password" value="${db.password}"/>
     * <property name="connectionTestQuery" value="${db.connectionTestQuery}"/>
     * <!-- 生效超时 -->
     * <property name="validationTimeout" value="${db.validationTimeout}"/>
     * <!-- 连接只读数据库时配置为true， 保证安全 -->
     * <property name="readOnly" value="${db.readOnly}"/>
     * <!-- 等待连接池分配连接的最大时长（毫秒），超过这个时长还没可用的连接则发生SQLException， 缺省:30秒 -->
     * <property name="connectionTimeout" value="${db.connectionTimeout}"/>
     * <!-- 一个连接idle状态的最大时长（毫秒），超时则被释放（retired），缺省:10分钟 -->
     * <property name="idleTimeout" value="${db.idleTimeout}"/>
     * <!-- 一个连接的生命时长（毫秒），超时而且没被使用则被释放（retired），缺省:30分钟，建议设置比数据库超时时长少30秒，参考MySQL
     * wait_timeout参数（show variables like '%timeout%';） -->
     * <property name="maxLifetime" value="${db.maxLifetime}"/>
     * <!-- 连接池中允许的最大连接数。缺省值：10；推荐的公式：((core_count * 2) + effective_spindle_count) -->
     * <property name="maximumPoolSize" value="${db.maximumPoolSize}"/>
     **/
    @Value("${db.driver}")
    private String driverClassName;
    @Value("${db.url}")
    private String jdbcUrl;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.connectionTestQuery}")
    private String connectionTestQuery;
    @Value("${db.validationTimeout}")
    private long validationTimeout;
    @Value("${db.readOnly}")
    private boolean readOnly;
    @Value("${db.connectionTimeout}")
    private long connectionTimeout;
    @Value("${db.idleTimeout}")
    private long idleTimeout;
    @Value("${db.maxLifetime}")
    private long maxLifetime;
    @Value("${db.maximumPoolSize}")
    private int maximumPoolSize;


}
