package io.github.dannyflowerz.springbootreference.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@GetMapping(value = "/topics")
	public Flux<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@GetMapping(value = "/topics/{id}")
	public Mono<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@PostMapping(value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@PutMapping(value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic) {
		topicService.updateTopic(topic);
	}
	
	@DeleteMapping(value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
}
