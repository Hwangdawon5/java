package 연산자연습;
//100의 자리 정수를 입력 받아 3개의 변수에 나누어 담고, 이 중 가장 큰 수 구하기
//875=> a = 8, b = 7, c = 5

import java.util.Scanner;

public class OpExMain {
    public static void main(String[] args){
        //스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        //정수값 입력 받기
        System.out.print("정수를 입력하시오 : ");
        int num = sc.nextInt();
        //정수값을 100의 자리, 10의 자리. 1의 자리 변수에 나누어 담기
        int a = num / 100; //100으로 나눈 몫을 a에 대입
        int b = num % 100 / 10; //100으로 나눈 나머지를 10으로 나눈 몫을 구해서 b에 대입
        int c = num % 10;
        //나누어 담은 3개의 변수 중 가장 큰 수를 찾아서 출력하기
        if (a>b) {
            if (a>c) System.out.println(a);
            else System.out.println(c);
        }else {
            if (b>c) System.out.println(b);
            else System.out.println(c);
        }







    }
}
