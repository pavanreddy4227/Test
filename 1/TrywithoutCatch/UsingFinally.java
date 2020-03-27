/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TrywithoutCatch;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class UsingFinally {
 public static void main(String args[])
 {
  try
  {
      int i=0;
      for(;i>1;i++)
   System.out.println("try block"); 
  }
  finally
  {
   System.out.println("finally block"); 
  }
 }
}