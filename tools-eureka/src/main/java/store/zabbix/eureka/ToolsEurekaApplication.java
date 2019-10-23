package store.zabbix.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.Filter;


/**
 * description: 注册中心
 *
 * @author eyck.cui update: 2019/10/23 18:31
 **/
@SpringBootApplication
@EnableEurekaServer
public class ToolsEurekaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ToolsEurekaApplication.class, args);
    }
}