package lx.action;

import javax.annotation.Resource;
import javax.annotation.Resources;

import lx.model.User;
import lx.service.UserService;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

@ParentPackage("basePackage")
@Namespace("/")
@Action("userAction")
public class UserAction {
	private static final Logger log = Logger.getLogger(UserAction.class);
	
	@Resource
	private UserService userServiceImpl;
	
	public void test(){
		userServiceImpl.test();
		log.info("进入useraction");
	}
	
	public void testSave(){
		User user = new User();
		user.setName("luoxiang");
		user.setPwd("123456");
		userServiceImpl.save(user);
		log.info("进入useraction");
	}
}
