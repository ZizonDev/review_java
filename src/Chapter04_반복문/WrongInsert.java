package Chapter04_반복문;

import java.util.Scanner;

/*
    2023.08.23

    [문제]
    나이가 잘못 입력된 경우 반복문을 계속 수행하기. (유효값 체크)
 */
public class WrongInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        while (true) {
            System.out.print("나이를 입력하세요 : ");
            age = sc.nextInt();
            if (age > 0 && age < 200) {
                System.out.println("입력하신 나이는 " + age + "세 입니다.");
                break;
            }
            else System.out.println("나이를 잘못 입력하였습니다.");
        }
    }
}
