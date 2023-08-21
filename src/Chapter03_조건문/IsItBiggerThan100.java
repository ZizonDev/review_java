package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    정수를 입력받고 해당 정수가 100보다 큰지 작은지 같은지 여부를 확인하는 프로그램 생성하기.
 */
public class IsItBiggerThan100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        if(num > 100) System.out.println(num + "은 100보다 큰 정수입니다.");
        else if(num < 100) System.out.println(num + "은 100보다 작은 정수입니다.");
        else System.out.println(num + "은 100과 같습니다.");
    }
}
