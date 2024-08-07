package com.itheima;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author
 * @version 1.0
 * @date 2024/07/30 16:26
 * @description
 */
public class TimerTaskApp {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer task run......");
            }
        };
        timer.schedule(task, 0, 2000);
    }
}
