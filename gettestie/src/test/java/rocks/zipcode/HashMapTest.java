package rocks.zipcode;

import org.junit.Assert;

import java.util.HashMap;

public class HashMapTest {

    public static void main(String args[]) {
        HashMap<String, String> hashMapTest = new HashMap<>();

        // Adding values to HashMap as ("keys", "values")
        hashMapTest.put("Drink", "Coffee");
        hashMapTest.put("Food", "Chicken");
        hashMapTest.put("Sandwich", "Burger");
        hashMapTest.put("Snack", "Chips");
        System.out.println(hashMapTest);

        hashMapTest.clear();

        hashMapTest.put("Drink", "Coffee");
        hashMapTest.put("Food", "Chicken");
        hashMapTest.put("Sandwich", "Burger");
        hashMapTest.put("Snack", "Chips");

        System.out.println(hashMapTest.get("Snack"));
        System.out.println(hashMapTest.get("Food"));
        System.out.println(hashMapTest.size());
        hashMapTest.clear();

        Assert.assertEquals(true, hashMapTest.isEmpty());
    }
}
