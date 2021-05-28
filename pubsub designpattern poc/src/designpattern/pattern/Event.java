package designpattern.pattern;

import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;

public class Event {
    static {
        init();
    }

    public static Operation operation;

    // Using ConcurrentHashMap for thread safe HashMap (and faster then HashTable)
    static ConcurrentHashMap<String, ConcurrentHashMap<Integer, Object>> channels;

    static void init() {
        channels = new ConcurrentHashMap<>();
        operation = new Operation();
    }
}