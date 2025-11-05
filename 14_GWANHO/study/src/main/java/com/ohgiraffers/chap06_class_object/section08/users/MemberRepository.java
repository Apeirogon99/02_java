package com.ohgiraffers.chap06_class_object.section08.users;

public class MemberRepository {
    private final static Member[] members = new Member[10];
    private static int count;

    public boolean store(Member member) {

        if(count == members.length) {
            return false;
        }

        members[count++] = member;
        return true;
    }

    public static Member[]  findAllMembers() {
        return members;
    }
}
