package top.ningg.java.algo;

/**
 * 题目：
 * 1. 定义一个 Task；
 * 2. 使用 3 个线程启动，每个传入1，2，3；
 * 3. 线程 1，只能输出 1；
 * 4. 线程 2，只能输出 2；
 * 5. 线程 3，只能输出 3；
 * 6. 3 个线程，交替输出 1，2，3， 共计 5 次；
 *
 * 分析：
 * 1. 一个 Task
 * 2. 线程之间有序
 * 3. 使用一把锁，同时，由锁来标识当前输出哪个数即可。
 *
 */
public class ThreeThread {

    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(new Task(1));
        Thread threadB = new Thread(new Task(2));
        Thread threadC = new Thread(new Task(3));

        threadA.start();
        Thread.currentThread().sleep(100);
        threadB.start();
        threadC.start();
    }

    public static class Task implements Runnable {

        // 控制次数
        private static volatile int TIMES = 5;
        // 共享锁
        private static volatile Integer SYNC_LOCK = 1;

        private int value;

        public Task(int value) {
            this.value = value;
        }

        @Override
        public void run() {
            while (true) {
                // 终止条件
                if (TIMES <= 0) {
                    break;
                }

                synchronized (SYNC_LOCK) {
                    switch (this.value) {
                    case 1:
                        if (SYNC_LOCK == 1) {
                            System.out.println(this.value);
                            SYNC_LOCK = 2;
                        }
                        break;
                    case 2:
                        if (SYNC_LOCK == 2) {
                            System.out.println(this.value);
                            SYNC_LOCK = 3;
                        }
                        break;
                    case 3:
                        if (SYNC_LOCK == 3) {
                            System.out.println(this.value);
                            SYNC_LOCK = 1;
                            TIMES--;
                        }
                        break;
                    default:
                        break;
                    }
                }
            }
        }
    }
}
