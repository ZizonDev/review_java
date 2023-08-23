package Chapter04_반복문;
/*
    2023.08.23

    [문제]
    정수 n을 입력받고, n*n 형태의 별 찍기.
 */
import java.util.Scanner;

public class MakeN2StarBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j= 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
