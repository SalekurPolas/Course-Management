//package com.project.courseManagement;

import javax.swing.JOptionPane;

public class Game {
	
	public void game() {
		JOptionPane.showMessageDialog(null, "====[ Welcome to Brain Game ]====\nPlease Read With Attentively & Press\n(We won't store your data)");
		JOptionPane.showMessageDialog(null, "====[ Step 1 ]====\nPlease Think a Digit From 1 to 9");
		JOptionPane.showMessageDialog(null, "====[ Step 2 ]====\nPlease Add 1 If You Think Odd or Add 2 If Even");
		JOptionPane.showMessageDialog(null, "====[ Step 3 ]====\nDivide Your Answer By 2");
		JOptionPane.showMessageDialog(null, "====[ Step 4 ]====\nMultiple Your Answer By 9");
		JOptionPane.showMessageDialog(null, "====[ Step 5 ]====\nAdd Two Digit of Your Answer\nHELP: If Answer is 29 do it 2+9 = 11\nAnd Remember it");
	    choice();
	}
	public void choice() {
	    String charecter = JOptionPane.showInputDialog(null, "====[ Step 6 ]====\nPlease Enter an Alphabet From A to Z: ");
	    
	    if(charecter.equals("A") || charecter.equals("z") || charecter.equals("I") || charecter.equals("r") || charecter.equals("Q") || charecter.equals("j") || charecter.equals("Y") || charecter.equals("b")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 8 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(1);
	    }
	    else if(charecter.equals("B") || charecter.equals("y") || charecter.equals("J") || charecter.equals("q") || charecter.equals("R") || charecter.equals("i") || charecter.equals("Z") || charecter.equals("a")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 7 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(2);
	    }
	    else if(charecter.equals("C") || charecter.equals("x") || charecter.equals("K") || charecter.equals("p") || charecter.equals("S") || charecter.equals("h")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 6 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(3);
	    }
	    else if(charecter.equals("D") || charecter.equals("w") || charecter.equals("L") || charecter.equals("o") || charecter.equals("T") || charecter.equals("g")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 5 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(4);
	    }
	    else if(charecter.equals("E") || charecter.equals("v") || charecter.equals("M") || charecter.equals("n") || charecter.equals("U") || charecter.equals("f")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 4 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(5);
	    }
	    else if(charecter.equals("F") || charecter.equals("u") || charecter.equals("N") || charecter.equals("m") || charecter.equals("V") || charecter.equals("e")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 3 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(6);
	    }
	    else if(charecter.equals("G") || charecter.equals("t") || charecter.equals("O") || charecter.equals("l") || charecter.equals("W") || charecter.equals("d")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 2 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(7);
	    }
	    else if(charecter.equals("H") || charecter.equals("s") || charecter.equals("P") || charecter.equals("k") || charecter.equals("X") || charecter.equals("c")) {
	    	JOptionPane.showMessageDialog(null, "====[ Step 7 ]====\nMinus 1 From Your Answer");
	    	JOptionPane.showMessageDialog(null, "====[ Step 8 ]====\nConvert Your Answer to English Alphabet Like As  1=A, 2=B, ... ,26=Z");
	    	answer(8);
	    }
	}
	
	public void answer(int value) {
		switch(value){
		case 1:
			JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word of Fruit That Contains 5 Alphabet And is Also a Company Name By Your Answer Alphabet");
			JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word of a Food That Contains 3 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
			JOptionPane.showMessageDialog(null, "====[ Your First Word : Apple ]====");
			JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Egg ]====");
			break;
		case 2:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Country Name That Contains 10 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word of Animal Who Run Fast And Contain 5 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Bangladesh ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Horse ]====");
	        break;
	    case 3:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word of Pet That Contain 3 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word of a Drink That Contain 3 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Cat ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Tea ]====");
	        break;
	    case 4:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word of Animal That Contain 3 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word Which is Used in Football Game That Contain 4 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Dog ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Goal ]====");
	        break;
	    case 5:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word of Food That Contain 3 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word Which is Used in Football Game That Contain 4 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Egg ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Goal ]====");
	        break;
	    case 6:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word of Wocial Media That Contain 8 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word Which is Used to Unlock a Lock That Contain 3 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Facebook ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Key ]====");
	        break;
	    case 7:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word Which Use in Football Game That Contain 4 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word of a Electric Device That Contain 6 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Goal ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Laptop ]====");
	        break;
	    case 8:
	    	JOptionPane.showMessageDialog(null, "====[ Step 9 ]====\nThink a Word Which Has Every Married Women That Contain 7 Alphabet By Your Answer Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Step 10 ]====\nThink a Word of a Animal That Contain 3 Alphabet & Which 1st Alphabet is 1st Word's Last Alphabet");
	    	JOptionPane.showMessageDialog(null, "====[ Your First Word : Husband ]====");
	    	JOptionPane.showMessageDialog(null, "====[ Your Second Word  : Dog ]====");
	        break;
	    }
		JOptionPane.showMessageDialog(null, "Thank You For Participating\nIt is Created By Polas\nIdea From Discovery Channel");
	}
	
}
