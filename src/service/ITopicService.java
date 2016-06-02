package service;

import java.util.List;

import entity.Topic;

public interface ITopicService {

	public List<Topic> queryAllTopics();
	
	public void addTopic(Topic t);
	
	public void deleteTopic(int id);
	
	public void deleteTopics(int[] ids);
	
	public Topic queryTopicById(int id);
	
	public void updateTopic(Topic t);
	
}
