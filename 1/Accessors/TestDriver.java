/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class TestDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String One = "Bandi";
        String Two = "Case";
        String Three = "Hoot";
        String Four = "Bell";

        // create list one and store values
        List<String> Value1 = new ArrayList<String>();
        Value1.add("frameworks");
        Value1.add("frameworks");
        Value1.add("c#");

        // create list two and store values
        List<String> Value2 = new ArrayList<String>();
        Value2.add("webapps");
        Value2.add("webapps");
        Value2.add("bigdata");
        Value2.add("forensics");

        // create list three and store values
        List<String> Value3 = new ArrayList<String>();
        Value3.add("Discreete Math");
        Value3.add("andriod");
        Value3.add("andriod");
        Value3.add("ML");

        List<String> Values4 = new ArrayList<String>();
       Values4.add("java");
        Values4.add("secure programming");
        Values4.add("ML");
        Values4.add("frameworks");

        // put values into map
        Map<String, List<String>> prof = new HashMap<String, List<String>>();
        prof.put(One, Value1);
        prof.put(Two, Value2);
        prof.put(Three, Value3);
        prof.put(Four, Values4);

        maxCourse(prof);
        unqCourses(prof);
       mlCourse(prof);
    }

   
    public static void maxCourse(Map<String, List<String>> facultymap) {
        String faculty= "";
                Iterator<Map.Entry<String, List<String>>> itr = facultymap.entrySet().iterator();
   Map.Entry<String, List<String>> entry = itr.next();
   Set<String> valueSet = new TreeSet<String>(entry.getValue());
                int maximum=valueSet.size();
                faculty = entry.getKey();
        while (itr.hasNext()) {
           entry =  itr.next();
           valueSet = new TreeSet<String>(entry.getValue());
           
          if(maximum < valueSet.size()){
              maximum = valueSet.size();
              faculty = entry.getKey();
          }
       
        }
        
        System.out.println(faculty + " has a max of " + maximum+" preparations");
    }

    public static void unqCourses(Map<String, List<String>> facultymap) {

        Iterator<Map.Entry<String, List<String>>> itr = facultymap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();

            Set<String> valueSet = new TreeSet<String>(entry.getValue());
            int numberUniqueB = valueSet.size();
            System.out.print(entry.getKey() + " has ");
            System.out.println(numberUniqueB + " preparations");
        }
    }
 public static void mlCourse(Map<String, List<String>> facultymap) {

     int count=0;
        Iterator<Map.Entry<String, List<String>>> itr = facultymap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<String, List<String>> entry = itr.next();

     if(entry.getValue().contains("ML")){
    System.out.println(entry.getKey());
    count++;
    
}
        }
            System.out.println(count+" proffessors teaches machine learning");

    }
}