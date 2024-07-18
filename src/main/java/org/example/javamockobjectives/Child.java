package org.example.javamockobjectives;

class Parents{

    private void income(){} //line1
    void income(int i){}//line2
   // protected income(int j){} //line3
}
public class Child extends Parents { //line4
  //  private void income(int j){} //line5
    private void income(){}  //line6
}
