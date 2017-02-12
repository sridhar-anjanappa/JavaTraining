/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

/**
 *
 * @author iksri01
 */
public class Greeting implements IGreetable{

    @Override
    public void greet(String name) {
           System.out.println("Good Morning " + name + "!");  
    }
    
}
