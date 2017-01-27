/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author iksri01
 */
public class EngineeringManager extends Employee implements SoftwareEngineer, Manager {

    public EngineeringManager(String name)
    {
        super(name);        
    }
    
    @Override
    public void calculateSalary() {
        super.salary = SoftwareEngineer.salary + Manager.salary;
    }
    
    public void showSalary()
    {
        System.out.println("Salary of " + super.name + " is Rs." + super.salary );
    }
}
