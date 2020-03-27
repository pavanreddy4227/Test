/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutableDemo;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s = new Student("ABC", 101); 
        Student s = new Student("BC", 10); 
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo());
    }   
}
