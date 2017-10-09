package IT_chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class available {
	
	public static String[] view_courses_available(){
		String filePath = "courses.txt";
		String courses[]=new String[17];
		int value_at=0;
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		 
		    while ((lineText = lineReader.readLine()) != null) {
		        System.out.println(lineText);
		        courses[value_at]=lineText;
		        value_at=value_at+1;
		    }
		 
		    lineReader.close();
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		
		return courses;
	}
}
