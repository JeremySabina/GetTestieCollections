package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayListTest {

    @Test
    public void arrayListTestAdd0() {
        int x = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);
        integerArrayList.add(4);


        boolean actual = integerArrayList.contains(230);

        Assert.assertEquals(true, actual);
        System.out.println(integerArrayList);
    }

    @Test
    public void arrayListAddTest1() {
        int x = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);
        integerArrayList.add(4);

        boolean actual = integerArrayList.contains(329493);

        Assert.assertEquals(false, actual);
        System.out.println(integerArrayList);
    }

    @Test
    public void arrayListSetTest0() {
        int x = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);

        integerArrayList.set(1, 300);

        Integer expected = 300;
        Integer actual = integerArrayList.get(1);

        Assert. assertEquals(expected, actual);
        System.out.println(integerArrayList);
    }

    @Test
    public void arrayListSetTest1() {
        int x = 100;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);

        integerArrayList.set(2, 300);

        Integer expected = 300;
        Integer actual = integerArrayList.get(2);

        Assert. assertEquals(expected, actual);
        System.out.println(integerArrayList);
    }

    @Test
    public void arrayListRemoveTest0() {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("This");
        stringArrayList.add("Code");
        stringArrayList.add("is");
        stringArrayList.add("Delicious");

        stringArrayList.set(3, "Freaking");
        System.out.println(stringArrayList);

        stringArrayList.remove("Freaking");

        boolean actual = stringArrayList.contains("Freaking");

        Assert. assertEquals(false, actual);
        System.out.println(stringArrayList);
    }

    @Test
    public void arrayListRemoveTest1() {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("This");
        stringArrayList.add("Coffee");
        stringArrayList.add("is");
        stringArrayList.add("Delicious");

        stringArrayList.set(3, "Freaking");
        System.out.println(stringArrayList);

        stringArrayList.remove(3);

        boolean actual = stringArrayList.contains("Freaking");

        Assert. assertEquals(false, actual);
        System.out.println(stringArrayList);
    }

    @Test
    public void arrayListSizeTest0() {

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("This");
        stringArrayList.add("Coffee");
        stringArrayList.add("is");
        stringArrayList.add("Delicious");

        Assert.assertEquals(4, stringArrayList.size());

        System.out.println(stringArrayList.size());
    }

    @Test
    public void arrayListSizeTest1() {
        int x = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);
        integerArrayList.add(100);
        integerArrayList.add(212100);



        Integer expected = 5;
        Integer actual = integerArrayList.size();

        Assert.assertEquals(expected, actual);
        System.out.println(integerArrayList);
    }
}
