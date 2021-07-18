package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetClass {
    @Test
    public void treeSetTest() {
        TreeSet<String> testTreeSet = new TreeSet<>();

        testTreeSet.add("Pork");
        testTreeSet.add("Beef");
        testTreeSet.add("Chicken");
        testTreeSet.add("Lamb");
        testTreeSet.add("Salmon");
        testTreeSet.add("Halibut");
        testTreeSet.add("Squab");
        System.out.println(testTreeSet);

        testTreeSet.remove("Pork");
        testTreeSet.remove("Squab");
        System.out.println(testTreeSet);

        testTreeSet.pollFirst();
        testTreeSet.pollLast();
        Integer expected = 3;
        System.out.println(testTreeSet);

        Integer actual = testTreeSet.size();
        Assert.assertEquals(expected,actual);


        String expectedString = "Lamb";
        String actualString = testTreeSet.last();
        Assert.assertEquals(expectedString, actualString);


    }
}
