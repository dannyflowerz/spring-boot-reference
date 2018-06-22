package io.github.dannyflowerz.springbootreference.topic;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface TopicRepository extends ReactiveCrudRepository<Topic, String> {

}
