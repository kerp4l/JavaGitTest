/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.randomtesting;

import java.util.ArrayList;

/**
 *
 * @author Topi Jussinniemi
 */
public class Database {
	private ArrayList<Course> courses;

	public Database() {
		this.courses = new ArrayList<Course>();
	}


	public void addCourse(Course course) {
		courses.add(course);
	}

	public String getCourseName(String id) {
		for(Course course : courses) {
			if (course.getID() == id) {
				System.out.println("Löytyi!");
				return course.getName();
			}
		}
		System.out.println("Ei tuloksia!");
		return "asdfg";
	}


	public ArrayList<Integer> getGrades(String id) {
		for(Course course : courses) {
			if (course.getID() == id) {
				System.out.println("Palautettiin kurssiarvosant!");
				return course.getGrades();
			}
		}
		System.out.println("Ei löytynyt arvosanoja!");
		return null;
	}




    
}
