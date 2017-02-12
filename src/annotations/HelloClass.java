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
public class HelloClass extends HelloBase implements Hello {

    @Override
    public void sayHello(String name) {
        System.out.println(String.format("%s is saying Hello in HelloClass!", name));
    }

}
