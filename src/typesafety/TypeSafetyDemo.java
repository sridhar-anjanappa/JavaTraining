/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typesafety;

/**
 *
 * @author iksri01
 */
public class TypeSafetyDemo {

    public static void main(String... args) {
        Base b = new Base();
        Derived d = new Derived();
        d = (Derived)b;
    }
}
