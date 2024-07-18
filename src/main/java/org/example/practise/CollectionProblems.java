package org.example.practise;

import java.util.*;

public class CollectionProblems {
    public static void main(String[] args) {

       Set<Integer> set = new HashSet<>();

       // List<Integer> set = new ArrayList<>();

        //set.add(null);
        set.add(11);
        set.add(143);
        set.add(null);
        set.add(123);
        set.add(123);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(123);
        set.add(123);
        System.out.println("Original List "+ set);
        System.out.println("Size of List " + set.size());
     //   System.out.println(set.get(11));
       // System.out.println(set.indexOf(null));
     //   System.out.println(set.lastIndexOf(null));
        int characteristics = set.spliterator().characteristics();
        System.out.println(characteristics);
        System.out.println(set.remove(null));
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        int characteristics1 = set.spliterator().characteristics();
        System.out.println(characteristics1);
    }
}
