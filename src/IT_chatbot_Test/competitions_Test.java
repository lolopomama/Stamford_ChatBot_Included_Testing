package IT_chatbot_Test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import IT_chatbot.check_competitions;

@RunWith(Parameterized.class)
public class competitions_Test {
	
	check_competitions check;
	
	@Before
	public void setUp() throws Exception {
		check= new check_competitions();
	}
	
			private  String[] expected;
			
		public competitions_Test(String[] expected)
		{
			this.expected = expected;
		}
		
		@Parameters
		public static Collection testConditions(){
		      String[] expected ={"08-09 September    |Open House              |Stamford Rama9 Campus    | 9:00-16:00","08-10 September    |Smart Energy Hackathon  |Chamchuri 10Bd FL20      | 10:30-12:00"};
		      
	        return Arrays.asList(new Object [][]{
	                {expected},
	   
	        });
		}
	@Test
	public void test() {
	    Assert.assertArrayEquals(check_competitions.compete(),expected);
	}

}
