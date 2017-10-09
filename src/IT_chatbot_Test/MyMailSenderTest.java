package IT_chatbot_Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.commons.mail.EmailException;
import org.junit.Before;
import org.junit.Test;
import org.jvnet.mock_javamail.Mailbox;

import IT_chatbot.MyMailSender;


public class MyMailSenderTest {

 private MyMailSender mailSender;

 @Before
 public void setUp() {
  mailSender = new MyMailSender();
  //clear Mock JavaMail box
  Mailbox.clearAll();
 }

 @Test
 public void testSendInRegualarJavaMail() throws MessagingException, IOException, EmailException {

  String subject = "Test1";
  String body = "Test Message1";
  mailSender.sendMail("danielgoncalves62@gmail.com", "bakerygo.kmitl@gmail.com", subject, body);
  
  Session session = Session.getDefaultInstance(new Properties());
  Store store = session.getStore("pop3");
  store.connect("smtp.gmail.com", "smtp.gmail.com", "Bakery2016");

  Folder folder = store.getFolder("inbox");

  folder.open(Folder.READ_ONLY);
  Message[] msg = folder.getMessages();

  assertTrue(msg.length == 1);
  assertEquals(subject, msg[0].getSubject());
  assertEquals(body, msg[0].getContent());
  folder.close(true);
  store.close();
 } 

 @Test
 public void testSendInMockWay() throws MessagingException, IOException, EmailException {

  String subject = "Test2";
  String body = "Test Message2";
  
  mailSender.sendMail("danielgoncalves62@gmail.com", "bakerygo.kmitl@gmail.com", subject, body);
  
  List<Message> inbox = Mailbox.get("bakerygo.kmitl@gmail.com");
  
  assertTrue(inbox.size() == 1);  
  assertEquals(subject, inbox.get(0).getSubject());
  assertEquals(body, inbox.get(0).getContent());

 }
}
