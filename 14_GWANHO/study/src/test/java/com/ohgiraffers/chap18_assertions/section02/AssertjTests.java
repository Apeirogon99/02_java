package com.ohgiraffers.chap18_assertions.section02;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/* Test 3rd party lib 중 AssertJ의 사용법 */
class AssertjTests {

    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation() {
        String expected = "Hello World";

        String actual = new String(expected);

        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("Hello")
                .doesNotContain("hahaha")
                .startsWith("H")
                .isEqualTo(expected);

    }

    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation() {
        double pi = Math.PI;
        Double actual = Double.valueOf(pi);

        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4);
    }

    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthday = "2014-09-18T16:42:00.000";
        LocalDateTime theDay = LocalDateTime.parse(birthday);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .isBetween("2014-01-01T16:42:00.000", "2014-12-31T16:42:00.000")
                .isBefore(LocalDateTime.now());
    }

    @Test
    @DisplayName("예외 테스트")
    void testExceptionValidation() {
        Throwable throwable = AssertionsForClassTypes
                .catchThrowable(() -> {
                    throw new IllegalArgumentException("잘못 된 파라미터를 입력하였습니다.");
                });
        Assertions.assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        Member member1 = new Member(1, "user01", "name01", 16);
        Member member2 = new Member(1, "user02", "name02", 26);
        Member member3 = new Member(1, "user03", "name03", 36);

        List<Member> members = Arrays.asList(member1, member2, member3);
        Assertions.assertThat(members)
                .filteredOn(member -> member.getAge() > 19)
                .containsOnly(member2, member3);
    }
}