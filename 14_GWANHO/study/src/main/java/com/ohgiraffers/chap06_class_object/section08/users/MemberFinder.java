package com.ohgiraffers.chap06_class_object.section08.users;

public class MemberFinder {
    public Member[] findAllMembers() {
        return MemberRepository.findAllMembers();
    }
}
