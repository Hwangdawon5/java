package 변수와자료형;
//변수란? 메모리 공간에 이름을 붙이는 것, 자바는 JVM이 메모리를 할당
//변수를 만들기 위해서는 어떤 데이터를 저장할 지 결정해야 하고,
//변수 이름은 사용 목적에 맍게 작명 해야 함
//변수 이름의 규칙 : 영문자(대소문자), 숫자, _, $ 사용 가능
//숫자로 시작하면 안됨, 예약어 안됨, 공백 안됨
//camelCase 준수, 목적에 맞게 끔 이름을 작명 해야 함
//자바, 자바스크립트 : camel case
//파이썬, c언어 : snake case
//C++ : 둘 다 사용
/*
public class DataMain {
    public static void main(String[] args) {
        int __1st;
        int $$$$1st;
        //int case; (case가 예약어)
        //int 1st; (숫자로 시작)
        int texRate; //카멜 표기법
        String memberInfo;

    }
}
 */
public class DataMain {
    public static void main(String[] args) {
        //자바의 자료형은 크리 기본형과 참조형으로 나누어 짐
        //기본형은 변수에 직접 값이 대입 되는 방식
        //참조형은 변수에 주소가 대입되는 방식
        boolean isAdult = false; //1Byte 크기이고 참/ 거짓을 가짐
        char gender = 'M'; //2Byte 크기이고, 문자를 대입 받음, ''(작은 따옴표 사용), 음수가 올 수 없음
        char test = 35545;
        System.out.println(test);

        //정수 타입
        byte code = 127; //1Byte, -128 ~ 127
        short sCode = 32500; //2Byte, -32768 ~ 32767
        int age = 2100000000; //4Byte, -21억 ~21억
        long money = 300000000; //8Byte

        //실수 타입: 소수점 이하를 표기하기 위해서 사용하는 실수 타입이고, 근사치 계산법
        float tax = 30.0000f; //32비트
        double taxLong = 30.0000; //
        double num = 0.1;
        for(int i = 1; i < 1000; i++) {
            num += 0.1;
        }
        System.out.println(num);

        String addr = "경기도 성남시 분당구" ;
        System.out.println(addr);


    }
}
