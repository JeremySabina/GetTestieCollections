package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class TreeMapTest {
    @Test
    public void treeMapTest() {
        TreeMap<Integer, String> treeMapTest = new TreeMap<>();

        treeMapTest.put(1, "tacos");
        treeMapTest.put(2, "meringue");
        treeMapTest.put(3, "chantilly");
        treeMapTest.put(4, "chiboust");
        treeMapTest.put(5, "eclairs");

        System.out.println(treeMapTest.containsValue("tacos"));
        System.out.println(treeMapTest);
        Integer actual = treeMapTest.size();

        Integer expectedSize = 5;
        Assert.assertEquals(expectedSize, actual);

        treeMapTest.remove(4);
        Assert.assertEquals(4, treeMapTest.size());
        System.out.println(treeMapTest);

        treeMapTest.clear();
        Assert.assertEquals(true, treeMapTest.isEmpty());
    }
}
