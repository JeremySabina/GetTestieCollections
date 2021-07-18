package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Vector;

public class VectorMapTest {
    @Test
    public void vectorMapTest() {
        Integer x = 10;
        Vector<Integer> vectorMapTest = new Vector<>(x);

        vectorMapTest.add(5);
        System.out.println(vectorMapTest);

        Integer expectedInteger = 5;
        Integer actualInteger = vectorMapTest.elementAt(0);
        Assert.assertEquals(expectedInteger,actualInteger);

        vectorMapTest.remove(0);
        System.out.println(vectorMapTest);

        Assert.assertEquals(true, vectorMapTest.isEmpty());

        vectorMapTest.add(0, 100);
        vectorMapTest.get(0);
        System.out.println(vectorMapTest);




    }
}
