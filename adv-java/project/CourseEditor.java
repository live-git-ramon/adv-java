package com.cognixia.jump.advancedjava.courseproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class CourseEditor
{
	static File file = new File("Courses.dat");
	static FileOutputStream fileOutputStream;
	static ArrayList<Course> list = new ArrayList<Course>();
	static Course myCourse = new Course();
	
public static void saveCourses(ArrayList<Course> Course)
{
	FileOutputStream fileOutputStream;
	try {
		fileOutputStream = new FileOutputStream(file);
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(Course);
			objectOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Saved the courses to file.");
}

@SuppressWarnings("unchecked")
public static ArrayList<Course> retrieveCoursesArrayList() throws IOException, ClassNotFoundException
{
	
	FileInputStream fileInputStream = new FileInputStream(file);
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	list = (ArrayList<Course>) objectInputStream.readObject();
	objectInputStream.close();
	for (Course human : list)
	{
		System.out.println(human);
	}
	return list;
}

public static Course getCourse(ArrayList<Course> course, int id)
{
	for (int i = 0; i < course.size(); i++)
	{
		if (course.get(i).getCourseId() == id)
		{
			myCourse = course.get(i);
			return myCourse;
		}
	}
	myCourse = null;
	return myCourse;
}

public static ArrayList<Course> deleteCourse(ArrayList<Course> course, int id)
{
	for (int i = 0; i < course.size(); i++)
	{
		if (course.get(i).getCourseId() == id)
		{
			course.remove(i);
			return course;
		}
	}
	return course;
}


}

