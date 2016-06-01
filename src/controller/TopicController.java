package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Topic;
import service.ITopicService;

@Controller
public class TopicController {

	
	@Autowired
	private ITopicService topicService;
	
	@RequestMapping(value="showTopics")
	public String queryAllTopics(Model model){
		
		List<Topic> list = this.topicService.queryAllTopics();
		model.addAttribute("list", list);
		return "showTopics";
	}
	
	@RequestMapping("addTopic")
	public String addTopic(Topic t){
		
		this.topicService.addTopic(t);
		return "redirect:showTopics.action";
	}
	
	@RequestMapping("deleteTopic")
	public String deleteTopic(int id){
		
		this.topicService.deleteTopic(id);
		return "redirect:showTopics.action";
	}
	
	@RequestMapping("queryTopicById")
	public String queryTopicById(Model model, int id){
		Topic t = this.topicService.queryTopicById(id);
		model.addAttribute("topic", t);
		return "updateTopic";
		
	}
	
	
	@RequestMapping("updateTopic")
	public String updateTopic(Topic t){
		
		this.topicService.updateTopic(t);
		return "redirect:showTopics.action";
	}
	
	
}
