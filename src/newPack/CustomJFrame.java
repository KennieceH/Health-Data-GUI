package newPack;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;


/**
 *  Creates the GUI for users to enter their first name, last name, phone number, email, gender, and weight
 *  along with how much water they drink a day, how man meals they eat a day and if they contain wheat, dairy
 *  or sugar, and how many miles they walk a day.
 */
public class CustomJFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;
	private JLabel headingLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel phoneNumberLabel;
	private JLabel emailLabel;
	private JLabel dietaryLabel;
	private JLabel genderLabel;
	private JLabel waterLabel;
	private JLabel mealsLabel;
	private JLabel checkBoxLabel;
	private JLabel walkLabel;
	private JLabel weightLabel;
	private JTextField firstNameTextField;
	private JTextField lastNameTextField;
	private JTextField phoneNumberTextField;
	private JTextField emailTextField;
	private JRadioButton maleRadioButton;
	private JRadioButton femaleRadioButton;
	private JRadioButton preferRadioButton;
	private ButtonGroup radioButtonGroup;
	private JSpinner waterIntakeSpinner;
	private JSlider mealSlider;
	private JCheckBox wheatCheckBox;
	private JCheckBox sugarCheckBox;
	private JCheckBox dairyCheckBox;
	private JComboBox<String> walkComboBox;
	private String[] walkOptions;
	private JFormattedTextField weightFormattedTextField;
	private JButton clearButton;
	private JButton submitButton;
	private FileHandler fileHandler;
	
	/**
	 *  Stores and Creates GUI for dietary survey. 
	 * 
	 */ 
	public CustomJFrame() {
		this.headingLabel = new JLabel("Personal Information");
		this.firstNameLabel = new JLabel("First Name:");
		this.lastNameLabel = new JLabel("Last Name");
		this.phoneNumberLabel = new JLabel("Phone Number:");
		this.emailLabel = new JLabel("Email:");
		this.dietaryLabel = new JLabel("Dietary Questions");
		this.genderLabel = new JLabel("Sex:");
		this.waterLabel = new JLabel("How many cups of water on average do you drink a day?");
		this.mealsLabel = new JLabel("How many meals on average do you eat a day?");
		this.checkBoxLabel = new JLabel("Do any of these meals contain:");
		this.walkLabel = new JLabel("On average how many miles do you walk in a day?");
		this.weightLabel = new JLabel("How much do you weigh?");
		this.firstNameTextField = new JTextField("",20);
		this.lastNameTextField = new JTextField("",20);
		this.phoneNumberTextField =  new JTextField("",20);
		this.emailTextField =  new JTextField("",20);
		this.maleRadioButton = new JRadioButton("Male");
		this.femaleRadioButton = new JRadioButton("Female");
		this.preferRadioButton = new JRadioButton("Prefer not to say");
		this.radioButtonGroup = new ButtonGroup();
		this.waterIntakeSpinner = new JSpinner(new SpinnerNumberModel(15, 0, 50, 1));
		this.mealSlider = new JSlider(0,10,3);
		this.wheatCheckBox = new JCheckBox("Wheat");
		this.sugarCheckBox = new JCheckBox("Sugar");
		this.dairyCheckBox = new JCheckBox("Dairy");
		this.walkOptions = new String[4];
		walkOptions[0] = "Less than 1 Mile";
		walkOptions[1] = " More than 1 mile but less than 2 miles";
		walkOptions[2] = " More than 2 miles but less than 3 miles";
		walkOptions[3] = "More than 3 miles";
		this.walkComboBox = new JComboBox<String>(walkOptions);
		NumberFormat  numberFormatter  = NumberFormat.getNumberInstance();
		this.weightFormattedTextField = new JFormattedTextField(numberFormatter);
		this.clearButton = new JButton("Clear");
		this.submitButton = new JButton("Submit");
		this.fileHandler = new FileHandler();
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.insets = new Insets(10, 7, 7, 7);
		c.gridx = 0;
		c.gridy = 0;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.BOTH;
		panel.add(headingLabel,c);
		add(panel);
		
		c.gridx = 0;
		c.gridy = 1;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(firstNameLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 1;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        c.weightx = .5; 
        panel.add(firstNameTextField,c);
        add(panel);
        
        c.gridx = 0;
		c.gridy = 2;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(lastNameLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 2;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        c.weightx = .5; 
        panel.add(lastNameTextField,c);
        add(panel);
        
        c.gridx = 0;
		c.gridy = 3;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(phoneNumberLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 3;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        c.weightx = .5; 
        panel.add(phoneNumberTextField,c);
        add(panel);
		
		c.gridx = 0;
		c.gridy = 4;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(emailLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 4;
        c.anchor = GridBagConstraints.WEST;
        c.fill = GridBagConstraints.NONE;
        c.weightx = .5; 
        panel.add(emailTextField,c);
        add(panel);
        
        c.gridx = 0;
		c.gridy = 5;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(genderLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 5;
        c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		panel.add(maleRadioButton,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 6;
        c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		panel.add(femaleRadioButton,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 7;
        c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		panel.add(preferRadioButton,c);
		add(panel);
		
		radioButtonGroup.add(maleRadioButton);
		radioButtonGroup.add(femaleRadioButton);
		radioButtonGroup.add(preferRadioButton);
		
		maleRadioButton.setActionCommand("Male");
		femaleRadioButton.setActionCommand("Female");
		preferRadioButton.setActionCommand("Prefer Not to Say");
		
		
		c.gridx = 0;
		c.gridy = 8;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		panel.add(dietaryLabel,c);
		add(panel);
		
		c.gridx = 0;
		c.gridy = 9;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(waterLabel,c);
		add(panel);
		
		c.gridx = 1;
        c.gridy = 10;
        c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		panel.add(waterIntakeSpinner,c);
		add(panel);
        
		c.gridx = 0;
		c.gridy = 11;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(mealsLabel,c);
		add(panel);
		
		mealSlider.setPaintTrack(true);
		mealSlider.setPaintTicks(true);
		mealSlider.setPaintLabels(true);
 
        
		mealSlider.setMajorTickSpacing(1);
		mealSlider.setMinorTickSpacing(1);
		
		
        
		c.gridx = 0;
        c.gridy = 12;
        c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(mealSlider,c);
		add(panel);
		
		c.gridx = 0;
		c.gridy = 13;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(checkBoxLabel,c);
		add(panel);
		
		c.gridx = 0;
		c.gridy = 14;
		c.anchor = GridBagConstraints.EAST;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 1;
		panel.add(wheatCheckBox,c);
		add(panel);
		
		c.gridx = 1;
		c.gridy = 14;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(dairyCheckBox,c);
		add(panel);
		
		c.gridx = 1;
		c.gridy = 14;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		panel.add(sugarCheckBox,c);
		add(panel);
		
		
		
		c.gridx = 0;
		c.gridy = 15;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(walkLabel,c);
		add(panel);
		
		
		
		c.gridx = 0;
		c.gridy = 17;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		walkComboBox.setPreferredSize(new Dimension(250,25));
		panel.add(walkComboBox,c);
		add(panel);
		
		
		c.gridx = 0;
		c.gridy = 18;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(weightLabel,c);
		add(panel);
		
		weightFormattedTextField.getValue();
		weightFormattedTextField.setColumns(15);
		
		c.gridx = 0;
		c.gridy = 19;
		c.anchor = GridBagConstraints.CENTER;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(weightFormattedTextField,c);
		add(panel);
		
		clearButton.setBackground(Color.YELLOW);
		c.gridx = 0;
		c.gridy = 20;
		c.anchor = GridBagConstraints.WEST;
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		panel.add(clearButton,c);
		add(panel);
		
		submitButton.setBackground(Color.GREEN);
		c.gridx = 0;
		c.gridy = 20;
		c.anchor = GridBagConstraints.EAST;
		c.fill = GridBagConstraints.NONE;
		panel.add(submitButton,c);
		add(panel);
		
		
		InnerActionListener listener = new InnerActionListener();
		
		submitButton.addActionListener(listener);
		clearButton.addActionListener(listener);
		wheatCheckBox.addActionListener(listener);
		sugarCheckBox.addActionListener(listener);
		dairyCheckBox.addActionListener(listener);
		
		
	}
	
	/**
	 * Converts results into a string to be outputted into the csv file if the user clicks the "submit" button,
	 * then clears all fields. If the user clicks the "clear" button all fields are cleared.
	 */
	class InnerActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			
			
			if(event.getSource() == submitButton)
			{
				
				
				String results = "";
				
				
				results += firstNameTextField.getText() + ",";
				results += lastNameTextField.getText() + ",";
				results += phoneNumberTextField.getText() + ",";
				results += emailTextField.getText() + ",";
				
				if (radioButtonGroup.getSelection() == null)
				{
					results += "null" + ",";
					
				}
				
				else
				{
					results += radioButtonGroup.getSelection().getActionCommand() + ",";
				}
				
				results += waterIntakeSpinner.getValue().toString() + ",";
				results += Integer.toString(mealSlider.getValue()) + ",";
				
				if(wheatCheckBox.isSelected())
				{
					results += "true" + ",";
				}
				
				else if(!wheatCheckBox.isSelected())
				{
					results += "false" + ",";
				}
				
				if(sugarCheckBox.isSelected())
				{
					results += "true" + ",";
					
				}
				
				else if(!sugarCheckBox.isSelected())
				{
					results += "false" + ",";
				}
				
				if(dairyCheckBox.isSelected())
				{
					results += "true" + ",";
				}
				
				else if(!dairyCheckBox.isSelected())
				{
					results += "false" + ",";
				}
				
				results += walkComboBox.getSelectedItem().toString() + ",";
				
				if(!weightFormattedTextField.getText().isEmpty())
				{
					results += weightFormattedTextField.getText();
				}
				
				else
				{
					results += "null";
				}
				
				System.out.println(results);
				
				SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
			    Date date = new Date();  
				
				  fileHandler.writeResults(sdf.format(date)+"," + results);
				  
				
				
				
				
				clearForm();
				
				
				
				}
			
			else if(event.getSource() == clearButton)
			{
				clearForm();
			}
			
			
			
		}
		
		/**
		 *  Clears all fields and resets them to their default.
		 */
		
		public void clearForm(){
			firstNameTextField.setText(null);
			lastNameTextField.setText(null);
			phoneNumberTextField.setText(null);
			emailTextField.setText(null);
			radioButtonGroup.clearSelection();
			mealSlider.setValue(3);
			waterIntakeSpinner.setValue(15);
			wheatCheckBox.setSelected(false);
			sugarCheckBox.setSelected(false);
			dairyCheckBox.setSelected(false);
			walkComboBox.setSelectedIndex(0);
			weightFormattedTextField.setValue(null);
		}
	}
	

}
