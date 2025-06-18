package 표준입력;
//표준 입력이란? 키보드를 통해서 입력 받는 것을 의미하고 주로 Scanner 클래스를 사용 함

import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        boolean b = sc.nextBoolean(); //불리언 값을 입력 받음
//        char c = sc.next().charAt(0); //문자열에서 0번째 문자를 추출
//        byte bb = sc.nextByte(); //byte 값을 입력 받음
//        short s = sc.nextShort();
//        int i = sc.nextInt();
//        String s1 = sc.next(); //공백 기준으로 문자열을 입력 받음
//        String s2 = sc.nextLine(); //줄 바꿈 문자 기주능로 입력 받음
// 이름(공백 없는 문자열), 주소(공백이 있는 문자열), 성별(문자), 나이(정수)를 입력을 모두 받은 후 출력하기
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력: ");
        String name = sc.next(); //공백 기준으로 문자열을 입력 받음
        sc.nextLine(); // 버퍼 지우기
        System.out.print("주소를 입력 ");
        String addr = sc.nextLine(); //줄 바꿈 문자가 들어 올 때 까지 입력 받음
        System.out.print("성별을 입력: ");
        char gender = sc.next().charAt(0); //문자열에서 0번째 문자 추출
        System.out.print("나이를 입력: ");
        int age = sc.nextInt(); //정수값을 입력 받음

        System.out.println("=".repeat(10) + "회원 정보 출력" + "=".repeat(10));
        System.out.println("이름 : "+name);
        System.out.println("주소 : "+addr);
        System.out.println("성별 : "+gender);
        System.out.println("나이 : "+age);


    }
}
