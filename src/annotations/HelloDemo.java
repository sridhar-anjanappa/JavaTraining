/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotations;

/**
 *
 * @author iksri01
 */
public class HelloDemo {
    public static void main(String... args)
    {
        HelloBase hello = new HelloClass();
        hello.sayHello("Vishal");
        
        float x;
        int y;
        long l;
        double d;
        
        y = 10;
        l = 20;
        x = 2.5f;
        d = 100.34;
    }
}
