package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    행사 안내 메일 발송하기
    1. 사용자로부터 이름, 제목, 날짜(20230817), 시간(17) 정보를 입력받습니다.
    2. 입력된 날짜의 월을 추출하여 해당하는 계절을 판단합니다.
    3. 계절에 따라 적절한 인사말과 입력된 일정 정보를 출력합니다.

    프로그램은 다음과 같은 방식으로 동작해야 합니다.
    - 1월부터 12월까지의 월 정보를 입력 받습니다.
    - 입력된 월에 따라 다음과 같은 계절 정보를 출력합니다.
    - 12월, 1월, 2월 → "하얀 눈이 내리는 겨울입니다."
    - 3월, 4월, 5월 → "꽃이 피는 따뜻한 봄입니다."
    - 6월, 7월, 8월 → "뜨거운 태양이 내리쬐는 여름입니다."
    - 9월, 10월, 11월 → "단풍이 아름다운 가을입니다."
    - 입력된 이름, 제목, 날짜, 시간 정보와 계절 정보를 이용하여 다음과 같은 형식으로 일정 정보를 출력합니다.

    [출력 형식]
    [이름]님.
    [계절 정보]
    아래의 일정으로 [제목]를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.

    ===== 행사 안내 =====
    행사 안내 : [제목]
    날짜 : [년]년 [월]월 [일]일
    시간 : [시간]시

    [Hint]
    문자열의 substring을 이용하면 원하는 문자를 추출 할 수 있음.
 */
public class Example03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("제목 : ");
        String title = sc.nextLine();
        System.out.print("날짜 : ");
        String ymd = sc.next();
        System.out.print("시간 : ");
        int time = sc.nextInt();
        String year = ymd.substring(0,4);
        String month = ymd.substring(4,6);
        String date = ymd.substring(6);
        String greeting;

        switch(month) {
            case "01" :
            case "02" :
            case "12" :
                greeting = "하얀 눈이 내리는 겨울입니다.";
                break;
            case "03" :
            case "04" :
            case "05" :
                greeting = "꽃이 피는 따뜻한 봄입니다.";
                break;
            case "06" :
            case "07" :
            case "08" :
                greeting = "뜨거운 태양이 내리쬐는 여름입니다.";
                break;
            case "09" :
            case "10" :
            case "11" :
                greeting = "단풍이 아름다운 가을입니다.";
                break;
            default :
                greeting = "안녕하세요.";
        }
        System.out.println("");
        System.out.println(name + "님.");
        System.out.println(greeting);
        System.out.println("아래의 일정으로 " + title + "를 진행하고자 하오니 오셔서 자리를 빛내 주시기 바랍니다.");
        System.out.println("");
        System.out.println("=".repeat(5) + " 행사 안내 " + "=".repeat(5));
        System.out.println("행사 안내 : " + title);
        System.out.println("날    짜 : " + year + "년 " + month + "월 " + date + "일");
        System.out.println("시    간 : " + time + "시");
    }
}
