package io.github.dannyflowerz.springbootreference.course;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import io.github.dannyflowerz.springbootreference.topic.Topic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	@Setter
	@DBRef // @ManyToOne
	private Topic topic;

}
