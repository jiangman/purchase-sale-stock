package com.ehu.config;

import com.ehu.constants.SystemConstants;
import com.ehu.interceptor.PermissionInterceptor;
import com.ehu.interceptor.RequestInterceptor;
import com.ehu.interceptor.TokenInterceptor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.text.SimpleDateFormat;

/**
 * web应用配置文件.
 *
 * @author demon
 * @since 2017-03-02 17:22.
 */
@Configuration
@Import(RedisDataSource.class)
public class WebApplicationConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] unInterceptUrls = new String[SystemConstants.UN_INTERCPT_URLS.size()];
        unInterceptUrls = SystemConstants.UN_INTERCPT_URLS.toArray(unInterceptUrls);
        registry.addInterceptor(new RequestInterceptor()).addPathPatterns("/*");
        registry.addInterceptor(new TokenInterceptor(redisTemplate)).excludePathPatterns(unInterceptUrls);
        registry.addInterceptor(new PermissionInterceptor()).excludePathPatterns(unInterceptUrls);
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        jsonConverter.setObjectMapper(objectMapper);
        return jsonConverter;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
