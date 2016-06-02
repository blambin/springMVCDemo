package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Topic;
import service.ITopicService;

@Controller
public class TopicController {

	
	@Autowired
	private ITopicService topicService;
	
	/***
	 * 显示所有文章
	 * @param model
	 * @return
	 */
	@RequestMapping(value="showTopics")
	public String queryAllTopics(Model model){
		
		List<Topic> list = this.topicService.queryAllTopics();
		model.addAttribute("list", list);
		return "showTopics";
	}
	
	/***
	 * 添加文章
	 * @param t
	 * @return
	 */
	@RequestMapping("addTopic")
	public String addTopic(Topic t){
		
		this.topicService.addTopic(t);
		return "redirect:showTopics.action";
	}
	
	/***
	 * 删除文章
	 * @param id
	 * @return
	 */
	@RequestMapping("deleteTopic")
	public String deleteTopic(int id){
		
		this.topicService.deleteTopic(id);
		return "redirect:showTopics.action";
	}
	
	/***
	 * 批量删除文章
	 * @param ids
	 * @return
	 */
	@RequestMapping("deleteTopics")
	public String deleteTopics(int[] ids){
		
		this.topicService.deleteTopics(ids);
		return "redirect:showTopics.action";
	}
	
	/***
	 * 按ID来查询文章
	 * @param model
	 * @param id
	 * @return
	 */
	@RequestMapping("queryTopicById")
	public String queryTopicById(Model model, int id){
		Topic t = this.topicService.queryTopicById(id);
		model.addAttribute("topic", t);
		return "updateTopic";
		
	}
	
	/***
	 * 修改文章 
	 * @param t
	 * @return
	 */
	@RequestMapping("updateTopic")
	public String updateTopic(Topic t){
		
		this.topicService.updateTopic(t);
		return "redirect:showTopics.action";
		
	}
	
	
	/***
	 * API接口/显示所有文章
	 * @return
	 */
	@RequestMapping(value="api/showTopics")
	public @ResponseBody List<Topic> queryAllTopicsApi(){
		List<Topic> list = this.topicService.queryAllTopics();
		return list;
	}
	
	
}
