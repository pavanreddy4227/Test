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
public final class Student 
{ 
    final String name; 
    final int regNo; 
  
    public Student(String name, int regNo) 
    { 
        this.name = name; 
        this.regNo = regNo; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public int getRegNo() 
    { 
        return regNo; 
    } 
} 
