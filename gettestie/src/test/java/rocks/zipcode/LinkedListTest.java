package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkedListTest {

    @Test
        public void linkedListTest(){

        LinkedList<String> linkedListTest = new LinkedList<>();

        // Adding elements to the linked list
        linkedListTest.add("Coffee");
        linkedListTest.add("Donuts");
        System.out.println(linkedListTest);

        linkedListTest.addLast("Bagels");
        System.out.println(linkedListTest);

        linkedListTest.addFirst("Milk");
        System.out.println(linkedListTest);

        linkedListTest.addLast("Muffin");
        System.out.println(linkedListTest);


        linkedListTest.remove("Coffee");
        linkedListTest.set(1, "Cream");
        System.out.println(linkedListTest);

        linkedListTest.removeFirst();
        linkedListTest.removeLast();
        System.out.println(linkedListTest);

        linkedListTest.clear();
        Assert.assertEquals(true, linkedListTest.isEmpty());
    }
}
