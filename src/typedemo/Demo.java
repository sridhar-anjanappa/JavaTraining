/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typedemo;

/**
 *
 * @author iksri01
 */
public class Demo {
    public static void main(String... args)
    {
        float x = 10.4578f;
        int num = (int)x;
        System.out.println(num);
        
        Base b = new Base();
        Derived d = new Derived();
        d = (Derived)b;
    }
}
