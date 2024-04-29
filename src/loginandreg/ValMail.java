package loginandreg;

import java.io.IOException;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class ValMail {
    public static boolean EmailVal(String input) {
        String EmailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        Pattern emailPat  = Pattern.compile(EmailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher   = emailPat.matcher(input);
        return matcher.find();
    }
    
    public static String generateRandomCode(int length) {
        // Define characters allowed in the code
        String characters = "0123456789";

        // Initialize a random number generator
        Random random = new Random();

        // Create a StringBuilder to store the code
        StringBuilder code = new StringBuilder(length);

        // Generate random characters
        for (int i = 0; i < length; i++) {
            // Generate a random index within the allowed characters range
            int randomIndex = random.nextInt(characters.length());

            // Append the randomly selected character to the code
            code.append(characters.charAt(randomIndex));
        }

        // Convert StringBuilder to String and return
        return code.toString();
    }
    public static void sendEmail(String recipientEmail,String Sub,String body) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("easy.bank23@gmail.com","tvwlbawpkzroelcy");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("easy.bank23@gmail.com"));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
            message.setSubject(Sub);

            // Create multipart content
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(body);

            // Construct the entire message parts
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);

            // Set the content of the message
            message.setContent(multipart);

            // Send the message
            Transport.send(message);

            System.out.println("Email sent successfully.");

        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}