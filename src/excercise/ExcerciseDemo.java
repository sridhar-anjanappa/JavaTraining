/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise;

/**
 *
 * @author iksri01
 */
public class ExcerciseDemo {

    public static void main(String... args) {
        Greeter greet = new Greeter();
        greet.GetMessageByTime(5);

        GreetByTime agreet = new GreetByTime() {
            public void GetMessageByTime(int time) {
                if (time >= 11 && time < 16) {
                    System.out.println("Good Afternoon");
                }
            }
        };

        agreet.GetMessageByTime(14);

        GreetByTime lgreet = (time) -> {
            if (time >= 16 && time < 19) {
                System.out.println("Good Evening");
            }
        };
        lgreet.GetMessageByTime(17);
    }
}
