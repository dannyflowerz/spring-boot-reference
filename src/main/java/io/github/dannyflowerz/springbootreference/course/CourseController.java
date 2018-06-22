package io.github.dannyflowerz.springbootreference.course;

import io.github.dannyflowerz.springbootreference.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping(value = "/topics/{topicId}/courses")
	public Flux<Course> getAllCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}

	@GetMapping(value = "/topics/{topicId}/courses/{courseId}")
	public Mono<Course> getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@PostMapping(value = "/topics/{topicId}/courses")
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(Topic.builder().id(topicId).build());
		courseService.addCourse(course);
	}
	
	@PutMapping(value = "/topics/{topicId}/courses/{courseId}")
	public void updateCourse(@PathVariable String topicId, @RequestBody Course course) {
		course.setTopic(Topic.builder().id(topicId).build());
		courseService.updateCourse(course);
	}
	
	@DeleteMapping(value = "/topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
	
}
