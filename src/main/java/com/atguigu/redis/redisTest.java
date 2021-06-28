package com.atguigu.redis;

import redis.clients.jedis.Jedis;

public class redisTest {
    public static void main(String[] args) {
        // TODO: 1.获取redis连接
        Jedis jedis = new Jedis("hadoop102", 6379);

        //a.测试ping操作
        System.out.println(jedis.ping());

        //b.测试往String里面写数据
        jedis.set("bigdata0108","very good");

        //c.读取String的数据
        System.out.println(jedis.get("bigdata0108"));

        //d.设置过期时间
        jedis.expire("shuihu",5);

        //e.测试往set存数据
        jedis.sadd("0108","banzhang","qianzong ");
        System.out.println(jedis.smembers("0108"));

        // TODO: 关闭连接
        jedis.close();
    }
}
