package com.gemini;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xiaocuizi
 */
@SpringBootApplication
@MapperScan("com.gemini.mapper")  //配置mapper扫描
public class MybatisplusGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisplusGeneratorApplication.class, args);
	}

}
