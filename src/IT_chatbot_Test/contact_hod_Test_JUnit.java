package IT_chatbot_Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import IT_chatbot.contact_hod;

@RunWith(Parameterized.class)
public class contact_hod_Test_JUnit {
contact_hod check;
	
	@Before
	public void setUp() throws Exception {
		check= new contact_hod();
	}
	
			private  String output;
			private String input;
			
		public contact_hod_Test_JUnit(String output,String input)
		{
			this.output=output;
			this.input=input;
		}
		
		@Parameters
		public static Collection testConditions(){
		
	        return Arrays.asList(new Object [][]{
	                {"message sent!", "216110116"},
	                {"message sent!", "217236623"},
	                {"message sent!", "218635652"},
	      
	   
	        });
		}
	@Test
	public void test() {
		assertEquals(output, contact_hod.send(input));
	}

}
