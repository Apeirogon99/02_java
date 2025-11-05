package com.ohgiraffers.chap06_class_object.member;

public class chap06_member {
    public static void main(String[] args) {

        Member member = new Member();
        System.out.println("====> " + member.hashCode());

        member.id = "user01";
        member.name = "홍길동";
        member.pwd = "1q2w3e4r";
        member.age = 20;
        member.gender = 'M';
        member.hobbys = new String[] {"야구", "코딩"};

        System.out.println("member.id = " + member.id);
        System.out.println("member.name = " + member.name);
        System.out.println("member.age = " + member.age);
        System.out.println("member.gender = " + member.gender);

        System.out.print("member.hobbys = ");
        for(String hobby : member.hobbys) {
            System.out.print(hobby + " ");
        }
    }

    public static MemberDTO getMemberDTO(MemberDTO memberDTO) {
        memberDTO.setNumber(2);
        return memberDTO;
    }
}
