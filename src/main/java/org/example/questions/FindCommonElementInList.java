package org.example.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindCommonElementInList {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);
        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 3, 4, 5, 6, 7, 8);

        boolean isSimilar = Collections.disjoint(list1, list2);

        if (isSimilar) {
            System.out.println("Two lists have not common elements");
        } else {
            System.out.println("Two lists have common elements");
        }
    }
}
