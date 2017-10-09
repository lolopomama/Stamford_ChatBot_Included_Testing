package IT_chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class course_details {
public static String view_course_details(String course_code){
		
		String filePath = "courses_with_details.txt";
		String details_list = null;
		Boolean found=false;
		
		System.out.println("----------------------------------------------------------------------------------------------------------");
		System.out.println(" Course ID     |              Course Name             |  Class Time |       Class Days     |   Lecturer   ");
		System.out.println("----------------------------------------------------------------------------------------------------------");
		
		 if(course_code!=""){
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		 
		    while ((lineText = lineReader.readLine()) != null) {
		    	if(lineText.contains(course_code)){
		        	System.out.println(lineText);
		        	details_list=lineText;
			        found=true;
		        }
		    	
		    }
		    
		    System.out.println("----------------------------------------------------------------------------------------------------------");
		    System.out.println("");
		    lineReader.close();
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		 }
		 if(found=false){
		 return "The course does not exist";
		    }else{
		 return details_list;   	
		    }
		
	}
    	
}
