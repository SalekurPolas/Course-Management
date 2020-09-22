//package com.project.courseManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Student extends Nsuer {
	
	public Student() {
		super();
	}
	
	public void seeNotice() {
		File file = new File("Notice.txt");
		if(checkFileExistence("Notice") == false) {
			JOptionPane.showMessageDialog(null, "There is no Notice at this moment !");
		}
		else {
			String lineSeparator = System.getProperty("line.separator");
			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
		        StringBuilder contents = new StringBuilder();
		        String notice;
		        while ((notice = reader.readLine()) != null) {
		            contents.append(notice).append(lineSeparator);
		        }
		        JOptionPane.showMessageDialog(null, contents.toString());
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}
	
	public void facultyEvaluation() {
		try {
			String message = JOptionPane.showInputDialog(null, "Warning: We Do Not Store Your Informations !\n"
					+ "Enter How You Would Be Happy in This Course ?");
			File file = new File("Evaluation.txt");
				if(checkFileExistence("Evaluation") == false) {
					// create new file in the system
					file.createNewFile();
					FileWriter fileWriter = new FileWriter(file);
					fileWriter.write(message + "\n");
					fileWriter.close();
				}
				else {
					FileWriter f = new FileWriter("Evaluation.txt", true);
					BufferedWriter b = new BufferedWriter(f); 
					PrintWriter p = new PrintWriter(b);
					p.println(message);
					p.close();
				}
	        JOptionPane.showMessageDialog(null, "Faculty Evaluation Done !");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Something Wrong !\nRestart The Program !");
		}
	}
	
	public void seeResult(String nid) {
		if(this.checkFileExistence("Result") == false) {
			JOptionPane.showMessageDialog(null, "Result Did Not Published Yet !\nContact With Your Faculty !");
		}
		else {
			int counter = this.search("Student", nid);
			
			double attendance = getValue("Attendance", counter);
			double assignment = getValue("Assignment", counter);
			double first = getValue("FirstQuiz", counter);
			double second = getValue("SecondQuiz", counter);
			double third = getValue("ThirdQuiz", counter);
			double midTerm = getValue("MidTerm", counter);
			double finalValue = getValue("Final", counter);
			
			double gradeValue = 0; String totalMark = null;
			
			//getting info from file
			try {
				File file = new File("Result.txt");
				FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				int count = 0; String line;
				while ((line = bufferedReader.readLine()) != null) {
					if(counter == count) {
						totalMark = line;
						gradeValue = Double.parseDouble(line);
					}
					count++;
				}
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Your Grade Is '" + this.getGrade(gradeValue) + "'\nTotal Mark: " + totalMark);
			
			JOptionPane.showMessageDialog(null, "====Details===\nAttendance: " + attendance + "\nAssignment: " 
				+ assignment + "\nFirst Quiz: " + first + "\nSecond Quiz: " + second + "\nThird Quiz: " 
					+ third + "\nMid Term: " + midTerm + "\nFinal: " + finalValue);
		}
	}
	
}
