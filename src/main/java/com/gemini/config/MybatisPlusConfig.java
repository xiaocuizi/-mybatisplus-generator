package com.gemini.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaocuzi
 * @package com.gemini.config
 * @classname: MybatisPlusConfig
 * @description: MybatisPlusConfig
 * @date 2019/9/18 18:02
 * @since 1.0.0
 */
@Configuration
@MapperScan("com.gemini.mapper*")
public class MybatisPlusConfig {



    /**
     * mybatis-plus 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }

}
