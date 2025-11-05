package com.ohgiraffers.chap13_collection.section01.List;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    /**
     *
     */
    @Override
    public int compare(BookDTO lhs, BookDTO rhs) {

        if(lhs.getPrice() > rhs.getPrice())
            return 1;
        else if(lhs.getPrice() == rhs.getPrice())
            return 0;
        else
            return -1;
    }
}
