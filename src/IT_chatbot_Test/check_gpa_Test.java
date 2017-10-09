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

@RunWith(Parameterized.class)
public class check_gpa_Test {
check_gpa check;
	
	@Before
	public void setUp() throws Exception {
		check= new check_gpa();
	}
	
			private  String output;
			private Double input;
			
		public check_gpa_Test(String output,Double input)
		{
			this.output=output;
			this.input=input;
		}
		
		@Parameters
		public static Collection testConditions(){
		
	        return Arrays.asList(new Object [][]{
	                {"Sorry you are not elegibile to take 5 subjects GPA is too low", 1.0},
	                {"You are elegible to enrol in 5 subjects", 4.0},
	                {"You are elegible to enrol in 5 subjects", 3.6},
	               
	   
	        });
		}
	@Test
	public void test() {
		assertEquals(output, check_gpa.gpa_elegibility(input));
	}

}
