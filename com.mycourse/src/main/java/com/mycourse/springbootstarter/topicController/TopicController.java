package com.mycourse.springbootstarter.topicController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public String getAllTopics()
	{
		System.out.println("HIIIIII");
		return "All Topics";
	}
}
