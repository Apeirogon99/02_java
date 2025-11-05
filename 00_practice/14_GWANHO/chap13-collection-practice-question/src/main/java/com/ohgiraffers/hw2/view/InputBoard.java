package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class InputBoard {

    public BoardDTO inputBoard() {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String write = sc.nextLine();
        String content = sc.nextLine();

        return new BoardDTO(title, write, content);
    }

    public int inputBoardNo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("글번호 입력 : ");
        return Integer.parseInt(sc.nextLine());
    }

    public String inputBoardTitle() {
        Scanner sc = new Scanner(System.in);

        System.out.print("글 제목 입력 : ");
        return sc.nextLine();
    }

    public String inputBoardContent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("글 내용 입력 : ");
        return sc.nextLine();
    }
}
