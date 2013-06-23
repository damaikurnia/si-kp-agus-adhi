/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 *
 * @author a9uszT
 */
public class Clock {

    public final void showDigitalClock(final JLabel time) {
        TimerTask tt = new TimerTask() {

            @Override
            public void run() {
                time.setText(getStringTime());
            }
        };
        Timer t = new Timer();
        t.schedule(tt, 0, 100);
    }

    public static String getStringTime() {
        return getDate() + "-" + (getMonth() + 1) + "-" + getYear() + " " + getCurrHour() + ":" + getCurrMinute() + ":" + getCurrSecond();
    }

    public static int getCurrHour() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public static int getDate() {
        return Calendar.getInstance().get(Calendar.DATE);
    }

    public static int getMonth() {
        return Calendar.getInstance().get(Calendar.MONTH);
    }

    public static int getYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static int getCurrMinute() {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }

    public static int getCurrSecond() {
        return Calendar.getInstance().get(Calendar.SECOND);
    }
}
