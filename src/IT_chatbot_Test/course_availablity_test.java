package IT_chatbot_Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import IT_chatbot.available;
import IT_chatbot.check_competitions;


@RunWith(Parameterized.class)
public class course_availablity_test {
	available check;
	
	
	@Before
	public void setUp() throws Exception {
		check= new available();
	}
	
			private  String[] expected;
			
		public course_availablity_test(String[] expected)
		{
			this.expected = expected;
		}
		
		@Parameters
		public static Collection testConditions(){
		      String[] expected ={"ITE231 Fundimentals of System Administration","ITE221 Programming 1","ITE101 Introduction to IT","ITE442 Database Managment Systems","MIS103 Computer Applications","ITE479 Project Planning","ITE340 E-commerce Systems",
		    		  "ITE220 Web Development 2","ITE420 Information and System Security","ITE365 Software Quality Management","ITE331 Multimedia Technologies","ITE210 Ethics and Law for IT","ITE446 Current Topics in Software Engineering",
		    		  "ITE201 Service Desk and Incident Management","ITE447 Current Topics in Web Technology","ITE240 Principles of Operating Systems"," "};
		      
	        return Arrays.asList(new Object [][]{
	                {expected},
	   
	        });
		}
	@Test
	public void test() {
	    Assert.assertArrayEquals(available.view_courses_available(),expected);
	}

}
