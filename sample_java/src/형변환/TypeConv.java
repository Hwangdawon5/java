package 형변환;
//형변환 : 하나의 타입을 다른 타입으로 변환하는 것을 형변환이라 함
//형변환에는 명시적 형변환과(개발자가 의도를 가짐) 묵시적 형변환(컴파일러 자동으로 수행)
public class TypeConv {
    public static void main(String[] args) {
        int kor = 78; //국어 성적
        int eng = 67;
        int mat = 76;
        int total = kor + eng + mat; //총 점수 구하기
        //명시적 형변환과 묵시적 형변환이 일어남
        double avg = (double) total / 3; //정수값의 특징은 소수점 이하가 없음
        System.out.println("평균 : " + avg);

        //타입 변환 매서드
        String number1 = "100"; // 100이라는 문자열
        String number2 = "200";
        int num1 = Integer.parseInt(number1); //문자열을 정수값으로 변환
        int num2 = Integer.parseInt(number2);
        System.out.println(num1+num2);
    }
}
