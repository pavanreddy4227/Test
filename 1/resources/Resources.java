/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import java.io.FileOutputStream;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class Resources {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (FileOutputStream fileOutputStream = newFileOutputStream("abc.txt")) {
            String msg = "Welcome to javaTpoint!";
            byte byteArray[] = msg.getBytes(); //converting string into byte array      
            fileOutputStream.write(byteArray);
            System.out.println("Message written to file successfuly!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }

    private static FileOutputStream newFileOutputStream(String abctxt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
