package IT_chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class view_trips {
	public static String[] it_trips(){
    	String filePath = "trips.txt";
    	String trips_list[]=new String[4];
		 
		try {
		    BufferedReader lineReader = new BufferedReader(new FileReader(filePath));
		    String lineText = null;
		    int value_at = 0;
		 
		    while ((lineText = lineReader.readLine()) != null) {
		        System.out.println(lineText);
		        trips_list[value_at]=lineText;
		        value_at=value_at+1;
		    }
		 
		    lineReader.close();
		} catch (IOException ex) {
		    System.err.println(ex);
		}
		return trips_list;	
  	}
}
