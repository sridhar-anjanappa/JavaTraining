/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.IsoChronology;
import java.time.temporal.TemporalField;

/**
 *
 * @author iksri01
 */
public class GreetDemo {
    
    public static void GreetByTime(String name)
    {
        String message = "Good ";
        
        class MessageCreator 
        {
            public String getMessage()
            {
                int hour = LocalTime.now().getHour();
                if(hour >= 0 && hour < 12)
                {
                    return "Morning";
                }
                else if(hour >= 12 && hour < 16)
                {
                    return "After Noon";                   
                }
                else if(hour >= 16 && hour < 19)
                {
                    return "Evening";                   
                }
                else 
                {
                    return "Night";                   
                }  
            }
           
        }
        
        MessageCreator creator = new MessageCreator();
        message = message + creator.getMessage() + " " + name + "!";
        System.out.println(message);
    }
    
    public static void main(String... args)
    {
        IGreetable me = new Greeting();
        me.greet("Hello Sridhar");        
        GreetByTime("Sridhar");

        TimeBasedMessage message = new TimeBasedGreeter();
        me.greet(message.GetMessageByTime());
        
        TimeBasedMessage anonymessage = new TimeBasedMessage(){
            public String GetMessageByTime()
            {
                int hour = LocalTime.now().getHour();
                if (hour >= 0 && hour < 12) {
                    return "Good Morning";
                } else if (hour >= 12 && hour < 16) {
                    return "Good After Noon";
                } else if (hour >= 16 && hour < 19) {
                    return "Good Evening";
                } else {
                    return "Good Night";
                }
            }
        };   
        System.out.println(anonymessage.GetMessageByTime() + " Anonymous!");
        
        TimeBasedMessage timemessage = ()->{
                int hour = LocalTime.now().getHour();
                if (hour >= 0 && hour < 12) {
                    return "Good Morning";
                } else if (hour >= 12 && hour < 16) {
                    return "Good After Noon";
                } else if (hour >= 16 && hour < 19) {
                    return "Good Evening";
                } else {
                    return "Good Night";
                }
        };   
        System.out.println(timemessage.GetMessageByTime() + " Sridhar!");
    }
}
