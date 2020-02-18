package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("sedelnik0v@yandex.ru", "Sedelnikov Vladimir Vladimirovich");
        for (String key : map.keySet()) {
            System.out.println("email : " + key + " full name : " + map.get(key));
        }
    }
}
