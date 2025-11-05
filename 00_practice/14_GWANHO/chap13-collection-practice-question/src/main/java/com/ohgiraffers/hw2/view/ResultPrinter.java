package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.ArrayList;

public class ResultPrinter {

    public void printAllList(ArrayList<BoardDTO> boards){
        if(boards.isEmpty()){
            noSearchResult();
            return;
        }

        for(BoardDTO board : boards){
            printBoard(board);
        }
    }

    public void printBoard(BoardDTO board){
        board.setReadCount(board.getReadCount() + 1);
        System.out.println(board);
    }

    public void errorPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 실패!");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 실패!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 실패!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 실패!");
                break;
            default:
                break;
        }
    }

    public void successPage(String msg) {
        switch (msg) {
            case "insertBoard":
                System.out.println("게시글 등록 성공!");
                break;
            case "updateTitle":
                System.out.println("게시글 제목 수정 성공!");
                break;
            case "updateContent":
                System.out.println("게시글 내용 수정 성공!");
                break;
            case "deleteBoard":
                System.out.println("게시글 삭제 성공!");
                break;
            default:
                break;
        }
    }

    public void noSearchResult() {
        System.out.println("검색결과가 없습니다.");
    }
}
