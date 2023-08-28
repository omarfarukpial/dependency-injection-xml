package com.dependencyinjection.dependencyinjection;

import model.Photographer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyinjectionApplication.class, args);
		Photographer photographer1 = (Photographer) context.getBean("photographer1");

		System.out.println(photographer1.getName());
		System.out.println(photographer1.getCamera().getBrand());
	}

}
