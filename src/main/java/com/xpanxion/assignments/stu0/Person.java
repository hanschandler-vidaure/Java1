package com.xpanxion.assignments.stu0;

public class Person {
    int id;
    String first, last;
    public Person(int id, String first, String last)
    {
        this.id = id;
        this.first = first;
        this.last = last;
    }
    public int getId()
    {
        return id;
    }
    public String getFirstName()
    {
        return first;
    }
    public String getLastName()
    {
        return last;
    }
    public void setLastName(String lastname)
    {
        last = lastname;
    }
    public String toString()
    {
        return "Person{id=" + getId() + ", firstName='" + getFirstName() + "', lastName='" + getLastName() + "'}";
    }

    public int compareTo(Person y) {
        return this.getFirstName().compareTo(y.getFirstName());
    }
}
