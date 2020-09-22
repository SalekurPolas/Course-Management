//package com.project.courseManagement;

import javax.swing.JOptionPane;

public class Login extends Nsuer {
	
	public void signUp(String nid) {
		//declaring objects
		Nsuer nsuer = new Nsuer();
		//getting nid and checking
		nsuer.setNid(nid);
		if(nsuer.checkFileExistence(nsuer.getNid()) == true) {
			JOptionPane.showMessageDialog(null, "Account Already Exists By this ID !");
			//section for sign in
			String decision = JOptionPane.showInputDialog(null, "Enter <1> to Sign In or <2> to Sign Up: ");
			if(decision.equals("1")) {
				nsuer.inputNid();
				signIn(nsuer.getNid());
			}
			else {
				nsuer.inputNid();
				signUp(nsuer.getNid());
			}
		}
		else {
			//getting data from user
			nsuer.inputName();
			nsuer.inputStatus();
			nsuer.inputEmail();
			nsuer.inputPassword();
			//creating file to store data
			nsuer.writeFile(nsuer.getNid());
		}
	}
	public boolean signIn(String nid) {
		Nsuer nsuer = new Nsuer();
		//getting nid and checking
		nsuer.setNid(nid);
		if(nsuer.checkFileExistence(nsuer.getNid()) == false) {
			JOptionPane.showMessageDialog(null, "Account Doesn't Exists By this ID !");
			//section for sign up
			String decision = JOptionPane.showInputDialog(null, "Enter <1> to Sign In or <2> to Sign Up: ");
			if(decision.equals("1")) {
				nsuer.inputNid();
				signIn(nsuer.getNid());
			}
			else {
				nsuer.inputNid();
				signUp(nsuer.getNid());
			}
		}
		else {
			nsuer.readFile(nsuer.getNid());
			String password = JOptionPane.showInputDialog(null, "Welcome " + nsuer.getName() + " !\n" + "Enter Your Password: ");
			if(password.equals(nsuer.getPassword())) {
				return true;
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect Password !");
				String hotKey = JOptionPane.showInputDialog(null, "Forget Password ?\n" + "Enter <1> to Recover or <2> to Re-Sign In: ");
				if(hotKey.equals("1")) {
					String newEmail = JOptionPane.showInputDialog(null, "Enter Your Email: ");
					if(newEmail.equals(nsuer.getEmail())) {
						String newPassword = JOptionPane.showInputDialog(null, "Enter New Password: ");
						nsuer.setPassword(newPassword);
						nsuer.changePassword(nsuer.getNid());
						JOptionPane.showMessageDialog(null, "Session Expired or Log Out!\nRestart The Program !");
					}
					else {
						JOptionPane.showMessageDialog(null, "Email Doesn't Match !");
						JOptionPane.showMessageDialog(null, "Session Expired or Log Out!\nRestart The Program !");
					}
				}
				else {
					nsuer.inputNid();
					signIn(nsuer.getNid());
					JOptionPane.showMessageDialog(null, "Session Expired or Log Out!\nRestart The Program !");
				}
			}
		}
		return false;
	}

}
