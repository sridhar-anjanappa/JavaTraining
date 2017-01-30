/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasses;

/**
 *
 * @author iksri01
 */
public class ShadowDemo {
    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowDemo.this.x = " + ShadowDemo.this.x);
        }
    }

    public static void main(String... args) {
        ShadowDemo st = new ShadowDemo();
        ShadowDemo.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
