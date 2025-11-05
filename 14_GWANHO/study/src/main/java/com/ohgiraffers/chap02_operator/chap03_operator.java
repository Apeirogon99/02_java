package com.ohgiraffers.chap02_operator;

public class chap03_operator {
    public static void main(String[] args) {

        /**
         * 산술 연산자
         */
        {
            int num1 = 20;
            int num2 = 7;

            System.out.println("num1 + num2 = " + (num1 + num2));
            System.out.println("num1 - num2 = " + (num1 - num2));
            System.out.println("num1 * num2 = " + (num1 * num2));
            System.out.println("num1 / num2 = " + (num1 / num2));
            System.out.println("num1 % num2 = " + (num1 % num2));
        }

        /**
         * 대입 연산자
         */
        {
            int num = 12;
            System.out.println("num : " + num);

            num = num + 3;
            System.out.println("num : " + num);

            num += 3;
            System.out.println("num : " + num);

            num -= 5;
            System.out.println("num : " + num);

            num *= 2;
            System.out.println("num : " + num);

            num /= 2;
            System.out.println("num : " + num);

            num = -5;
            System.out.println("num : " + num);
        }

        /**
         * 증감 연산자
         */
        {
            int num = 20;
            System.out.println("num : " + num);

            num++;		//1 증가
            System.out.println("num : " + num);

            ++num;		//1 증가
            System.out.println("num : " + num);

            num--;		//1 감소
            System.out.println("num : " + num);

            --num;		//1 감소
            System.out.println("num : " + num);

            int firstNum = 20;

            int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

            System.out.println("result1 : " + result1);
            System.out.println("firstNum : " + firstNum);

            int secondNum = 20;

            int result2 = ++secondNum * 3;			//증가를 먼저 처리하고 난 뒤 다른 연산을 함

            System.out.println("result2 : " + result2);
            System.out.println("secondNum : " + secondNum);

            int num1 = 10;
            int addNum = num1++;
            System.out.println("addNum : " + addNum);
        }

        /**
         * 비교 연산자
         */
        {
            int inum1 = 10;
            int inum2 = 20;

            System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
            System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
            System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
            System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
            System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
            System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

            double dnum1 = 10.0;
            double dnum2 = 20.0;

            System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
            System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
            System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
            System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
            System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
            System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2));

            char ch1 = 'a';
            char ch2 = 'A';

            System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
            System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
            System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
            System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
            System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
            System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));

            boolean bool1 = true;
            boolean bool2 = false;

            System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
            System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
        }

        /**
         * 논리연산자
         */
        {
            System.out.println("true와 true의 논리 and 연산 : " + (true && true));
            System.out.println("true와 false의 논리 and 연산 : " + (true && false));
            System.out.println("false와 true의 논리 and 연산 : " + (false && true));
            System.out.println("false와 false의 논리 and 연산 : " + (false && false));

            System.out.println("true와 true의 논리 or 연산 : " + (true || true));
            System.out.println("true와 false의 논리 or 연산 : " + (true || false));
            System.out.println("false와 true의 논리 or 연산 : " + (false || true));
            System.out.println("false와 false의 논리 or 연산 : " + (false || false));

            System.out.println("true의 논리 not 연산 : " + (!true));
            System.out.println("false의 논리 not 연산 : " + (!false));

            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;

            System.out.println("a가 b보다 작으면서 c가 d보다 작은지 확인 : " + (a < b && c < d));
            System.out.println("a가 b보다 작으면서 c가 d보다 큰지 확인 : " + (a < b && c > d));
            System.out.println("a가 b보다 크면서 c가 d보다 작은 확인 : " + (a > b && c < d));
            System.out.println("a가 b보다 크면서 c가 d보다 큰지 확인 : " + (a > b && c > d));

            System.out.println("a가 b보다 작거나 c가 d보다 작은지 확인 : " + (a < b || c < d));
            System.out.println("a가 b보다 작거나 c가 d보다 큰지 확인 : " + (a < b || c > d));
            System.out.println("a가 b보다 크거나 c가 d보다 작은 확인 : " + (a > b || c < d));
            System.out.println("a가 b보다 크거나 c가 d보다 큰지 확인 : " + (a > b || c > d));

            int x = 3;
            int y = 10;

            /* 1. 1부터 100 사이의 값인지 확인 */
            /* 1 <= 변수 <= 100 이렇게는 사용 못함  --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
            int num1 = 55;
            System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

            int num2 = 166;
            System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

            /* 2. 영어 대문자인지 확인 */
            /* 영어 대문자냐? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
            char ch1 = 'G';
            System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

            char ch2 = 'g';
            System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));

            /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
            /* 문자변수 == 'y' || 문자변수 == 'Y' */
            char ch3 = 'Y';
            System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

            char ch4 = 'y';
            System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

            /* 4. 영문자인지 확인 */
            /* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
            /* 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
             * 논리적으로 먼저 실행하는 내용을 괄호로 묶어 주는게 좋다.
             * */
            char ch5 = 'f';
            System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
            System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

            char ch6 = 'F';
            System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
            System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));

            /* 1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함  */
            /* 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
             * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
             * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
             * */
            int num3 = 10;

            /* 앞에 조건이 false로 강제화 해 두고 && 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
             * num1 선치 증가 코드가 동작했다면 result1은 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
             * */
            int result1 = (false && ++num3 > 0)? num3 : num3;

            System.out.println("&&실행 확인 : " + result1);		//10

            /* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함 */
            /* 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
             * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
             * 따라서 연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
             * */
            int num4 = 10;

            /* 앞에 조건을 true로 강제화 해 두고 || 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
             * num1 선치 증가 코드가 동작했다면 result2는 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
             * */
            int result2 = (true || ++num4 > 0)? num4 : num4;

            System.out.println("||실행 확인 : " + result2);		//10
        }

        /**
         * 삼항 연산자
         */
        {
            int num1 = 10;
            int num2 = -10;
            String result1 = (num1 > 0)? "양수다.": "양수가 아니다.";
            String result2 = (num2 > 0)? "양수다.": "양수가 아니다.";

            System.out.println("num1은 " + result1);
            System.out.println("num2는 " + result2);

            /* 중접 사용도 가능하다. */
            int num3 = 5;
            int num4 = 0;
            int num5 = -5;

            String result3 = (num3 > 0)? "양수다.": (num3 == 0)? "0이다.":"음수다.";
            String result4 = (num4 > 0)? "양수다.": (num4 == 0)? "0이다.":"음수다.";
            String result5 = (num5 > 0)? "양수다.": (num5 == 0)? "0이다.":"음수다.";

            System.out.println("num3은 " + result3);
            System.out.println("num4는 " + result4);
            System.out.println("num5는 " + result5);
        }
    }
}
