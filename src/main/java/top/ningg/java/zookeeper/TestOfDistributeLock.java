package top.ningg.java.zookeeper;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.locks.InterProcessMutex;

/**
 * Created by guoning on 2019/2/26.
 */
public class TestOfDistributeLock {

    public static void main(String[] args) {
        CuratorFramework client = null;
        String lockPath = null;

        // 创建「可重入锁」(写锁)
        InterProcessMutex lock = new InterProcessMutex(client, lockPath);

        try {
            // a. 获取锁
            lock.acquire();

            // b. 获取锁成功, 进行业务处理
            // ...

        } catch (Exception e) {

            // c. 获取锁,失败
            // 处理

        } finally {
            // d. 释放锁
            try {
                lock.release();
            } catch (Exception e) {

                // e. 释放锁, 失败
                e.printStackTrace();
            }
        }
    }

}
