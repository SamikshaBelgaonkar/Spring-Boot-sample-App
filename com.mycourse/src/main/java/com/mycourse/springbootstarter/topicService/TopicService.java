package com.mycourse.springbootstarter.topicService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mycourse.springbootstarter.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic> (Arrays.asList(
			new Topic("1","Spring","Book for Spring Details"),
            new Topic("2","JAVA","Book for Java Details"),
            new Topic("3","C","Book for C Details")
           ) );
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		for(Topic t : topics)
		{
			if(t.getId().equals(id))
			{
	          return t;
			}
		}
		return null;
	}

	public void  addTopic(Topic topic ) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.remove(t);
			}
		}		
	}
}
