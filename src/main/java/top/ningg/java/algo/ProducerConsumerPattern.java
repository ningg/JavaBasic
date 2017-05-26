package top.ningg.java.algo;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 题目：实现生产者-消费者模式
 *
 * 分析：
 * 1. 依赖「阻塞队列」实现
 */
public class ProducerConsumerPattern {

    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

        Thread threadA = new Thread(new Producer(blockingQueue));
        Thread threadB = new Thread(new Consumer(blockingQueue));

        // 启动线程
        threadA.start();
        threadB.start();

        // 执行时长
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 线程终止
        threadA.interrupt();
        // 执行时长
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.interrupt();

        // 执行时长
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 生产者
    static class Producer implements Runnable {

        private BlockingQueue<Integer> sharedQueue;

        public Producer(BlockingQueue<Integer> queue) {
            this.sharedQueue = queue;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    int value = new Random().nextInt(100);
                    System.out.println(String.format("生产者，生产的值：%d", value));
                    // 等待有存储空间
                    sharedQueue.put(value);
                }
            } catch (InterruptedException e) {
                System.out.println("生产者线程终止");
            }
        }
    }

    // 消费者
    static class Consumer implements Runnable {

        private BlockingQueue<Integer> sharedQueue;

        public Consumer(BlockingQueue<Integer> queue) {
            this.sharedQueue = queue;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    System.out.println(String.format("消费者，读取到取值：%d", sharedQueue.take()));
                }
            } catch (InterruptedException e) {
                System.out.println("消费者线程终止");
            }
        }
    }
}
