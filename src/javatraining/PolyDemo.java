/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatraining;

import polymorphism.Shape;
import polymorphism.Triangle;
import polymorphism.Circle;
import polymorphism.Rectangle;

/**
 *
 * @author iksri01
 */
public class PolyDemo {

    /**
     * Polymorphism
     */
    public static void main(String[] args) {
      // Polymorphism at work #1: a Rectangle, Triangle and Circle
            // can all be used whereever a Shape is expected. No cast is
            // required because an implicit conversion exists from a derived 
            // class to its base class.
            java.util.List<Shape> shapes = new java.util.ArrayList<Shape>();
            shapes.add(new Rectangle());
            shapes.add(new Triangle());
            shapes.add(new Circle());

            // Polymorphism at work #2: the virtual method Draw is
            // invoked on each of the derived classes, not the base class.
            for (Shape s:shapes)
            {
                s.Draw();
            }
    }
    
}
