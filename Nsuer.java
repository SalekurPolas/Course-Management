//package com.project.courseManagement;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Nsuer extends Person {

	public Nsuer() {
		
	}

	@Override
	void writeFile(String nid) {
		try {
			if(this.status.equals("Student")) {
				File allIdFile = new File("Student.txt");
				if(checkFileExistence("Student") == false) {
					// create new file in the system
					allIdFile.createNewFile();
					//writing first id
					FileWriter allIdFileWriter = new FileWriter(allIdFile);
					allIdFileWriter.write(nid + "\n");
					allIdFileWriter.close();
					
					JOptionPane.showMessageDialog(null, "You are first Student xD !");
				}
				else {
					FileWriter f = new FileWriter("Student.txt", true);
					BufferedWriter b = new BufferedWriter(f); 
					PrintWriter p = new PrintWriter(b);
					p.println(nid);
					p.close();
				}
			}
			//creating file to personal data
			File personalFile = new File(nid + ".txt");
			// create new file in the system
			personalFile.createNewFile();
	        //writing info to file
	        FileWriter personalFileWriter = new FileWriter(personalFile);
	        personalFileWriter.write(nid + "\n");
	        personalFileWriter.write(status + "\n");
	        personalFileWriter.write(name + "\n");
	        personalFileWriter.write(email + "\n");
	        personalFileWriter.write(password + "\n");
	        personalFileWriter.close();
	        
	        JOptionPane.showMessageDialog(null, "Successfully Account Created !");
		} catch (Exception e) {
			
		}	
	}
	
	@Override
	void changePassword(String nid) {
		try {
			//creating file to personal data
			File personalFile = new File(nid + ".txt");
			// create new file in the system
			personalFile.createNewFile();
	        //writing info to file
	        FileWriter personalFileWriter = new FileWriter(personalFile);
	        personalFileWriter.write(nid + "\n");
	        personalFileWriter.write(status + "\n");
	        personalFileWriter.write(name + "\n");
	        personalFileWriter.write(email + "\n");
	        personalFileWriter.write(password + "\n");
	        personalFileWriter.close();
	        
	        JOptionPane.showMessageDialog(null, "Password Succeessfully Changed !");
		} catch (Exception e) {
			
		}
	}

	@Override
	void readFile(String nid) {
		//getting info from file
		try {
			File file = new File(nid + ".txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line; int counter = 0;
			while ((line = bufferedReader.readLine()) != null) {
				counter++;
				if(counter == 1)
					this.nid = line;
				else if(counter == 2)
					this.status = line;
				else if(counter == 3)
					this.name = line;
				else if(counter == 4)
					this.email = line;
				else if(counter == 5)
					this.password = line;
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//checking file existence
	public boolean checkFileExistence(String fileName) {
		File file = new File(fileName + ".txt");
		return file.exists();
	}
	
	public int countElementOfFile(String fileName) {
		//getting info from file
		try {
			File file = new File(fileName + ".txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			int counter = 0;
			while (bufferedReader.readLine() != null) {
				counter++;
			}
			fileReader.close();
			return counter;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	public int search(String fileName, String searchValue) {
		//getting info from file
		try {
			File file = new File(fileName + ".txt");
			FileReader fileReader = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line; int counter = 0;
			
			while ((line = bufferedReader.readLine()) != null) {
				if(line.equals(searchValue)) {
					return counter;
				}
				counter++;
			}
			fileReader.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "File Doesn't Found !");
		}
		JOptionPane.showMessageDialog(null, "Doesn't Found Information !");
		return -1;
	}
	
	public double getValue(String fileName, int index) {
		//getting info from file
		try {
			File file = new File(fileName + ".txt");
			FileReader fileReader = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line; int counter = 0;
			while ((line = bufferedReader.readLine()) != null) {
				if(counter == index) {
					return Double.parseDouble(line);
				}
				counter++;
			}
			fileReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return 0.0;
	}
	
	public double bestTwoQuiz(double first, double second, double third) {
		double quiz = 0;
		if( (first > second) && (first > third) ) {
			if(second > third) {
				quiz = first + second;
			}
			else {
				quiz = first + third;
			}
		}
		else if( (second > third) && (second > first) ){
			if(third > first) {
				quiz = second + third;
			}
			else {
				quiz = second + first;
			}
		}
		else {
			if( (third > first) && (third > second) ) {
				if(first > second) {
					quiz = third + first;
				}
				else {
					quiz = third + second;
				}
			}
		}
		return quiz;
	}
	
	public String getGrade(double number) {
		if(number >= 93) {
			return "A";
		}
		else if(number <= 92 && number >= 90) {
			return "A-";
		}
		else if(number <= 89 && number >= 87) {
			return "B+";
		}
		else if(number <= 86 && number >= 83) {
			return "B";
		}
		else if(number <= 82 && number >= 80) {
			return "B-";
		}
		else if(number <= 79 && number >= 77) {
			return "C+";
		}
		else if(number <= 76 && number >= 73) {
			return "C";
		}
		else if(number <= 72 && number >= 70) {
			return "C-";
		}
		else if(number <= 69 && number >= 67) {
			return "D+";
		}
		else if(number <= 66 && number >= 60) {
			return "D";
		}
		else
			return "F";
	}
	
}
