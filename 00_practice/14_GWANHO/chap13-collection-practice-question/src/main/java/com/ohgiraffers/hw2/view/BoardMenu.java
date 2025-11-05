package com.ohgiraffers.hw2.view;

import com.ohgiraffers.hw2.comparator.*;
import com.ohgiraffers.hw2.controller.BoardManager;
import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class BoardMenu {
    private BoardManager manager = new BoardManager();
    private InputBoard input = new InputBoard();

    public BoardMenu() {
        manager.insertBoard(new BoardDTO(1, "T1", "W1", LocalDate.now(), "C1", 1));
        manager.insertBoard(new BoardDTO(2, "T2", "W2", LocalDate.now(), "C2", 2));
        manager.insertBoard(new BoardDTO(3, "T3", "W3", LocalDate.now(), "C3", 3));
        manager.insertBoard(new BoardDTO(4, "T4", "W4", LocalDate.now(), "C4", 4));
        manager.insertBoard(new BoardDTO(5, "T5", "W5", LocalDate.now(), "C5", 5));
        manager.insertBoard(new BoardDTO(6, "T6", "W6", LocalDate.now(), "C6", 6));
    }

    public void mainMenu() {
        Scanner sc = new Scanner(System.in);

        do {
            String menu = """
                    *** 게시글 서비스 프로그램 ***
                    1. 게시글 쓰기
                    2. 게시글 전체보기
                    3. 게시글 한 개보기
                    4. 게시글 제목 수정
                    5. 게시글 내용 수정
                    6. 게시글 삭제
                    7. 게시글 제목 검색
                    8. 정렬하기
                    9. 끝내기
                    ==========================================
                    메뉴 번호 선택 : """;
            System.out.print(menu);

            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    manager.insertBoard(input.inputBoard());
                    break;
                case 2:
                    manager.selectAllList();
                    break;
                case 3:
                    manager.selectOneBoard(input.inputBoardNo());
                    break;
                case 4:
                    manager.updateBoardTitle(input.inputBoardNo(), input.inputBoardTitle());
                    break;
                case 5:
                    manager.updateBoardContent(input.inputBoardNo(), input.inputBoardContent());
                    break;
                case 6:
                    manager.deleteBoard(input.inputBoardNo());
                    break;
                case 7:
                    manager.searchBoard(input.inputBoardTitle());
                    break;
                case 8:
                    sortSubMenu();
                    break;
                case 9:
                    System.out.println("프로그램이 종료되었습니다.");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }

    public void sortSubMenu() {
        Scanner sc = new Scanner(System.in);

        do {
            String menu = """
                    *** 게시글 정렬 메뉴 ***
                    1. 글번호순 오름차순 정렬
                    2. 글번호순 내림차순 정렬
                    3. 작성날짜순 오름차순 정렬
                    4. 작성날짜순 내림차순 정렬
                    5. 글제목순 오름차순 정렬
                    6. 글제목순 내림차순 정렬
                    7. mainMenu()메소드로 이동
                    ==========================================
                    메뉴 번호 선택 : """;
            System.out.print(menu);

            int number = Integer.parseInt(sc.nextLine());
            switch (number) {
                case 1:
                    manager.sortList(new AscBoardNo());
                    return;
                case 2:
                    manager.sortList(new DescBoardNo());
                    return;
                case 3:
                    manager.sortList(new AscBoardDate());
                    return;
                case 4:
                    manager.sortList(new DescBoardDate());
                    return;
                case 5:
                    manager.sortList(new AscBoardTitle());
                    return;
                case 6:
                    manager.sortList(new DescBoardTitle());
                    return;
                case 7:
                    System.out.println("mainMenu()메소드로 이동");
                    return;
                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
            }
        } while (true);
    }
}
