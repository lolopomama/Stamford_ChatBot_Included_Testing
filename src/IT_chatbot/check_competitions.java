package IT_chatbot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class check_competitions {
public static String[] compete(){
    
	String[] courses = new String[2];
	int x =0;
	
        try {
            FileReader reader = new FileReader("competitions.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
 
            String line;
           System.out.println("------------------------------------------------------------------------------------");
           System.out.println("       Date        |       Event Name       |          Venue          |    Time    ");
           System.out.println("------------------------------------------------------------------------------------");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                courses[x] = line;
                x++;
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return courses;
        
    }
    
}

