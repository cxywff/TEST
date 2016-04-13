package com.hyst.controller.user;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hyst.service.user.UserService;
import com.hyst.vo.user.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	/**
	 * 用户登录
	 */
	@RequestMapping("login")
	public String login(User u,HttpSession session,HttpServletRequest  req){
		return userService.login(u,session,req);
	}
	/**
	 * 查询用户列表
	 * @param id
	 * @param id2
	 * @return
	 */
	@RequestMapping("list")
	public String list(ModelMap mp){
		int id=-1;
		int id2=-5;
		mp.addAttribute("list",userService.list(id ,id2));
		return "/list.jsp";
	}
	
	@RequestMapping("insert")
	public String insert(User user){
		userService.add(user);
		return "list.do";
	}
	@RequestMapping("ajax")
	@ResponseBody
	public List<User> ajax(String name){
		System.out.println(name+".........");
		return userService.list(1, -2);
	}
	@RequestMapping("getf")
	@ResponseBody
	public String get(String name){
		System.out.println(name+".........");
		return name;
	}
}










//quartz-1.8.5.jar
//commons-logging.jar
//spring-core-3.0.5.RELEASE.jar
//spring-beans-3.0.5.RELEASE.jar
//spring-context-3.0.5.RELEASE.jar
//spring-context-support-3.0.5.RELEASE.jar
//spring-asm-3.0.5.RELEASE.jar
//spring-expression-3.0.5.RELEASE.jar
//spring.transaction-3.0.5.RELEASE.jar
//spring-web-3.0.5.RELEASE.jar












