//package com.project.courseManagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Faculty extends Nsuer {
	//constructor
	public Faculty() {
		super();
	}
	
	//informations
	public void setNotice() {
		//declaring file
		File noticeFile = new File("Notice.txt");
		try {
			// create new file in the system
			noticeFile.createNewFile();
			FileWriter noticeFileWriter = new FileWriter(noticeFile);
			//getting & writing notice to file
	        noticeFileWriter.write(JOptionPane.showInputDialog(null, "Enter Notice Here: "));
	        noticeFileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        JOptionPane.showMessageDialog(null, "Successfully Notice Updated !");
	}
	
	public void seeEvaluation() {
		//getting info from file
		try {
			File file = new File("Evaluation.txt");
			JOptionPane.showMessageDialog(null, "Total " + countElementOfFile("Evaluation") + " Evaluation Found !");
			String line; int count = 0;
			//creating file reader to read file
			FileReader fileReader = new FileReader(file);
			//storing file element in program
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			//reading file elements from file
			while ((line = bufferedReader.readLine()) != null) {
				count++;
				//printing file elements
				JOptionPane.showMessageDialog(null, count + ". " + line);
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setAttendance() {
		try {
			File readFile = new File("Student.txt");
			File writeFile = new File("Attendance.txt");
			writeFile.delete();
			writeFile.createNewFile();
			
			String dayToGetFiveMark = JOptionPane.showInputDialog(null, "Minimum Attend Day to Get FIVE Mark: ");
			int dayToGetFiveMarkInt = Integer.parseInt(dayToGetFiveMark);
			
			String dayToGetFourMark = JOptionPane.showInputDialog(null, "Minimum Attend Day to Get FOUR Mark: ");
			int dayToGetFourMarkInt = Integer.parseInt(dayToGetFourMark);
			
			String line;
			FileReader fileReader = new FileReader(readFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				FileWriter f = new FileWriter("Attendance.txt", true);
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);
				
				String attendDay = JOptionPane.showInputDialog(null, "Enter Attend Day\nID : " + line);
				int attendDayInt = Integer.parseInt(attendDay);
				
				if(attendDayInt < dayToGetFourMarkInt) {
					p.println("3");
				}
				else if (attendDayInt < dayToGetFiveMarkInt){
					p.println("4");
				}
				else {
					p.println("5");
				}
				p.close();
			}
			fileReader.close();
			JOptionPane.showMessageDialog(null, "Attendance Update Successfully !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public void setExamNumber(String fileName) {
		try {
			File readFile = new File("Student.txt");
			File writeFile = new File(fileName + ".txt");
			writeFile.delete();
			writeFile.createNewFile();
			String line;
			FileReader fileReader = new FileReader(readFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((line = bufferedReader.readLine()) != null) {
				FileWriter f = new FileWriter(fileName + ".txt", true);
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);
				String examNumber = JOptionPane.showInputDialog(null, "Enter Number for " + fileName + "\nID : " + line);
				p.println(examNumber);
				p.close();
			}
			fileReader.close();
			JOptionPane.showMessageDialog(null, "Result Update Successfully !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void publishResult() {
		if(checkFileExistence("Attendance") == true) {
			if(checkFileExistence("Assignment") == true) {
				if(checkFileExistence("FirstQuiz") == true) {
					if(checkFileExistence("SecondQuiz") == true) {
						if(checkFileExistence("ThirdQuiz") == true) {
							if(checkFileExistence("MidTerm") == true) {
								if(checkFileExistence("Final") == true) {
									this.calculateResult();
								}
								else {
									JOptionPane.showMessageDialog(null, "Please Update Final Result First !");
								}
							}
							else {
								JOptionPane.showMessageDialog(null, "Please Update Mid Term Result First !");
							}
						}
						else {
							JOptionPane.showMessageDialog(null, "Please Update 3rd Quiz Result First !");
						}
					}
					else {
						JOptionPane.showMessageDialog(null, "Please Update 2nd Quiz Result First !");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Please Update 1st Quiz Result First !");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Please Update Assignment Result First !");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Please Update Attendance Result First !");
		}
	}
	
	public void calculateResult() {
		try {
			File readFile = new File("Student.txt");
			File writeFile = new File("Result.txt");
			writeFile.delete();
			writeFile.createNewFile();
			int counter = 0; double quiz = 0;
			FileReader fileReader = new FileReader(readFile);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			while ((bufferedReader.readLine()) != null) {
				FileWriter f = new FileWriter("Result.txt", true);
				BufferedWriter b = new BufferedWriter(f); 
				PrintWriter p = new PrintWriter(b);
				
				double first = getValue("FirstQuiz", counter);
				double second = getValue("SecondQuiz", counter);
				double third = getValue("ThirdQuiz", counter);
				
				quiz = this.bestTwoQuiz(first, second, third);
				
				double attendance = getValue("Attendance", counter);
				double assignment = getValue("Assignment", counter);
				double midTerm = getValue("MidTerm", counter);
				double finalValue = getValue("Final", counter);
				
				p.println(attendance + assignment + (quiz / 2) + midTerm + finalValue);
				counter++;
				p.close();
			}
			fileReader.close();
			JOptionPane.showMessageDialog(null, "Result Successfully Published !");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
