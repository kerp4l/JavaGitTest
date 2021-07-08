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
public class Course {
	private String id;
	private String name;
	private ArrayList<Integer> grades;

	public Course(String id, String name, ArrayList<Integer> grades) {
		this.id = id;
		this.name = name;
		this.grades = grades;
	}

	public String getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Integer> getGrades() {
		return grades;
	}


    
}
