package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    @Test
    public void iteratorTest0() {

        int x = 100;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);


        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        Iterator<Integer> iteratorTest = integerArrayList.iterator();

        Integer actual = 0;

        while(iteratorTest.hasNext()){
               actual += iteratorTest.next();
        }
         Integer expected = 15;

        Assert. assertEquals(expected, actual);

    }
}
