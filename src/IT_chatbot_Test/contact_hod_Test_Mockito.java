package IT_chatbot_Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import IT_chatbot.contact_hod;


@RunWith(PowerMockRunner.class)
@PrepareForTest(javax.mail.Session.class)
public class contact_hod_Test_Mockito {
	    contact_hod authentic = mock(contact_hod.class);
	    
        String studentID ="216110116";
		
	  @Test
	  public void test() throws Exception {
		  
	  //  PowerMockito.doReturn().when(contact_hod.class, "send","216110116");
		  
	//	  Mockito.when(authentic.send(studentID)).thenReturn("message sent!");
		  
	    
	    try {
	    authentic.send(studentID);
	    }catch (Exception e){
			e.printStackTrace();
		}
	
	    verify(authentic).send(studentID);
	 //   verify("helo testing 123").authentic.addRecipient.Message.RecipientType.TO, new InternetAddress("lolopomama@gmail.com");
	   
	
	}
	}

	
