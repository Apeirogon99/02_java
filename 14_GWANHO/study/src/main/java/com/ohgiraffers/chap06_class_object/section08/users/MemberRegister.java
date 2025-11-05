package com.ohgiraffers.chap06_class_object.section08.users;

public class MemberRegister {
    private final MemberRepository repository = new MemberRepository();

    public void regist(Member[] members) {
        System.out.println("회원을 등록합니다.");

        for(int i = 0; i < members.length; i++) {

            Member member = members[i];

            System.out.println(member.getName() + "님을 회원등록에 성공했습니다.");

            if(repository.store(member)) {

            }
        }


    }
}
