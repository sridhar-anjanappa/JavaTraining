/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iksri01
 */
public class GenericsDemo {

    public static void main(String... args) {
        List list = new ArrayList();
        list.add("Vishal");
        list.add(20);
        String name = (String) list.get(0);
        int age = (int) list.get(1);
        System.out.println(String.format("Age of %s is %d", name, age));

        List<String> glist = new ArrayList<String>();
        list.add("Lekha");
        list.add(10);
        String s = glist.get(0);   // no cast
        //int a = glist.get(1); // compile time type checking
    }
}
