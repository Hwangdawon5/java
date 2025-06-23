package 조건문;
//제어문이란? 원하는 결과를 얻기 위해 프로그램의 순차적인 흐름을 제어
//제어문에는 조건문과 반복문이 있음
//if문, if ~ else, if ~ else if~ else
//swith ~ case
//3항 연산자

import java.util.Scanner;

public class ConditionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();
        if (num >= 100) {    //조건식이 참인 경우 수행
            System.out.println(num + "은 100보다 커요.");
        } else if (num<100) {
            System.out.println( num + "은 100보다 작아요.");
        } else {
            System.out.println(num + "은 100과 같아요.");
        }
    }
}
