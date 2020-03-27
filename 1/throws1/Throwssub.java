/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws1;

import java.io.IOException;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class Throwssub extends Throwssuper{
     @Override
     public void print() throws IOException{  
        System.out.println("In ExceptionOverrideDemo displayMsg()"); 
    }  
}
