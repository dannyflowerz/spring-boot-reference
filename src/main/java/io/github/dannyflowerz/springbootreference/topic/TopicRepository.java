package io.github.dannyflowerz.springbootreference.topic;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {

}
