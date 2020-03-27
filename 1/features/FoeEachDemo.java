/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Pavan Sai Kumar Reddy Kamjula
 */
public class FoeEachDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> myList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            myList.add(i);
        }
        Iterator<Integer> it = myList.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println("Iterator:" + i);
        }
        myList.forEach(new Consumer<Integer>() {

            public void accept(Integer t) {
                System.out.println("forEach class:" + t);
            }
        });
        MyConsumer action = new MyConsumer();
        myList.forEach(action);
    }
}

class MyConsumer implements Consumer<Integer> {

    public void accept(Integer t) {
        System.out.println("Consumer Value::" + t);
    }
}
