package com.xpanxion.assignments.stu0;

import java.util.HashMap;

public class Repository implements DataAccess{

    private final HashMap<Integer, Person> personHashMap;
    public Repository() {
        personHashMap = new HashMap<Integer, Person>();
        personHashMap.put(1, new Person(1, "Alice", "Jones"));
        personHashMap.put(2, new Person(2, "Bob", "Smith"));
        personHashMap.put(3, new Person(3, "Charlie", "Brown"));
    }

    @Override
    public Person getPerson() {
        return personHashMap.get(1);
    }
}
