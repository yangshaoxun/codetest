package web;

import entity.User;
import service.UserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	public String index() {
//		System.out.println(this);
//		System.out.println(userService);
		return SUCCESS;
	}
	
	public String reg() {
		int rows = userService.addUser(user);
		return SUCCESS;
	}
	
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
