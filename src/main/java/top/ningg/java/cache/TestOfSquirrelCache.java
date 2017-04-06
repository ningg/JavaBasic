package top.ningg.java.cache;

import javax.annotation.Resource;

import com.dianping.squirrel.client.StoreKey;
import com.dianping.squirrel.client.impl.redis.RedisStoreClient;

/**
 * Created by guoning on 17/1/10.
 */
public class TestOfSquirrelCache {

    @Resource(name = "redisClient")
    private RedisStoreClient storeClient;

    public String getValue(String key) {
        StoreKey storeKey = new StoreKey("myredis", key);
        return storeClient.get(storeKey);
    }



}
