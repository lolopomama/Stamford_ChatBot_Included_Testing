package IT_chatbot;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class contact_hod {
		private static Scanner scan = new Scanner(System.in);
		public static String send(String studentID){
			
			String message_to_hod="";
			
		
			System.out.println("Please enter the message you would like to send:");
			message_to_hod = scan.nextLine();
		//	message_to_hod ="helo testing 123";
		    System.out.println("The message is sending...");
			
			
	        Properties props = new Properties();
	        props.put("mail.smtp.host", "smtp.gmail.com");
	        props.put("mail.smtp.port", "587");		
	        props.put("mail.smtp.auth", "true");
	        props.put("mail.smtp.starttls.enable", "true");
	       Session session = Session.getInstance(props,new javax.mail.Authenticator()
	       {
	     	  protected PasswordAuthentication getPasswordAuthentication() 
	     	  {
	     	 	 return new PasswordAuthentication("bakerygo.kmitl@gmail.com","Bakery2016");
	     	  }
	      });
	       
	      try
	      {   
	       MimeMessage message = new MimeMessage(session);
	          message.setFrom(new InternetAddress("bakerygo.kmitl@gmail.com"));
	          message.addRecipient(Message.RecipientType.TO,new InternetAddress("lolopomama@gmail.com"));
	          message.setSubject("Contact email from student "+studentID);
	          StringBuffer emailMessage = new StringBuffer("Dear Aj.Chaky");
	           emailMessage.append("\r\n");
	           emailMessage.append("Student with id number " + studentID+ " has sent the following message " + "\r\n"+"\r\n"+message_to_hod);
	           emailMessage.append("\r\n");
	           emailMessage.append("\r\n");
	           emailMessage.append("\r\n");
	           emailMessage.append("Best regard,");
	           emailMessage.append("\r\n");
	           emailMessage.append("\r\n");
	           emailMessage.append("**Sent by Chatbot STIU Team.");
	          message.setText(emailMessage.toString());
	          Transport.send(message);
	    
	    
	       }
	       catch(Exception e)
	       {
	       	 e.printStackTrace();
	       }
		return "message sent!";
	}
	}


