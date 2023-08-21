package Chapter03_조건문;

import java.util.Scanner;

/*
    2023.08.21

    [문제]
    사칙연산 계산기 만들기.
 */
public class SwitchClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사칙연산 식을 입력하세요 : ");
        int num1 = sc.nextInt();
        char operator = sc.next().charAt(0);
        int num2 = sc.nextInt();

        switch(operator){
            case '+' :
                System.out.println("SUM : " + (int)(num1 + num2));
                break;
            case '-' :
                System.out.println("SUB : " + (int)(num1 - num2));
                break;
            case '*' :
                System.out.println("MUL : " + (int)(num1 * num2));
                break;
            case '/' :
                System.out.println("DIV : " + (int)(num1 / num2));
                break;
            default :
                System.out.println("사칙연산을 할 수 없습니다.");
        }
    }
}
