package io.github.dannyflowerz.springbootreference.course;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface CourseRepository extends ReactiveCrudRepository<Course, String> {

	Flux<Course> findByTopicId(String topicId);
	
}
