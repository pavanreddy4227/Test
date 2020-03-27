/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_and_private;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class StaticClass extends Super {
    int i;

    final public  StaticClass(int i) {
        this.i = i;
    }
    
   public static void display(){
      System.out.println("Sub class");
   }
   public static void print(){
      System.out.println("Sub class");
   }
}