package IT_chatbot_Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import IT_chatbot.course_details;
import org.hamcrest.CoreMatchers;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class course_details_Test {
course_details check;
	
	@Before
	public void setUp() throws Exception {
		check= new course_details();
	}
	
			private  String output;
			private String input;
			
		public course_details_Test(String output,String input)
		{
			this.output=output;
			this.input=input;
		}
		
		@Parameters
		public static Collection testConditions(){
			
		String courseA = "   ITE447      |Current Topics in Web Technology      | 8:30-12:30  |    Wednesdays        | Tommas";
		String courseB = "   ITE240      |Principles of Operating Systems       | 2:30-4:30   |    Wednesdays        | Tommas";
		String courseC = "   ITE479      |Project Planning                      | 8:30-10:30  | Mondays and Fridays  | Chaky";
		String error = null;
	//	String error = "The course does not exist";
		
		return Arrays.asList(new Object [][]{
	                {courseA, "ITE447"},
	                {courseB, "ITE240"},
	                {courseC, "ITE479"},
	                {error, "ITE800"},
	                {error, "ITE900"},
	   
	        });
		}
	
	
	@Test
	public void test() {
		assertEquals(output, course_details.view_course_details(input));
	}

}
