//20250623 (월)

package 연산자;
// 연산자 : 프로그램에서 사용하는 값을 연산할 때 사용
//산술 연산자 : +, -, *, /, %, 이항연산자라고 부름
//대입 연산자 : =, +=, -=, *=, /=, %=
//비교 연산자 : >, <, >=, <=, ==, !=
//논리 연산자 : ||(둘 중 하나만 참이면 참), &&(둘 다 참이어야 참), !(이전 상태를 부정)
//증감 연산자 : ++, --
//삼항 연산자 : 항이 3개인 연산자, 간단한 조건식을 만들 수 있음

import java.util.Scanner;

public class OpMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //키보드 입력을 받기 위해 사용
        System.out.print("나이 입력 : ");
        int age = sc.nextInt(); //스캐너 객체를 통해서 나이를 입력 받아 age변수에 대입
        String isAdult = (age>19) ? "성인" : "미성년자";
        System.out.println("당신의 나이는 "+ age + "이고, 당신은 ", isAdult + "입니다.");


//        if (age>19) {
//            System.out.println("당신의 나이는 " + age + "이고, 당신은 성인 입니다.");
//        } else {
//            System.out.println("당신의 나이는 " + age + "이고, 당신은 미성년자 입니다.");
//        }

        //문자열 결합 연산자
        System.out.println("Java" + 18.04 + 02);    //Java18.0402
        System.out.println(3 + 33 + "JDK");    //6.33JDK



    }
}
