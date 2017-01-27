/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining;

import inheritance.*;

/**
 *
 * @author iksri01
 */
public class InterfaceDemo {
    
    public static void main(String args[])
    {
        EngineeringManager employee = new EngineeringManager("Sridhar");
        employee.calculateSalary();
        employee.showSalary();
    }
}
