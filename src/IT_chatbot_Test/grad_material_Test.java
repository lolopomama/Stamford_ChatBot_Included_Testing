package IT_chatbot_Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import IT_chatbot.grad_material;

@RunWith(Parameterized.class)
public class grad_material_Test {

grad_material check;
	
	@Before
	public void setUp() throws Exception {
		check= new grad_material();
	}
	
			private  Boolean output;
			private int input;
			
		public grad_material_Test(Boolean output,int input)
		{
			this.output=output;
			this.input=input;
		}
		
		@Parameters
		public static Collection testConditions(){
		
	        return Arrays.asList(new Object [][]{
	                {false, 140},
	                {false, 130},
	                {false, 4},
	                {false, 160},
	                {true, 170},
	   
	        });
		}
	
	@Test
	public void test() {
		assertEquals(output, grad_material.graduation_check(input));
	}

}
