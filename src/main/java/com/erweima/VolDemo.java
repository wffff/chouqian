package com.erweima;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Danny on 2018/2/28.
 */

public class VolDemo {
    private static int counter;
    public static synchronized void incNum() {
        counter++;
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i = 0; i < 100000; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    VolDemo.incNum();
                }   });
        } executor.shutdown();
        try {
            if (!executor.awaitTermination(1000, TimeUnit.MILLISECONDS)) {
                System.out.println("some task are not terminated");
            } else {
                System.out.println("result:" + counter);   }
        } catch (InterruptedException e) {   // TODO Auto-generated catch block   e.printStackTrace();  } }}
        }
    }

}

