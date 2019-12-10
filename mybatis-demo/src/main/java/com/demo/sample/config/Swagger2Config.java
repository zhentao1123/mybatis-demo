package com.demo.sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.web.context.request.async.DeferredResult;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	
	@Bean
	public Docket webV1Docket(){
		return new Docket(DocumentationType.SWAGGER_2)
			.groupName("api")
			//.genericModelSubstitutes(DeferredResult.class)
            //.useDefaultResponseMessages(false)
            //.forCodeGeneration(true)
            //.pathMapping("/springboot")
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.demo.sample.controller"))//api过滤，匹配包
			//.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))//api过滤，匹配类注解
			//.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))//api过滤，匹配方法注解
			//.paths(PathSelectors.any())
			//.paths(Predicates.not(PathSelectors.regex("/service/.*")))//service过滤，路径过滤
			//.paths(Predicates.not(PathSelectors.regex("/visa/.*")))//service过滤，路径过滤
			.build()
			//.directModelSubstitute(org.joda.time.LocalDate.class, java.sql.Date.class) // Java8时间类型替换方案
			//.directModelSubstitute(org.joda.time.DateTime.class, java.util.Date.class)
			.apiInfo(new ApiInfoBuilder()
	                .title("title")
	                .description("description")
	                .termsOfServiceUrl("termsOfServiceUrl")
	                .contact(new Contact("tom", "", "123@123.com"))
	                .version("1.0")
	                .build());
	}
	
}
