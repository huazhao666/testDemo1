package Exam;


import java.util.*;

public class Main {
    //1.合并排序;
    public int[] sort(int[] a,int[] b) {
        int[] array = new int[a.length + b.length];
        int index = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]){
                array[index] = a[i];
                index++;
                i++;
            }else {
                array[index] = b[j];
                index++;
                j++;
            }
        }
        while (i < a.length){
            array[index] = a[i];
            index++;
            i++;
        }
        while (j < b.length){
            array[index] = b[j];
            index++;
            j++;
        }
        return array;
    }
    //单词个数：
    public void WordCount(String str){
        String[] s = str.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (String s1 : s) {
            if(s1 != null){
                map.put(s1,map.getOrDefault(s1,0)+1);
            }
        }
        for(String s1: map.keySet()){
            System.out.println(s1 + " " + map.get(s1));
        }
    }

}
//第三题
class LRUCache {
    int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();
    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        // 将 key 变为最近使用
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key, int val) {
        if (cache.containsKey(key)) {
            // 修改 key 的值
            cache.put(key, val);
            // 将 key 变为最近使用
            makeRecently(key);
            return;
        }

        if (cache.size() >= this.cap) {
            // 链表头部就是最久未使用的 key
            int oldestKey = cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        // 将新的 key 添加链表尾部
        cache.put(key, val);
    }

    private void makeRecently(int key) {
        int val = cache.get(key);
        // 删除 key，重新插入到队尾
        cache.remove(key);
        cache.put(key, val);
    }
}

//4.线程安全的单例
class Singleton {
    private volatile Singleton instance = null;
    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

