package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

// ??? ITS A STACK, QUEUE, AND DEQUE?? FIFO STRUCTURE, BUT CAN DD FROM BOTH SIDES??
public class ArrayDequeTest {

    @Test
    public void arrayDequeTest() {
        Deque<Integer> integerArrayDequeTest = new ArrayDeque<Integer>(10);

        integerArrayDequeTest.add(100);
        integerArrayDequeTest.add(200);
        integerArrayDequeTest.add(300);
        System.out.println(integerArrayDequeTest);
        Integer expected = 3;
        Integer actual = integerArrayDequeTest.size();
        Assert.assertEquals(expected, actual);

        integerArrayDequeTest.addFirst(400);
        integerArrayDequeTest.addLast(500);
        System.out.println(integerArrayDequeTest);

        boolean actualBoolean = integerArrayDequeTest.contains(500);
        Assert.assertEquals(true, actualBoolean);
    }
}
