package com.chang.web.controller.demo;

import com.chang.common.enums.DataSourceTypeEnum;

import java.util.concurrent.*;

/**
 * Created by SunChang on 2019/7/31
 */
public class testThread {

    private static int produceTaskMaxNumber = 8;

    public static void main(String[] args) {
        //最后一个参数是拒绝策略，CallerRunsPolicy,AbortPolicy,DiscardPolicy,DiscardOldestPolicy，资料：https://blog.csdn.net/qq_25806863/article/details/71172823
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(1, 2, 0, TimeUnit.SECONDS, new LinkedBlockingQueue<>(2), new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i = 1; i <= produceTaskMaxNumber; i++) {
            System.out.println("添加第"+i+"个任务");
            threadPool.execute(new ThreadPoolTask("线程" + i));
            for (Runnable runnable : threadPool.getQueue()) {
                ThreadPoolTask thread = (ThreadPoolTask) runnable;
                System.out.println("列表：" + thread.name);
            }
        }
        threadPool.shutdown();
        //System.out.println("isShutdown:" + threadPool.isShutdown());
        //System.out.println("isTerminated:" + threadPool.isTerminated());
        try {
            while (!threadPool.awaitTermination(2, TimeUnit.SECONDS)) {
                //System.out.println(threadPool.getActiveCount());
                //System.out.println("线程池没有关闭");
                //System.out.println("isTerminated:" + threadPool.isTerminated());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程池已经关闭");
        //System.out.println("isTerminated:" + threadPool.isTerminated());
    }
}

class ThreadPoolTask implements Runnable {

    String name;

    public ThreadPoolTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("线程:"+Thread.currentThread().getName() +" 执行:"+name +" run");
    }

    public static void main(String[] args) {
        System.out.println(DataSourceTypeEnum.MASTER.name());
    }
}