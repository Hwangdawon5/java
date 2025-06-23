package 스위치문;
//if(조건문)
//switch(값) : 값은 정수, 문자열, 문자가 올 수 있으나 실수는 올 수 없음

import java.util.Scanner;

public class SwitchMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("계절 입력 : ");
        String season = sc.next().toLowerCase(); //공백 기준으로 문자열을 입력 받음
        switch (season) {
            case "spring" :
                System.out.println("꽃이 피는 봄 입니다. ");
                break; //break 탈출문이 필요
            case "summer" :
                System.out.println("무더운 여름 입니다. ");
                break;
            case "fall":
            case "autumn":
                System.out.println("화창한 가을 입니다. ");
                break;
            case "winter":
                System.out.println("추운 겨울 입니다. ");
                break;
            default:
                System.out.println("계절을 잘못 입력했습니다. ");

        }

    }
}
