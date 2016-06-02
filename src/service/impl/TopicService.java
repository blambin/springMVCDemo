package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import entity.Topic;
import mapper.ITopicMapping;
import service.ITopicService;

public class TopicService implements ITopicService {

	// 持久一个mapper的代理对象
	// 通过注解注入mapper代理对象

	@Autowired
	private ITopicMapping topicMapping;

	@Override
	public List<Topic> queryAllTopics() {
		return this.topicMapping.queryAllTopics();
	}

	@Override
	public void addTopic(Topic t) {
		this.topicMapping.addTopic(t);
	}

	@Override
	public void deleteTopic(int id) {
		this.topicMapping.deleteTopic(id);
		
	}

	@Override
	public Topic queryTopicById(int id) {
		
		return this.topicMapping.queryTopicById(id);
	}

	@Override
	public void updateTopic(Topic t) {
		this.topicMapping.updateTopic(t);		
	}

	@Override
	public void deleteTopics(int[] ids) {
		// TODO Auto-generated method stub
		this.topicMapping.deleteTopics(ids);
	}
	

}
