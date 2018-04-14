package by.dm13y.datastructure.trees.rbtree;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Random;
import java.util.TreeMap;

public class RedBlackTreeStructure {
    public static NavigableMap<Integer, String> generateTreeMap() {
        NavigableMap<Integer, String> generate = new TreeMap<>();
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int randInt = rand.nextInt(100);
            generate.put(randInt, String.valueOf(i));
        }
        return generate;
    }

    private static String genString(Random rand, int i) {
        return String.format("%d-i%d", rand.nextLong(), i);
    }

    public static NavigableMap<String, String> generateTreeMap(Comparator<String> comparator) {
        NavigableMap<String, String> generate = new TreeMap<>(comparator);
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            generate.put(genString(rand, i), String.valueOf(i));
        }
        return generate;
    }
}
