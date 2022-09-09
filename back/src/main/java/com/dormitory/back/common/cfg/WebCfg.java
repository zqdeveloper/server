package com.dormitory.back.common.cfg;

import com.dormitory.back.filter.ErrorFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Filter;

@Configuration
public class WebCfg implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // /**表示对所有的路径开放全局跨域访问权限
     /*   registry.addMapping("/**")
                // 开放哪些IP、端口、域名的访问权限
                .allowedOrigins(properties.getCfg().getCorsOrigins())
                // 是否允许发送Cookie信息
                .allowCredentials(true)
                // 哪些HTTP方法允许跨域访问
                .allowedMethods("GET", "POST");*/
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
                .allowCredentials(false)
                .maxAge(3600)
                .allowedHeaders("*");
    }

    @Bean
    public FilterRegistrationBean<Filter> filterRegistrationBean() {
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        // 设置Filter
        bean.setFilter(new ErrorFilter());
        bean.addUrlPatterns("/*");
        // 最高权限
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }
}
