package org.example.questions;

public interface Library {

    void readBook();

    void setBookMark();

}

abstract class NonFiction implements Library { //line 1

    public void readBook() {
    }

//line 2

}

class Biography extends NonFiction { // line 3
    //Class 'Biography' must either be declared abstract or implement abstract method 'setBookMark()' in 'Library'
    public void readBook() {
    }

    @Override
    public void setBookMark() {

    }

//line 4

}
