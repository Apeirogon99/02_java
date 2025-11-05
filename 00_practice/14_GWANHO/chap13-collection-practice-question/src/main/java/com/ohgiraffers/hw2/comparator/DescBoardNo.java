package com.ohgiraffers.hw2.comparator;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class DescBoardNo implements Comparator<BoardDTO> {
    @Override
    public int compare(BoardDTO o1, BoardDTO o2) {
        if(o2.getBoardNo() == o1.getBoardNo()) return 0;
        else if(o2.getBoardNo() > o1.getBoardNo()) return 1;
        else return -1;
    }
}