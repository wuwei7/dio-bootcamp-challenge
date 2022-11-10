package dio.bootcamp.challenge;

import java.time.LocalDate;

import dio.bootcamp.challenge.domain.Course;
import dio.bootcamp.challenge.domain.Mentorship;

public class Main {

	public static void main(String[] args) {
		
		Course javaCourse = new Course();
		javaCourse.setTitle("Java Course");
		javaCourse.setDescription("Basic concepts of Java programming");
		javaCourse.setCourseload(4);
		
		Course oopJavaCourse = new Course();
		oopJavaCourse.setTitle("OOP Course");
		oopJavaCourse.setDescription("OOP in Java");
		oopJavaCourse.setCourseload(6);
		
		Mentorship javaMentorship = new Mentorship();
		javaMentorship.setTitle("Java Mentorship");
		javaMentorship.setDescription("In-depth OOP");
		javaMentorship.setDate(LocalDate.now());
		
		System.out.println(javaCourse);
		System.out.println(oopJavaCourse);
		System.out.println(javaMentorship);

	}

}
