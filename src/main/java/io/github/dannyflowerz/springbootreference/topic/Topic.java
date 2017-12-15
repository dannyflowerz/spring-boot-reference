package io.github.dannyflowerz.springbootreference.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;

}
