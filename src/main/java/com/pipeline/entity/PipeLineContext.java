package com.pipeline.entity;

import java.util.HashMap;
import java.util.Map;

public class PipeLineContext {

    private Map<String, Object> context = new HashMap<>();

    public void put(String key, Object param) {
        context.put(key, param);
    }

    public Object get(String key) {
        return context.get(key);
    }
}
