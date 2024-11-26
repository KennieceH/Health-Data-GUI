package newPack;

import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Creates the survey_results.csv file and stores the user data from the GUI survey;
 */
public class FileHandler {

	private String surveyFile;
	public FileWriter fileOutput;
	public PrintWriter printWriter;
	
	
	/**
	 *  creates the header and name for the survey_results.csv file 
	 */
	public FileHandler() {
		
		surveyFile = "survey_results.csv";
		String header = "DateTime,FirstName,LastName,PhoneNumber,Email,Sex,Water,Meals,Wheat,Sugar,Dairy,Miles,Weight";
		writeResults(header);		
	}
	
	
	/**
	 * writes the results from the survey into the file.
	 * @param surveyData data from the survey.
	 */	
	public void writeResults(String surveyData) 
	{
		
		
	    
	  try {   
		 
		  fileOutput = new FileWriter(surveyFile,true);
		  printWriter = new PrintWriter(fileOutput);
	      printWriter.println(surveyData);
		
	      printWriter.close();
	      fileOutput.close();
	  
	    
	  } catch (IOException e) {
			
			e.printStackTrace();
	    }

		
	}
}
