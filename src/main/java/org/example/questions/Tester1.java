package org.example.questions;


class MyTester {
    private int data;

    public MyTester(int data) {
        this.data = data;
    }

 public int equals(MyTester myTester) {

        System.out.print("Comparing data ");

        return this.data = myTester.data;

    }
}

 class Comparator {
    public boolean compare(Object x, Object y) {
        return x.equals(y);
    }
}

public class Tester1 {

    public static void main(String[] args) {

        MyTester myTester1 = new MyTester(10);

        MyTester myTester2 = new MyTester(10);

        Comparator comparator = new Comparator();
        System.out.print(comparator.compare(myTester1, myTester2));
    }
}