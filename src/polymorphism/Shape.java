/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author iksri01
 */
public class Shape {
     // A few example members
        public int X;
        public int Y;
        public int Height;
        public int Width;
       
        // Virtual method
        public void Draw()
        {
            System.out.println("Performing base class drawing tasks");
        }
}
