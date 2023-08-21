package Chapter01_Scanner;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    이름, 주소, 성별, 나이를 포함하는 회원 정보 출력하기
 */
public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("=".repeat(7) + " 회원 정보 출력 " + "=".repeat(7));
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("나이 : " + age);
    }
}