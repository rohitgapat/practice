package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableExample implements Comparable<ComparableExample> {
    int id;
    String name;

    ComparableExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int compareTo(ComparableExample s) {
        return this.id - s.id;
    }
    public String toString() {
        return id + " - " + name;
    }
    public static void main(String[] args) {
        List<ComparableExample> list = new ArrayList<>();
        list.add(new ComparableExample(3, "Ravi"));
        list.add(new ComparableExample(1, "Amit"));
        list.add(new ComparableExample(2, "Rohit"));

        Collections.sort(list);  
        System.out.println(list);
    }
}