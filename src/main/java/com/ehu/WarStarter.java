package com.ehu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * write something to describe this file.
 *
 * @author demon
 * @since 2017-03-23 17:01.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ehu.mapper")
@EnableWebMvc
public class WarStarter extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WarStarter.class);
    }
}
