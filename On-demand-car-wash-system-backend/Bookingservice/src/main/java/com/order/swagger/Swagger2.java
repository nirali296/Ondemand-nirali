package com.order.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration
public class Swagger2 {
	@Bean          //the way we want to publish the intend
	public Docket productApi()  //docket is an isntance of an object to hold all the modification in a swagger
	{
	return new Docket(DocumentationType.SWAGGER_2)//new docket instance configured to use swagger
	.select()//to get builder object
	.apis(RequestHandlerSelectors.basePackage("com.order"))
	.paths(PathSelectors.any())
	.build()
	.apiInfo(getApiInfo()); //to add api info
	}
	private ApiInfo getApiInfo() { //what to add in api info
	return new ApiInfo(
	"On Demand Car Wash System",
	"Case Study Project",
	"Terms of Service",
	"Free to use",
	new springfox.documentation.service.Contact("Nirali Verma", "http://Youtube.com", "niraliverma.72@gmail.com"),
	"API Licence","http://Youtube.com", Collections.emptyList());
	}
	

}


