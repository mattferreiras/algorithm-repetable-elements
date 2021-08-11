package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static final int[] FIRST_EXAMPLE_INT_ARRAY = {10, 5, 3, 4, 3, 5, 6};
    private static final int[] LAST_EXAMPLE_INT_ARRAY = {6, 10, 5, 4, 9, 120, 4, 6, 10};

    public static void main(String[] args) {
        System.out.println("The repeatable index is: " + findRepeatableIndex(FIRST_EXAMPLE_INT_ARRAY));
        System.out.println("The repeatable index is: " + findRepeatableIndex(LAST_EXAMPLE_INT_ARRAY));
    }

    private static int findRepeatableIndex(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < array.length; index++) {
            if (map.containsKey(array[index])) {
                return map.get(array[index]);
            } else {
                map.put(array[index], index);
            }
        }

        return -1;
    }
}
