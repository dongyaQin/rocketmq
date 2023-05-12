package org.apache.rocketmq.example.simple;

import java.util.concurrent.LinkedBlockingQueue;

public class SingleTone {
    private static final SingleTone instance = new SingleTone();
    private SingleTone() {}

    public static SingleTone getInstance() {
        return instance;
    }
}
