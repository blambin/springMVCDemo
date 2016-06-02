package controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	/***
	 * 用户登陆功能 
	 * @param u
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String login(User u,HttpSession session) {
		
		List<User> user = this.userService.queryUserByLogin(u);		
		if (user.size() > 0) {
			//登陆成功
			session.setAttribute("user", user.get(0));
			return "redirect:showTopics.action";
		}else {
			return "login";
		}
	}
	
	/***
	 * 用户注册功能 
	 * @param user
	 * @param mv
	 * @return
	 */
	
	@RequestMapping("/register")
	public ModelAndView register(User user,ModelAndView mv){
		
		try {
			this.userService.saveUser(user);
			mv.addObject("msg", "注册成功!");
			return mv;
		} catch (Exception e) {
			mv.addObject("msg", "注册失败!");
			e.printStackTrace();
			return mv;
		}
	}
}
