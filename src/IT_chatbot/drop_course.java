package IT_chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class drop_course {
public static String[] drop(String studentID, String courseCode){
		
    	String filePath = "enrolled_courses"+studentID+".txt";
    	String disenrolled_subtracted[]=new String[5];
    	int value_at=0;
    	
    	System.out.println("Your Course has been dropped the following are your current courses:");
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		 
		    while ((lineText = lineReader.readLine()) != null) {
		        if(lineText.contains(courseCode)){
		        	lineText = lineText.replace(lineText, "");
		        	FileWriter writer = new FileWriter("filePath", true);
		            writer.write("-disenrolled-"+lineText);
		        }else{
		        	System.out.println(lineText);
		        	disenrolled_subtracted[value_at]=lineText;
			        value_at=value_at+1;
		        }
		    	
		    }
		 
		    lineReader.close();
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		return disenrolled_subtracted;
    	
  	}
    
}
