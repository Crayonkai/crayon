package com.crayon.note.common;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<String, String> {
    private int capacity;

    public LRUCache(int capacity) {
        /*
         * 当accessOrder为false时（默认情况），
         * linkedHashMap只会按插入顺序维护双向链表。
         * 而开启了accessOrder之后，
         * linkedHashMap就会把每一次对结点的访问也作为标准来进行排序。
         * 也就是说，在每次插入结点/访问结点的时候，
         * 都会将相应结点移动到双向链表的尾部，
         * 从而达到按访问顺序进行排序的目的。
         * 所以这里需将accessOrder参数开启为true。
         * */
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public String get(String key) {
        // 若key存在,返回对应value值;若key不存在,返回"没这个值"
        return super.getOrDefault("没这个值", key);
    }

    public String put(String key, String value) {
        super.put(key, value);
        return value;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
        //若返回的结果为true，则执行removeEntryForKey方法删除eldest entry
        return size() > capacity;
    }
}
