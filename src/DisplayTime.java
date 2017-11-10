
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class DisplayTime {

    JLabel timeNow;

    public DisplayTime(JLabel label) {
        timeNow = label;
        Timer timer = new Timer(true);
        timer.schedule(new TimerLabelTask(), 0, 1);
    }

    public void setTime() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年 M月 d日 (E) HH時 mm分 ss.SSS秒");
        timeNow.setText(simpleDateFormat.format(gregorianCalendar.getTime()));
    }

    class TimerLabelTask extends TimerTask {
        public void run() {
            setTime();
        }
    }
}
