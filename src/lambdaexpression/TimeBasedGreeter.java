/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

import java.time.LocalTime;

/**
 *
 * @author iksri01
 */
public class TimeBasedGreeter implements TimeBasedMessage {

    @Override
    public String GetMessageByTime() {

        String message = "Good ";

        class MessageCreator {

            public String getMessage() {
                int hour = LocalTime.now().getHour();
                if (hour >= 0 && hour < 12) {
                    return "Morning";
                } else if (hour >= 12 && hour < 16) {
                    return "After Noon";
                } else if (hour >= 16 && hour < 19) {
                    return "Evening";
                } else {
                    return "Night";
                }
            }

        }
        MessageCreator creator = new MessageCreator();
        message = message + creator.getMessage();
        return message;
    }
}