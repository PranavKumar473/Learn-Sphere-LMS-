package com.learnSphere.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnSphere.entities.Course;
import com.learnSphere.entities.Lesson;
import com.learnSphere.repository.CourseRepository;
import com.learnSphere.repository.LessonRepository;

@Service
public class StudentServiceImplementation implements StudentService{
	@Autowired
	CourseRepository repo;
	@Autowired
	LessonRepository lrepo;
	@Override
	
	
	public List<Course> fetchCourseList(){
		return repo.findAll();
	}
	
	public Course fetchCourse(int courseId) {
		return repo.findByCourseId(courseId);
		
	}

	@Override
	public Lesson getLesson(int lessonId) {
		// TODO Auto-generated method stub
		return lrepo.findByLessonId(lessonId);
	}

}
