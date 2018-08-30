package Demo1;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailJava {

	public static void main(String[] args) throws EmailException{
		
		System.out.println("========Test started=====");
		try {
			Email email = new SimpleEmail();
			email.setHostName("smtp.gmail.com");
			email.setSmtpPort(587);
			email.setAuthenticator(new DefaultAuthenticator("sachinrbhatkumta@gmail.com", "isitcorrect011985"));
			//email.setSSLOnConnect(true);
			email.setFrom("sachin.rb@exilant.com");
			email.setSubject("Selenium Test Report");
			email.setMsg("This is a test mail from Selenium... :-)");
			email.addTo("sachinrbhatkumta@gmail.com");
			email.send();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("======Email sent======");
		
	}

}
