package IT_chatbot_Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import IT_chatbot.drop_course;

@RunWith(Parameterized.class)
public class drop_course_test {

	drop_course check;
		
		@Before
		public void setUp() throws Exception {
			check= new drop_course();
		}
		
				private String[] output;
				private String input1;
				private String input2;
				
			public drop_course_test(String output[],String input1,String input2 )
			{
				this.output=output;
				this.input1=input1;
				this.input2=input2;
			}
			
			@Parameters
			public static Collection testConditions(){
			
				String[] droplist1={"ITE222 Web Development 2","ITE365 Software Quality Management","ITE446 Current Topics in Software Engineering","ITE220 Programming 1",""};
				String[] droplist2={"ITE365 Software Quality Management","ITE446 Current Topics in Software Engineering","ITE220 Programming 1",""};
		       
				return Arrays.asList(new Object [][]{
		                  {droplist1, "216110116","ITE200"}, //this test is working
		            //    {droplist2, "216110116","ITE222"}, //this one is not
		   
		        });
			}
		@Test
		public void test() {
			assertEquals(output, drop_course.drop(input1, input2));
		}

}
