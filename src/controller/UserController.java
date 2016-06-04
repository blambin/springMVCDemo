package controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import common.Config;
import entity.User;
import service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService userService;

	/***
	 * 用户登陆功能
	 * 
	 * @param u
	 * @param session
	 * @return
	 */
	@RequestMapping("/login")
	public String login(User u, HttpSession session) {

		List<User> user = this.userService.queryUserByLogin(u);
		if (user.size() > 0) {
			// 登陆成功
			session.setAttribute("user", user.get(0));
			return "redirect:showTopics.action";
		} else {
			return "login";
		}
	}

	/***
	 * 用户注册功能 
	 * 
	 * @param user
	 * @param mv
	 * @return
	 */
	
	@RequestMapping("/register")
	public ModelAndView register(User user,ModelAndView mv,MultipartFile photo){

		//获取文件存储目录
		
		Config config = new Config();
		String filePath = config.getProperties().getProperty("imagePath");
		//String filePath = "/.//imgs//";
		
		try {
			
			//文件名处理
			String filename  = UUID.randomUUID() + photo.getOriginalFilename().substring( photo.getOriginalFilename().lastIndexOf("."));
			
			//转存文件 
			File file = new File(filePath + filename);
			photo.transferTo(file);
			
			user.setPicture(filename);
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
