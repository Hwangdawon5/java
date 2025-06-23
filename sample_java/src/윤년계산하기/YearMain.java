package 윤년계산하기;
//윤년이란? 지구가 태양을 한바퀴 도는 데 걸리는 시간은 365과 1/4이 소요 됨
//그래서 운년은 1년 366일이 되는 해를 말함
//1. 연도가 4로 나누어 떨어짐
//2. 100으로 나누어 떨어지면 윤년이 아님
//3. 400으로 나누어 떨어지면 윤년

import java.util.Scanner;

public class YearMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력을 받기 위해 스캐너 객체 생성
        System.out.print("년도 입력 : ");
        int year = sc.nextInt();    //정수값을 입력받아 year 변수에 대입
        if (year%4==0 && (year %100!=0 || year%400==0 ) {  // 4의 배수이면 윤년임.
            //조건식이 참 인 경우 수행되는 영역
            System.out.println(year + "년은 윤년 입니다.");
        } else {
            //조건식이 거짓이면 수행되는 영역
            System.out.println(year + "년은 윤년이 아닙니다.");
        }

    }
}
