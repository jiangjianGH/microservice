package org.yellowpeach.bookstore.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

public class Application {
	@RequestMapping("/")
	public String index() {
		return "This is first page";
	}
	@RequestMapping("/hello")
	public String greeting() {
		return "Hello, World!";
	}
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
