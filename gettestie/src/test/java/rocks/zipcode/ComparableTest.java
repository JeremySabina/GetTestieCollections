package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ComparableTest {
    @Test
        public void comparatorTest0(){

        Comparator<Integer> integerCompareTest = Comparator.comparing(Integer::valueOf);
        int x = 5;
        ArrayList<Integer> integerArrayList = new ArrayList<>(x);

        integerArrayList.add(1);
        integerArrayList.add(230);
        integerArrayList.add(30);

        Collections.sort(integerArrayList, integerCompareTest);

        Integer[] expectedArray = {1, 30, 230};
        List<Integer> expected = Arrays.asList(expectedArray);

        Assert.assertEquals(expected, integerArrayList);
        System.out.println(integerArrayList);

    }

//    @Test
//        public void ComparableTest1() {
//
//        Comparator<String> stringCompareTest = Comparator.comparing(String::valueOf);
//        HashSet<String> hashString = new HashSet<>();
//
//        hashString.add("Biscuits");
//        hashString.add("Elbow Grease");
//        hashString.add("No Tears");
//        hashString.add("All Tenacity");
//
//        Collections.sort(hashString, stringCompareTest);
//
//
//        Assert.assertEquals(expected, hashString);
//        System.out.println(hashString);
//
//    }
}

























