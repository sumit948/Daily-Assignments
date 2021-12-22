package ifElseUsingJOoptionPane;

import javax.swing.JOptionPane; //for GUI

public class Test {

	public static void main(String[] args) {
		int grade;
        String gradeAsString;   
        gradeAsString = JOptionPane.showInputDialog ("What is your grade?"); //associated with window
        grade = Integer.parseInt (gradeAsString);
        if ( grade >= 60 )
        {
            JOptionPane.showMessageDialog(null,"You passed!!!" );
            JOptionPane.showMessageDialog(null,"Congratulations!");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"You failed!");
        }

	}

}
