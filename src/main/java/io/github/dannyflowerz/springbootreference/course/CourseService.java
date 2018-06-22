package io.github.dannyflowerz.springbootreference.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	public Flux<Course> getAllCourses(String topicId) {
		return courseRepository.findByTopicId(topicId);
	}
	
	public Mono<Course> getCourse(String id) {
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
}
