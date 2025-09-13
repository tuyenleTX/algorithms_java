package linkedinpractise.linkedlist;

import java.util.LinkedList;

public class LinkedListPractise {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Beckly");
        linkedList.add("Brenda");
        linkedList.add("Kay");
        linkedList.add("Milania");
        linkedList.add("Karen");
        linkedList.add("Kathy");
        System.out.println(linkedList.contains("Milania"));
        System.out.println(linkedList.size());
        linkedList.removeFirst();
        linkedList.forEach(x -> System.out.print(x + "->"));
    }
}
