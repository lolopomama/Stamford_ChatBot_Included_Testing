package IT_chatbot_Test;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.File;
import java.io.FileWriter;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
public class Files_Mock_Test {
	    @Before
	    public void setUp() throws Exception {
	        
	    }
	    
	    @Test
	    public void test() throws Exception{
	        
	        FileWriter mock = mock(FileWriter.class);
	        
	        PowerMockito.mock(FileWriter.class);
	        PowerMockito.whenNew(FileWriter.class).withArguments(new File("enrolled_courses.txt")).thenReturn(null);
	        PowerMockito.whenNew(FileWriter.class).withArguments(new File("competitions.txt")).thenReturn(null);
	        PowerMockito.whenNew(FileWriter.class).withArguments(new File("trips.txt")).thenReturn(null);
	        PowerMockito.whenNew(FileWriter.class).withArguments(new File("courses_with_details.txt")).thenReturn(null);
	        PowerMockito.whenNew(FileWriter.class).withArguments(new File("courses.txt")).thenReturn(null);
	        
	    }
	    
	}


