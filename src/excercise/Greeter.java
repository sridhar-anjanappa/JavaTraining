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
public class Greeter implements GreetByTime {

    @Override
    public void GetMessageByTime(int time) {
        
       class GreetChecker
       {
           int time;
           public GreetChecker(int time)
           {
               this.time = time;
           }
           
           public String GetGreetMessage()
           {
               if(time >= 4 && time < 11)
               {
                   return "Good Morning";
               }
               return "";
           }           
       }
       
       GreetChecker c = new GreetChecker(time);
       System.out.println(c.GetGreetMessage());
    }    
}
