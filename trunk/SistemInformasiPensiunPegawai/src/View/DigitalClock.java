/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author a9uszT
 */
import javax.swing.JFrame;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {

    private JLabel lTime = new JLabel();

    public DigitalClock() {
        super("Digital Clock");
        setLocation(200, 300);
        setSize(200, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(lTime);
        showDigitalClock();
        setVisible(true);
    }

    public void showDigitalClock() {
        TimerTask tt = new TimerTask() {

            @Override
            public void run() {
                lTime.setText(getStringTime());
            }
        };
        Timer t = new Timer();
        t.schedule(tt, 0, 100);
    }

    public static String getStringTime() {
        return getCurrHour() + ":" + getCurrMinute() + ":" + getCurrSecond();
    }

    public static int getCurrHour() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public static int getCurrMinute() {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }

    public static int getCurrSecond() {
        return Calendar.getInstance().get(Calendar.SECOND);
    }

    public static void main(String[] args) {
        new DigitalClock();
    }
}
