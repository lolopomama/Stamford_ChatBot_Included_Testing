package IT_chatbot_Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import IT_chatbot.check_gpa;
import IT_chatbot.enrol_now;

@RunWith(Parameterized.class)
public class enrol_test {
	check_gpa check;
		
		@Before
		public void setUp() throws Exception {
			check= new check_gpa();
		}
		
				private  String output;
				private String input1;
				private String input2;
				
			public enrol_test(String output,String input1,String input2)
			{
				this.output=output;
				this.input1=input1;
				this.input2=input2;
			}
			
			@Parameters
			public static Collection testConditions(){
			
				String course1 = "You have been enrolled to ITE446 Current Topics in Software Engineering";
				String course2 = "You have been enrolled to ITE222 Web Development 2";
				String course3 = "You have been enrolled to ITE220 Programming 1";
				
				String input1_1 = "ITE446";
				String input1_2 = "ITE222";
				String input1_3 = "ITE220";
				
		        return Arrays.asList(new Object [][]{
		                {course1, input1_1,"Current Topics in Software Engineering"},
		                {course2, input1_2,"Web Development 2"},
		                {course3, input1_3,"Programming 1"},
		   
		        });
			}
		@Test
		public void test() {
			assertEquals(output, enrol_now.enter_courses(input1,input2 ));
		}

}
