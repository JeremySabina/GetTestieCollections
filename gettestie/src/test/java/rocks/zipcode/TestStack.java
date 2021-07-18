package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStackPush() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    public void TestStackPush1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(218497);
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void testStackPop0() {
        Stack<Integer> numberStack = new Stack<>();
        numberStack.push(1);
        numberStack.pop();
        assertEquals(true, numberStack.isEmpty());
    }

    @Test
    public void testStackPop1() {
        Stack <String> stringStack = new Stack<>();
        stringStack.push ("Hello");
        stringStack.push ("World");
        stringStack.pop();
        assertEquals(false, stringStack.isEmpty());
    }

    @Test
    public void testStackPeek0() {
        Stack <String> stringStack = new Stack<>();
        stringStack.push ("Hello");
        stringStack.push ("World");
        stringStack.peek();
        Assert.assertTrue("World", true);
    }

    @Test
    public void testStackPeek1() {
        Stack <Integer> integerStack = new Stack<>();
        integerStack.push (100);
        integerStack.push (50);

        Integer expected = 50;
        Integer actual = integerStack.peek();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testStackIsEmpty() {
        Stack <Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(100);
        integerStack.pop();
        integerStack.pop();


        Assert.assertEquals(true, integerStack.isEmpty());
    }


    // Make a bigger test exercising more Stack methods.....
}
