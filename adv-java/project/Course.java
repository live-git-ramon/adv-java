package com.cognixia.jump.advancedjava.courseproject;

import java.io.Serializable;

public class Course implements Serializable
{
	
	/**
	 * 
	 */
	// look into private stiatic final long serialVersionUID
	private static final long serialVersionUID = 1L;
	private int courseId;
	private String courseName;
	private String professorName;
	private int cost;
	private int numStudents;
	private String date;
	
	public Course() 
	{
		
	}
	
	public Course(int courseId, String courseName, String professorName, int cost, int numStudents, String date)
	{
		this.courseId = courseId;
		this.professorName = professorName;
		this.cost = cost;
		this.numStudents = numStudents;
		this.date = date;
		this.courseName = courseName;
	}
	public int getCourseId() 
	{
		return courseId;
	}
	public void setCourseId(int courseId) 
	{
		this.courseId = courseId;
	}
	public String getProfessorName() 
	{
		return professorName;
	}
	public void setProfessorName(String professorName) 
	{
		this.professorName = professorName;
	}
	public int getCost() 
	{
		return cost;
	}
	public void setCost(int cost) 
	{
		this.cost = cost;
	}
	public int getNumStudents() 
	{
		return numStudents;
	}
	public void setNumStudents(int numStudents) 
	{
		this.numStudents = numStudents;
	}
	

	public String getDate() 
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", professorName=" + professorName
				+ ", cost=" + cost + ", numStudents=" + numStudents + ", date=" + date + "]" + '\n';
	}
	
	
}
