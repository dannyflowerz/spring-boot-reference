package io.github.dannyflowerz.springbootreference.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	public Flux<Topic> getAllTopics() {
		return topicRepository.findAll();
	}
	
	public Mono<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
}
