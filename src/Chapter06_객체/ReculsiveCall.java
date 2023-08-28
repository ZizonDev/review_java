package Chapter06_객체;
/*
    2023.08.28

    [문제]
    1부터 10까지의 정수의 합을 구하는 프로그램을 만들어보자.
 */

public class ReculsiveCall {
    public static void main(String[] args) {
        int recurs = recursiveFunction(10);
        System.out.println(recurs);
    }

    private static int recursiveFunction(int i) {
        if (i == 1) return 1;
        return i + recursiveFunction(i-1);
    }

}
