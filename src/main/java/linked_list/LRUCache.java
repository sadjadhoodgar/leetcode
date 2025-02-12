package linked_list;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode Problem #146: LRU cache.
 * Link: <a href="https://leetcode.com/problems/lru-cache/">...</a>
 */
public class LRUCache {
    int freeCapacity;
    int lowest = 0;
    Map<Integer, Integer> cache = new HashMap<>();

    public LRUCache(int capacity) {
        freeCapacity = capacity;
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if (freeCapacity > 0) {
            freeCapacity--;
        }

        if (value < cache.get(lowest)) {
            lowest = key;
        }


        cache.put(key, value);
    }
}
