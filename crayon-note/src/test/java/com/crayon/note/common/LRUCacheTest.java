package com.crayon.note.common;

import org.junit.Test;

import java.util.Map;

public class LRUCacheTest {
    @Test
    public void test() {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put("11", "11");
        lruCache.put("22", "22");
        lruCache.put("33", "33");
        lruCache.put("11", "11");
        lruCache.put("44", "44");
        lruCache.put("55", "55");
        lruCache.put("11", "11");
        lruCache.put("66", "66");
        lruCache.put("77", "77");
        lruCache.put("11", "11");
        lruCache.put("88", "88");
        for (Map.Entry<String, String> stringStringEntry : lruCache.entrySet()) {
            System.out.println("key:" + stringStringEntry.getKey() + ",value:" + stringStringEntry.getValue());
        }
    }
}
