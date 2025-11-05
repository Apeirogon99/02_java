package com.ohgiraffers.hw2.controller;

import com.ohgiraffers.hw2.model.dto.BoardDTO;
import com.ohgiraffers.hw2.view.ResultPrinter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BoardManager {
    private ArrayList<BoardDTO> boards = new ArrayList<>();
    private ResultPrinter resultPrinter = new ResultPrinter();

    public void insertBoard(BoardDTO board) {

        // 조회 내역이 있는지?
        boolean isSelect = false;
        for (BoardDTO oldBoard : boards) {
            if(oldBoard.getReadCount() > 0) {
                isSelect = true;
                break;
            }
        }

        if(isSelect) {
            int count = 1;
            board.setBoardNo(count);
            ArrayList<BoardDTO> newBoards = new ArrayList<>();
            for (BoardDTO oldBoard : boards) {
                oldBoard.setReadCount(++count);
                newBoards.add(oldBoard);
            }
            boards = newBoards;
        } else {

        }
        resultPrinter.successPage("insertBoard");
    }

    public void selectAllList() {
        resultPrinter.printAllList(boards);
    }

    public void selectOneBoard(int no) {
        for(BoardDTO board : boards){
            if(board.getBoardNo() == no){
                resultPrinter.printBoard(board);
                return;
            }
        }
        resultPrinter.noSearchResult();
    }

    public void updateBoardTitle(int no, String title) {
        for(BoardDTO board : boards){
            if(board.getBoardNo() == no){
                board.setBoardTitle(title);
                resultPrinter.successPage("updateTitle");
                return;
            }
        }
        resultPrinter.errorPage("updateTitle");
    }

    public void updateBoardContent(int no, String content) {
        for(BoardDTO board : boards){
            if(board.getBoardNo() == no){
                board.setBoardContent(content);
                resultPrinter.successPage("updateContent");
                return;
            }
        }
        resultPrinter.errorPage("updateContent");
    }

    public void deleteBoard(int no) {
        for(BoardDTO board : boards){
            if(board.getBoardNo() == no){
                boards.remove(board);
                resultPrinter.successPage("deleteBoard");
                return;
            }
        }
        resultPrinter.errorPage("deleteBoard");
    }

    public void searchBoard(String title) {

        ArrayList<BoardDTO> searchedBoards = new ArrayList<>();

        for(BoardDTO board : boards){
            if(board.getBoardTitle().compareTo(title) == 0){
                resultPrinter.printBoard(board);
                return;
            }
        }

        resultPrinter.printAllList(searchedBoards);
    }

    public void sortList(Comparator<BoardDTO> comparator) {
        boards.sort(comparator);
        selectAllList();
    }
}
