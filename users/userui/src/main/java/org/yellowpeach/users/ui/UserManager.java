package org.yellowpeach.users.ui;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/users")
@EnableAutoConfiguration
public class UserManager {
	@RequestMapping(value="/{userid}", method = RequestMethod.GET)
	public String getUserById(@PathVariable("userid") Integer userId, Model model) {
		model.addAttribute("userId", userId.toString());
//		return "get userId=" + userId.toString();
		return "singleUser";
	}
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getAll() {
		return "userView";
	}
	@RequestMapping("/{username}/hello")
	public String greeting(@PathVariable("userid") String userName, Model model) {
		model.addAttribute("name", userName);
		return "hello";
	}
}
