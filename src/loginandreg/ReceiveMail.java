/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package loginandreg;

import java.io.*;
import java.util.Properties;
import java.util.*;
import javax.mail.*;


/**
 *
 * @author 20102
 */
public class ReceiveMail {

    public static int receivemail() {
        try {
            String UserName = "easy.bank23@gmail.com";
            String Password = "tvwlbawpkzroelcy";
            Properties properties = new Properties();
            properties.setProperty("mail.store.protocol", "imaps");
            Session emailSession = Session.getDefaultInstance(properties);
            Store emailStore = emailSession.getStore("imaps");
            emailStore.connect("imap.gmail.com", UserName, Password);
            Folder emailFolder = emailStore.getFolder("INBOX");
            emailFolder.open(Folder.READ_WRITE);
            Message messages[] = emailFolder.getMessages();
//            int start = Math.max(0, messages.length - 3); // to handle if there are fewer than 3 messages
            
            Message lastMessage = messages[messages.length - 1];
            
            System.out.println(lastMessage.getSubject().toString());
            
            if(lastMessage.getSubject().toString().equals("Delivery Status Notification (Failure)"))
            {
            // Mark the last message as deleted
            lastMessage.setFlag(Flags.Flag.DELETED, true);
            
            // Expunge to actually delete the message
            emailFolder.expunge();
            return 1;
            }
            emailFolder.close(false);
            emailStore.close();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
        
        return 0;
    }
    
}
