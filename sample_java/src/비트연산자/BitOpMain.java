package 비트연산자;
//bit 연산이란? 비트 수준의 연산을 제공
//bit는 0/1의 값을 가진 정보의 최소 단위
//비트 연산을 이해하기 위해서는 결국 2진법의 동작을 알아야 함
//비트 AND : &, 두개의 비트가 모두 1이면 1
//비트 OR : |, 둘 중 하나만 1이어도 1
//비트 XOR : ^, 두 비트의 값이 다른 경우 1
//비트 NOT : ~, 비트를 반전
//쉬프트 연산 : <<, >>

public class BitOpMain {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int rest = x + y;
        System.out.println(x & y); //8
        System.out.println(x | y); //14
        System.out.println(x ^ y); //6
        System.out.println(~x); //-11
        System.out.println(x << 1); //20
        System.out.println(x >> 1); //5

    }
}
