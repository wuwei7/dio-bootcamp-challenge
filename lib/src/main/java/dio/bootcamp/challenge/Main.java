package dio.bootcamp.challenge;

import java.time.LocalDate;

import dio.bootcamp.challenge.domain.Bootcamp;
import dio.bootcamp.challenge.domain.Course;
import dio.bootcamp.challenge.domain.Dev;
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
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Java Bootcamp");
		bootcamp.setDescription("The best Java bootcamp ever!");
		bootcamp.getContents().add(javaCourse);
		bootcamp.getContents().add(oopJavaCourse);
		bootcamp.getContents().add(javaMentorship);
		
		Dev devGaladriel = new Dev();
		devGaladriel.setName("Galadriel");
		devGaladriel.enrollBootcamp(bootcamp);
		System.out.println("Galadriel's enrolled contents: " + devGaladriel.getEnrolledContents());
		devGaladriel.progress();
		devGaladriel.progress();
		System.out.println("Galadriel's enrolled contents: " + devGaladriel.getEnrolledContents());
		System.out.println("Galadriel's finished contents: " + devGaladriel.getFinishedContents());
		System.out.println("XP: " + devGaladriel.calculateTotalXp());

		System.out.println("-----");
		
		Dev devHalbrand = new Dev();
		devHalbrand.setName("Halbrand");
		devHalbrand.enrollBootcamp(bootcamp);
		System.out.println("Halbrand's enrolled contents: " + devHalbrand.getEnrolledContents());
		devHalbrand.progress();
		devHalbrand.progress();
		devHalbrand.progress();
		System.out.println("Halbrand's enrolled contents: " + devHalbrand.getEnrolledContents());
		System.out.println("Halbrand's finished contents: " + devHalbrand.getFinishedContents());
		System.out.println("XP: " + devHalbrand.calculateTotalXp());

	}

}
