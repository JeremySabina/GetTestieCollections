package rocks.zipcode;


import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

// DOESNT PERMIT NULL!
public class PriorityQueueTest {

    @Test
    public void priorityQueueTest() {
        PriorityQueue<String> priorityQueueTest = new PriorityQueue<>();

        priorityQueueTest.add("Chocolate");
        priorityQueueTest.add("Neapolitan");
        priorityQueueTest.add("Strawberry");
        priorityQueueTest.add("Vanilla");
        System.out.println(priorityQueueTest);

        Integer expectedInteger = 4;
        Integer actualInteger = priorityQueueTest.size();
        Assert.assertEquals(expectedInteger, actualInteger);

        priorityQueueTest.remove();
        String actual = priorityQueueTest.peek();
        Assert.assertEquals("Neapolitan",actual );

        priorityQueueTest.clear();
        Assert.assertEquals(true, priorityQueueTest.isEmpty());
    }
}
