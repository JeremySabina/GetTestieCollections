package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class HashSetTest {

    @Test       //	Used to add the specified element if it is not present, if it is present then return false.
    public void testHashSetAdd0() {
        HashSet<String> hashString = new HashSet<>();

        Boolean  actual = hashString.add("Bob's Burgers");

        Assert.assertEquals(true, actual);

        System.out.println(hashString);
    }
// Why couldn't I compare the strings to see if true or not?

    @Test
    public void testHashSetAdd1() {
        HashSet<Integer> hashString = new HashSet<>();

        hashString.add(1);
        hashString.add(11);
        hashString.add(21);
        hashString.add(31);

        assertEquals(false, hashString.isEmpty());


        System.out.println(hashString);
    }


    @Test        // Used to remove all the elements from set.
    public void testHashSetClear0() {
        HashSet<Integer> hashString = new HashSet<>();

        hashString.add(1);
        hashString.add(11);
        hashString.add(21);
        hashString.add(31);

        hashString.clear();

        assertEquals(true, hashString.isEmpty());
    }

    @Test       // HashSet<String> hashString = new HashSet<>();
    public void testHashSetClear1() {
        HashSet<Integer> hashString = new HashSet<>();

        hashString.add(114);
        hashString.add(12);
        hashString.add(21112);
        hashString.add(34361);

        hashString.clear();

        assertEquals(true, hashString.isEmpty());
    }

    @Test        // Used to remove all the elements from set.
    public void testHashSetRemove0() {
        HashSet<Integer> hashString = new HashSet<>();

        hashString.add(12);

        hashString.remove(12);

        assertEquals(true, hashString.isEmpty());
    }

    @Test       // HashSet<String> hashString = new HashSet<>();
    public void testHashSetRemove1() {
        HashSet<String> hashString = new HashSet<>();

        hashString.add("Biscuits");
        hashString.add("Elbow Grease");
        hashString.add("No Tears");
        hashString.add("All Tenacity");

        hashString.remove("No Tears");

        assertEquals(false, hashString.contains("No Tears"));

    }

}
