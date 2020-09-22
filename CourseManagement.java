//package com.project.courseManagement;
//importing library files
import javax.swing.JOptionPane;
//class name
public class CourseManagement {
	//main method
	public static void main(String[] args) {
		//declaring objects
		Nsuer nsuer = new Nsuer();
		Login user = new Login();
		//login panel
		String decision = JOptionPane.showInputDialog(null, "Enter <1> to Sign In or <2> to Sign Up: ");
		boolean login = false; 
		if(decision.equals("1")) {
			//getting nid to sign in
			nsuer.inputNid();
			//storing sign in access or denied
			login = user.signIn(nsuer.getNid());
		}
		else {
			//getting nid to sign up
			nsuer.inputNid();
			//calling method to sign up
			user.signUp(nsuer.getNid());
			//calling sign in method after sign up & store sign in result
			login = user.signIn(nsuer.getNid());
		}
		
		if(login == true) {
			//if user get access to sign in
			nsuer.readFile(nsuer.getNid());
			//verifying user as student or teacher
			if(nsuer.getStatus().equals("Student")) {
				//creating new object for a student
				Student student = new Student();
				//creating menu for users
				String homeDicision  = JOptionPane.showInputDialog(null, "===Student Panel===\nEnter <1> for Informations\n"
						+ "Enter <2> to See Result\nEnter <3> to Play Game");
				if(homeDicision.contains("1")) {
					String subDicision  = JOptionPane.showInputDialog(null, "Enter <1> for See Notice\nEnter <2> to Faculty Evaluation");
					if(subDicision.equals("1")) {
						//calling method to work
						student.seeNotice();
					}
					else {
						student.facultyEvaluation();
					}
				}
				else if (homeDicision.contains("2")){
					student.seeResult(nsuer.getNid());
				}
				else {
					//declaring new object
					Game newGame = new Game();
					//calling object's method
					newGame.game();
				}
				//warning user
				JOptionPane.showMessageDialog(null, "Session Expired or Log Out!\nRestart The Program !");
			}
			else {
				//creating new object for a faculty
				Faculty faculty = new Faculty();
				if(nsuer.checkFileExistence("Result") == false) {
					JOptionPane.showMessageDialog(null, "====Notifaction====\nPlease Update Result !");
				}
				String firstDicision  = JOptionPane.showInputDialog(null, "===Faculty Panel===\nEnter <1> for Informations\n"
						+ "Enter <2> to Update Result\nEnter <3> to Publish Result");
				if(firstDicision.contains("1")) {
					String secondDicision  = JOptionPane.showInputDialog(null, "Enter <1> to Set Notice\nEnter <2> to See Evaluation");
					if(secondDicision.equals("1")) {
						faculty.setNotice();
					}
					else {
						faculty.seeEvaluation();
					}
				}
				else if(firstDicision.equals("2")) {
					String thirdDicision  = JOptionPane.showInputDialog(null, "Enter <1> to Update Attendance Result\n"
							+ "Enter <2> to Update Assignment Result\nEnter <3> to Update Quiz Result\n"
								+ "Enter <4> to Update Mid Term Result\nEnter <5> to Update Final Result");
					if(thirdDicision.equals("1")) {
						faculty.setAttendance();
					}
					else if(thirdDicision.equals("2")) {
						faculty.setExamNumber("Assignment");
					}
					else if(thirdDicision.equals("3")) {
						String forthDicision  = JOptionPane.showInputDialog(null, "Enter <1> to Update 1st Quiz Result\n"
								+ "Enter <2> to Update 2nd Quiz Result\nEnter <3> to Update 3rd Quiz Result");
						if(forthDicision.equals("1")) {
							faculty.setExamNumber("FirstQuiz");
						}
						else if(forthDicision.equals("2")) {
							faculty.setExamNumber("SecondQuiz");
						}
						else {
							faculty.setExamNumber("ThirdQuiz");
						}
					}
					else if(thirdDicision.equals("4")) {
						faculty.setExamNumber("MidTerm");
					}
					else {
						faculty.setExamNumber("Final");
					}					
				}
				else {
					faculty.publishResult();
				}
				JOptionPane.showMessageDialog(null, "Session Expired or Log Out!\nRestart The Program !");
			}
		}
	}

}
