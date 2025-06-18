package 연산자;
//연산자란 값을 연산하기 위해 사용하는 것
//산술 연산자 : +, -, *, /, %(나머지)
//대입 연산자 : = (우변 값을 좌변에 대입), +=, -=, *=, /=, %= (복합 대입 연산자)
//증감 연산자 : ++, --, 단항 연산자라고 함
//비교 연산자 : >, <, >=, <=, ==(같다), !=(같지 않다)
//논리 연산자 : //(or, A이거나 B)
//비트 연산자 : 비트 단위로 연산
//3항 연산자 : 항이 3개인 연산자로 참과 거짓만 있는 조건문을 만듬

public class OperateMain {
    public static void main(String[] args) {
        int n1 = 10, n2 = 4;

        //산술 연산자
        System.out.println(n1 + n2);
        System.out.println(n1 - n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2); //이렇게 하면 몫을 구하는 연산이 됨
        System.out.println((double) n1 / n2);
        System.out.println(n1 % n2); //나머지를 구함

        //대입 연산자
        System.out.println(n1);
        System.out.println(n1 += 2); //n1 = n1 + 2, 12
        System.out.println(n1 -= 2); //n1 = n1 - 2, 10
        System.out.println(n1 *= 2); //20
        System.out.println(n1 /= 2); //10
        System.out.println(n1 %= 2); //0

        //증감 연산자 : 자신의 값을 1 증가 또는 감소 시키는 연산자
        int n3 = 10;
        System.out.println(n3++); //후위 증가 연산, 선 대입 후 증가
        System.out.println(n3);

        System.out.println(++n3); //선 증가 후 대입
        System.out.println(n3);

        System.out.println(--n3); //선 감소 후 대입
        System.out.println(n3);

        //비교 연산자 : 연산 결과를 참과 거짓으로 판별하는 연산자
        int x = 10, y = 20;
        System.out.println(x > y); //false
        System.out.println(x < y); //true
        System.out.println(x == y); //false
        System.out.println(x != y); //true
        System.out.println(x >= y); //false
        System.out.println(x <= y); //true

    }
}
