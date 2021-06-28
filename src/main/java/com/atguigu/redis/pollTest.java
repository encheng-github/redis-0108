package com.atguigu.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class pollTest {
    public static void main(String[] args) {
        // TODO: 1.创建连接池
        JedisPool jedisPool = new JedisPool("hadoop102", 6379);

        // TODO: 2.从连接池获取连接
        Jedis jedis = jedisPool.getResource();

        System.out.println(jedis.smembers("0108"));

        // TODO: 使用连接池时要关闭连接池,这样可以自动将连接归还
        jedisPool.close();
    }
}
