package newPack;
/**
 * Author: Kenniece Harris
 * Course: COP3503
 * Project#: 4
 * Title: Project4_N01503765
 * Due Date: 8/05/2022
 * 
 *  Creates a GUI that allows users to answer dietary questions. The information is then outputted to a csv file
 *  called survey_result.csv
 */



import javax.swing.JFrame;

/**
 *  Creates the frame for the GUI.
 */
public class Project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomJFrame frame = new CustomJFrame();
		frame.setTitle("Dietary Survey");
		frame.pack();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true); 
	    
	    
	    
	}

}
