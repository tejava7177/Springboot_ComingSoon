package org.comingSoonPrac.springDeveloper.service;

import org.comingSoonPrac.springDeveloper.model.Course;

import java.util.Optional;


// CRUE 연산을 수행하기만 함
public interface CourseService {

    Course createCourse(Course course);

    Optional<Course> getCourseById(long courseId);

    Iterable<Course> getCoursesByCategory(String category);

    Iterable<Course> getCourses();

    void updateCourse(Long courseId, Course course);

    void deleteCourseById(long courseId);

    void deleteCourses();
}