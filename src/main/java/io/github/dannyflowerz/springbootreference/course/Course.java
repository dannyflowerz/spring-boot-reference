package io.github.dannyflowerz.springbootreference.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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
@Entity
public class Course {

	@Id
	private String id;
	private String name;
	private String description;
	@Setter
	@ManyToOne
	private Topic topic;

}
