package com.pack.mail;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class EmailMessage {
   public static void sendMail(String filename){
	   Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class",
				"javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		    protected PasswordAuthentication getPasswordAuthentication() {
		        return new PasswordAuthentication("kamleshmishra291@gmail.com", "K4pandit@gmail");
		    }
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("learningmartindia@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("kamleshmishra291@gmail.com"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," +
					"\n\n No spam to my email, please!");

			
	         // Send message
	         Transport.send(message);


			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
   }
   
}