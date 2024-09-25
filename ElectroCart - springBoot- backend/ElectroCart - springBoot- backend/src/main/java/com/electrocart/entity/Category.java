package com.electrocart.entity;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    SMARTPHONES(0),
    WATCHES(1),
    HOMEAPPLIANCES(2),
    FASHIONANDCLOTHINGS(3),
    STATIONERIES(4),
    GROCERIES(5);

    private int value;
    private static Map map = new HashMap<>();

    private Category(int value) {
        this.value = value;
    }

    static {
        for (Category category : Category.values()) {
            map.put(category.value, category);
        }
    }

    public static Category valueOf(int category) {
        return (Category) map.get(category);
    }

    public int getValue() {
        return value;
    }
}
