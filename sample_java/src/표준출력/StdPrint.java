package 표준출력;
//표준출력 : 콘솔 출력을 의미
//System.in : 표준 입력
//System.out : 표준 출력, println(내용 출력 후 줄 바꿈), print(줄 바꿈 없음), printf(서식을 지정해서 출력) - 서식지정자 : %d, %ld, %f, %2f, %s....
//이스케이프 시퀀스 : \n, \r, \t, \b, \\
//System.err : 표준 오류 출력(거의 안 쓰임)

public class StdPrint {
    public static void main(String[] args) {
        String name = "곰돌이사육사";
        String addr = "경기도 성남시 중원구";
        char gender = 'M';
        int age = 22;
        int kor = 90;
        int eng = 88;
        int mat = 67;
        //자바 스타일 : print(), println(), 데이터 파일에 대한 서식 지정이 필요 없음
        System.out.println("=".repeat(10) + "자바 스타일" + "=".repeat(10));
        System.out.println("이름 : "+name);
        System.out.println("주소 :"+addr);
        System.out.println("성별 : "+gender);
        System.out.println("나이 : "+age);
        System.out.println("평균 : "+ (double)(kor+eng+mat)/3);
        //C언어 스타일 : printf(), 데이터 타입에 대한 서식이 필요
        System.out.println("=".repeat(10) + "C 스타일" + "=".repeat(10));
        System.out.printf("이름 : %s\n", name); //%s 문자열 출력 서식, \n 줄바꿈 제어 문자
        System.out.printf("주소 : %s\n", addr);
        System.out.printf("성별 : %c\n", gender);
        System.out.printf("나이 : %d\n", age);
        System.out.printf("평균 : %f\n", (double)(kor+eng+mat)/3); //%.2f 소수점 이하 2자리까지 출력

        //이스케이프 시퀀스 사용하기
        System.out.print("안녕하세요.\n");
        System.out.print("\""+name+"\""+"님");
        System.out.print("오늘은 완전 여름 날씨 입니다\n\n"); //\n new line
        System.out.print("딸기\r바나나\r사과"); //\r 캐리지리턴, 커서를 맨앞으로 이동 시킴
        System.out.printf("오늘은 습도가 85%% 입니다"); //%는 서식 지정자를 의미 하므로 %를 출력하려면 %%로 작성해야한다



    }
}
