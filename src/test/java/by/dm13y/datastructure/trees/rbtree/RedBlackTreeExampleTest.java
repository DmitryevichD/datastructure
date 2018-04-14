package by.dm13y.datastructure.trees.rbtree;

import org.junit.Test;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

public class RedBlackTreeExampleTest {

    @Test
    public void treeMap_checkDefaultSort(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("key(int):%d_val:%s\n", e.getKey(), e.getValue());
                });
    }

    @Test
    public void treeMap_checkCustomSort(){
        Comparator<String> comparator = (o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            }else {
                return o1.compareTo(o2);
            }
        };

        NavigableMap<String, String> genNavMap = RedBlackTreeStructure.generateTreeMap(comparator);
        genNavMap.entrySet().stream()
                .forEach(e -> System.out.printf("key(String):%s_val:%s\n", e.getKey(), e.getValue()));

    }

    @Test
    public void treeMapCeilingEntry_return_minKeyWhichGreaterOrEqualsOrNull(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        int findKey = 51;
        Map.Entry<Integer, String> integerStringEntry = genNavMap.ceilingEntry(findKey);
        System.out.println("\nfindKey:" + findKey + " ceilingKey:" + integerStringEntry.getKey());
    }

    @Test
    public void treeMapFirstEntry_return_FirstKeyFromTree(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        Map.Entry<Integer, String> integerStringEntry = genNavMap.firstEntry();
        System.out.println("\nfirst_entry:" + integerStringEntry.getKey());
    }

    @Test
    public void treeMapLastEntry_return_LastKeyFromTree(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        Map.Entry<Integer, String> integerStringEntry = genNavMap.lastEntry();
        System.out.println("\nlast_entry:" + integerStringEntry.getKey());
    }

    @Test
    public void treeMapFloorEntry_return_maxKeyWhichLessOrEqualsOrNull(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        int findKey = 51;
        Map.Entry<Integer, String> integerStringEntry = genNavMap.floorEntry(findKey);
        System.out.println("\nfindKey:" + findKey + " floorKey:" + integerStringEntry.getKey());
    }

    @Test
    public void treeMapHigherEntry_return__minKeyWhichGreaterOrNull(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        int findKey = 51;
        Map.Entry<Integer, String> integerStringEntry = genNavMap.higherEntry(findKey);
        System.out.println("\nfindKey:" + findKey + " higherKey:" + integerStringEntry.getKey());
    }

    @Test
    public void treeMapSubMap_return_rangeQueryVal(){
        NavigableMap<Integer, String> genNavMap = RedBlackTreeStructure.generateTreeMap();
        genNavMap.forEach((k,v) -> System.out.printf("%d,", k));
        int firstKey = 32;
        int lastKey = 85;
        SortedMap<Integer, String> subMap = genNavMap.subMap(firstKey, lastKey);
        System.out.println("\nsubmap -> firstkey:" + firstKey + " lastkety:" + lastKey);
        subMap.forEach((k,v) -> System.out.printf("%d,", k));
    }





}