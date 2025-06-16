package 샘플;

/*
이건 범위 주석 입니다.
 */
//자바는 객체지향문법으로 구현되어야 하므로 모든 함수는 클래스 내부에 존재 함
//주석을 의미, 컴파일러에게 해석하지 않도록 하는 것
public class SampleMain {
    //public 접근제한자, static 정적 메서드를 의미
    //void는 반환값이 없음을 의미, main()은 프로그램 시작이자 끝
    public static void  main(String[] args) {
        //표준 출력 함수, ;(세미콜론)은 문장이 끝남을 컴파일러에게 알려 줌
        System.out.println("안녕하세요. 자바를 공부합니다.");
        //자바는 문자와 문자열을 구분 함. 문자열을 "", 문자는 ''
        System.out.println("안녕하세요. 파이썬을 공부합니다.");
        System.out.println('M'); //문자를 의미
        System.out.println("M"); //문자열을 의미
        System.out.println(100+200); //정수 (연산이 가능한 소수점 이하가 없는 숫자)
        System.out.println(100+200+"200"); //결합 순서에 따라 결과가 달라짐
        System.out.println("100"+200+200);
        System.out.println(3.141578994944949);
        //ctrl누르고 shift옆에 있는 / 누르면 주석 처리
    }
}
