https://leetcode.com/problems/design-hashmap/description/

import java.util.LinkedList;
import java.util.List;

class MyHashMap {

    private final int SIZE = 1000;
    private List<Pair>[] map;

    public MyHashMap() {
        map = new LinkedList[SIZE];
    }

    //@SuppressWarnings("unchecked") List<Pair>[] map = (List<Pair>[]) new LinkedList[SIZE];

    public void put(int key, int value) {
        int index = Math.abs(key % SIZE);
        if (map[index] == null) {
            map[index] = new LinkedList<>();
        }
        for (Pair pair : map[index]) {
            if (pair.key == key) {
                pair.value = value; // update existing key
                return;
            }
        }
        map[index].add(new Pair(key, value)); // add new key
    }

    public int get(int key) {
        int index = key % SIZE;
        if (map[index] == null) return -1;
        for (Pair pair : map[index]) {
            if (pair.key == key) return pair.value;
        }
        return -1; // not found
    }

    public void remove(int key) {
        int index = key % SIZE;
        if (map[index] == null) return;
        map[index].removeIf(pair -> pair.key == key);
    }

    // helper class to store key-value pairs
    private static class Pair {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
