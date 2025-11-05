package com.ohgiraffers.chap16_stream.subsection03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("test01", "name01"),
                new Member("test02", "name02"),
                new Member("test03", "name03"),
                new Member("test04", "name04"),
                new Member("test05", "name05")
        );

        A(members);

        B(members);

    }

    private static void A(List<Member> members) {
        List<String> names = new ArrayList<>();
        for (Member member : members) {
            names.add(member.getName());
        }
        System.out.println(names);
    }

    private static void B(List<Member> members) {
        List<String> names = members.stream()
                .map(Member::getName)
                .toList();
        System.out.println(names);
    }

}
