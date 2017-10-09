package IT_chatbot;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class enrol_now {
	private static Scanner scan = new Scanner(System.in);
	public static String enter_courses(String courseID, String courseName){
		
		    try {
		         FileWriter writer = new FileWriter("enrolled_courses.txt", true);
		         writer.write(courseID + " " + courseName);
		         writer.write("\r\n");
		         writer.close();
		   
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		    System.out.println("You have been enrolled to " + courseID + " " + courseName);
			
		    return "You have been enrolled to "+ courseID + " " + courseName;
		    
		    }
		    
		}
		

    /*	String filePath = "enrolled_courses.txt";
    	String enrolled_courses[]=new String[30];
    	int value_at=0;
    	
    	System.out.println("Your have enrolled in a new course, your current course listing is below:");
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		 
		    while ((lineText = lineReader.readLine()) != null) {
		        
		        	System.out.println(lineText);
		        	enrolled_courses[value_at]=lineText;
			        value_at=value_at+1;
		        }
		    	
	         
	      		
	      	  RandomAccessFile detectBlank = new RandomAccessFile(filePath,"rw" );
	          detectBlank.seek(value_at+15);
	          detectBlank.writeUTF(courseID+" "+courseName);
	          System.out.println(courseID+" "+courseName);
		 
		    lineReader.close();
		    
	          }   catch (IOException ex) {
	  		    System.err.println(ex);
	  		}
	  		 
		return enrolled_courses;
    	

    	 }
    
}*/
