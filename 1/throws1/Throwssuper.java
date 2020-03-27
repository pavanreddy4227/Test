/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throws1;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class Throwssuper {
    public void print() {
        System.out.println("In Parent displayMsg()");
    }
}
class FinalizeExample{  
public void finalize(){System.out.println("finalize called");}  
public static void main(String[] args){  
FinalizeExample f1=new FinalizeExample();  
FinalizeExample f2=new FinalizeExample();  
f1=null;  
f2=null;  
System.gc();  
}}  
