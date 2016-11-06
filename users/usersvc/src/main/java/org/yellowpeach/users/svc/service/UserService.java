package org.yellowpeach.users.svc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yellowpeach.users.svc.domain.User;

@RestController
@RequestMapping("/users")
public class UserService {
	protected static Logger logger = LoggerFactory.getLogger(UserService.class);
	@RequestMapping(value="/{userid}", method = RequestMethod.GET)
	public User getUserById(@PathVariable("userid") Integer userId) {
		logger.debug("call getById with %d", userId);
		return new User(123, "Jack", "j.jiang@huawei.com");
	}
	@RequestMapping(value="", method = RequestMethod.GET)
	public String getAll(@RequestParam(value="name", defaultValue="") String name) {
		logger.debug("call getAll with param:" + name);
		return "userView";
	}
}
