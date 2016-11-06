package org.yellowpeach.users.svc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class WebServiceApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(WebServiceApplication.class, args);
    }
}
