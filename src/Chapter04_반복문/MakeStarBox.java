package Chapter04_반복문;
/*
    2023.08.23

    [문제]
    10 * 10 형태로 별 찍기.
 */
public class MakeStarBox {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    }
}
