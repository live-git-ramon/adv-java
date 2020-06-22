package com.cognixia.jump.advancedjava.courseproject;

import java.io.IOException;
import java.util.ArrayList;

public class CourseRunner 
{

	public static void main(String[] args) throws ClassNotFoundException, IOException 
	{
		ArrayList<Course> listCourses = new ArrayList<Course>();
		
		
		Course[] courses = new Course[5];
		
		courses[0] = new Course(1, "Math", "Walt", 1600, 30, "Monday And Wednesday");
		courses[1] = new Course(2, "Java", "Matt",1200, 30, "Monday And Wednesday");
		courses[2] = new Course(3, "English", "Jennifer",1200, 30, "Tuesday And Thursday");
		courses[3] = new Course(4, "Biology", "Brittany" , 1600, 30, "Tuesday And Thursday");
		courses[4] = new Course(5, "History", "John", 1200, 30, "Friday");
		listCourses.add(courses[0]);
		listCourses.add(courses[1]);
		listCourses.add(courses[2]);
		listCourses.add(courses[3]);
		listCourses.add(courses[4]);
		
		CourseEditor.saveCourses(listCourses);
		listCourses = CourseEditor.retrieveCoursesArrayList();
		
		System.out.println(CourseEditor.getCourse(listCourses, 1));
		
		listCourses = CourseEditor.deleteCourse(listCourses, 1);
		
		System.out.println(listCourses);
	}

}
