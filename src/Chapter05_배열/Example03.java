package Chapter05_배열;

import java.util.Scanner;

/*
    2023.08.25

    [문제]
    7개의 정수를 입력 받고, 홀수와 짝수를 각 배열에 나누어 저장 후 출력하기.
 */
public class Example03 {

    public static void main(String[] args) {
        Calc_func calc_func = new Calc_func();
        calc_func.inputInt();
        calc_func.oddEven();
        calc_func.dispOutput();
    }
}
class Calc_func {
    int[] arr = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int e_idx = 0;
    int o_idx = 0;
    public void inputInt() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public void oddEven() {
        for (int i : arr) {
            if (i % 2 == 0)  even[e_idx++] = i;
            else odd[o_idx++] = i;
        }
    }
    public void dispOutput() {
        System.out.println("홀수 : ");
        for (int i = 0; i < o_idx; i++) System.out.printf("%2d", odd[i]);
        System.out.println();
        System.out.println("짝수 : ");
        for (int i = 0; i < e_idx; i++) System.out.printf("%2d", even[i]);
        System.out.println();
    }
}
