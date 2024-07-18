package org.example.questions.programs;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(3);
        System.out.println(names.size());
        names.add("Gloria");
        System.out.println(names.size());
        names.remove(0);
        System.out.println(names.size());

    }

}

