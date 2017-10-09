package IT_chatbot_Test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import IT_chatbot.view_trips;

@RunWith(Parameterized.class)
public class view_trips_Test {
	
	view_trips check;
		
		@Before
		public void setUp() throws Exception {
			check= new view_trips();
		}
		
				private  String[] expected;
				
			public view_trips_Test(String[] expected)
			{
				this.expected = expected;
			}
			
			@Parameters
			public static Collection testConditions(){
			      String[] expected ={"App man  - 7th September 2017","Agoda    - 20th September 2017","Google   - 11th October 2017","Facebook - 12th October 2017"};
			      
		        return Arrays.asList(new Object [][]{
		                {expected},
		   
		        });
			}
		@Test
		public void test() {
		    Assert.assertArrayEquals(view_trips.it_trips(),expected);
		}
	}

