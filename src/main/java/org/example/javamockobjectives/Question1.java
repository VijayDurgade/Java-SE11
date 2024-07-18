package org.example.javamockobjectives;

import java.util.LinkedList;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        List<String> strList = new LinkedList<>();//line 1

        //Adding elements to the strList

        strList.add("Java");
        strList.add("Programmer");
        strList.add("Mock");
        strList.add("Certification");

        String value = "Mock";

        testString(strList, "Java", value);//line 2

        System.out.println(strList);
    }

    private static <String> void testString(List<String> strList, String value1, String value2) //line3
    {
        for (String string : strList) { //line4

            if (value1.equals(string)) {
                strList.remove(value2);
            }
        }
    }
}

        /*Compilation fails at line 1 as the generic type should be mentioned at the right-hand side also
        Compilation fails at line 2 as the testString() method is not called in a proper way because it's a generic static function
        Compilation fails at line 3 as the generic method testString() should return a String value
   Ans==>  Compilation succeeds but throws java.util.ConcurrentModificationException at line 4 during runtime*/