package org.yellowpeach.users.svc.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yellowpeach.users.svc.domain.Group;

@RestController
@RequestMapping("/groups")
public class GroupService {
	protected static Logger logger = LoggerFactory.getLogger(GroupService.class);
	@RequestMapping(value="/{groupid}", method = RequestMethod.GET)
	public Group getUserById(@PathVariable("userid") Integer id) {
		logger.debug("call getById with %d", id);
		return new Group(123, "admin group", "j.jiang@huawei.com");
	}
	@RequestMapping(value="", method = RequestMethod.GET)
	public String getAll(@RequestParam(value="name", defaultValue="") String name) {
		logger.debug("call getAll with param:" + name);
		return "groupView";
	}
}
