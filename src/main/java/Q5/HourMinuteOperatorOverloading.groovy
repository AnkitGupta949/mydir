package Q5;

import java.util.Calendar;
import java.util.Date;

public class HourMinuteOperatorOverloading {

   private int hours;
   private int minutes;

    HourMinuteOperatorOverloading() {
        Calendar calendar = Calendar.getInstance();
        hours = calendar.getTime().getHours();
        minutes = calendar.getTime().getMinutes();


    }

        void increment(){
        hours++;
        minutes++;
        }

    public static void main(String[] args) {

        HourMinuteOperatorOverloading hourMinuteOperatorOverloading=new HourMinuteOperatorOverloading();

        hourMinuteOperatorOverloading.increment();

        printf "${hourMinuteOperatorOverloading.hours}  ${hourMinuteOperatorOverloading.minutes}";



    }

}


