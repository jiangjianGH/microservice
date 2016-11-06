package org.yellowpeach.users.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
	@RequestMapping(value="/index.html", method = RequestMethod.GET)
	public String index() {
		return "mainFrame";
	}
	
	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
