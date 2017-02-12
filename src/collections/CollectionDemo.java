/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iksri01
 */
public class CollectionDemo {
    public static void main(String... args)
    {
        //List list = new ArrayList();
        List<String> list = new ArrayList();
        list.add("Sridhar");
        list.add("Shri");
     
        // TypeCasting Not required if generics is used. 
//        String name = (String)list.get(0);
//        int age = (int)list.get(1);
        
        String name = list.get(0);
        String age = list.get(1);

        
    }
    
}
