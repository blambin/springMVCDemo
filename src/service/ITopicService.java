package service;

import java.util.List;

import entity.Topic;

public interface ITopicService {

	public List<Topic> queryAllTopics();
	
	public void addTopic(Topic t);
	
	public void deleteTopic(int id);
	
	public Topic queryTopicById(int id);
	
	public void updateTopic(Topic t);
	
}
