package 조건문실습;
//국어, 영어, 수학 성적을 입력 받음
//각각의 성적이 0 ~ 100 사이가 아니면 입력 오류 출력
//국어, 영어, 수학 성적을 더해서 총점과 평균 구하기
//평균이 90점 이상이면 A와 총점 출력
//평균이 80점 이상이면 B와 총점 출력
//평균이 70점 이상이면 C와 총점 출력
//평균이 60점 이상이면 D와 총점 출력
//나머지는 F와 총점 출력

import java.util.Scanner;

public class ConditionEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 성적을 입력하시오 : ");
        int kor = sc.nextInt();
        System.out.print("영어 성적을 입력하시오 : ");
        int eng = sc.nextInt();
        System.out.print("수학 성적을 입력하시오 : ");
        int mat = sc.nextInt();

        if (kor < 0 || kor > 100 || eng < 0 || eng >100 || mat<0 || mat>100) {
            System.out.println("성적 입력 오류 !!!");
        } else {
            int total = kor + eng + mat;
            double avg = (double) total/3 ;
            if (avg >= 90) System.out.println("A" + total);
            else if (avg >= 80) System.out.println("B" + total);
            else if (avg >= 70) System.out.println("C" + total);
            else if (avg >= 60) System.out.println("D" + total);
            else System.out.println("F" + total);
        }


    }
}
