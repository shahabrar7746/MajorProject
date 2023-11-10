package main;





import java.io.IOException;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class Mail {
	
	private final String email = "24local.pvt.lmt@gmail.com\r\n"
			+ ""
			+ "";
	private final String password = "xkwv wufp klzp pmuv\r\n"
			+ ""
			+ "";
	private  String otp = "";
	private String mail = null;
	public void sendMail(String recepient,String otp,String consumerName) {
	final String senderEmail = email;
    final String senderPassword = password;
    String recipientEmail = recepient;

    Properties props = new Properties();
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");

    Session session = Session.getInstance(props, new javax.mail.Authenticator() {
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(senderEmail, senderPassword);
        }
    });

    session.setDebug(true); // Enable debugging

    try {
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(senderEmail));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipientEmail));
        message.setSubject("OTP for resetting your 24Local Private Limited account password");
        message.setText("Hi " + consumerName +",\n"
        		+ "Your OTP for 24Local Private Limited is " + otp + " \n"
        				+ "Please enter this code in the app or on the website to verify your identity.\n" + ""
        						+ "This OTP is valid for 10 minutes. If you do not use it within that time, a new OTP will be generated.\r\n"
        						+ "\r\n"
        						+ "If you did not request this OTP, please ignore this email.\n"
        						+"Thanks,\n"
        						+ "The 24Local Team"
        		);
this.otp = otp;
this.mail = mail;
        Transport.send(message);

       

    } catch (MessagingException e) {
        e.printStackTrace();
       
    }
    
}
	public String getOtp() {
    	return this.otp;
    }
	public String getMail() {
    	return this.mail;
    }
public static void main(String[] args) throws AddressException, MessagingException, IOException {
	Mail mail = new Mail();
        mail.sendMail("shahabrar7746@gmail.com", new common().generateOTP(), "Abrar");
}
}
