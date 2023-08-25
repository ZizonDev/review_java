package Chapter05_배열;
/*
    2023.08.25

    [2차원 배열]
    2행 3열 크기의 행렬을 만들어보자. (1,1) 자리에 정수 10부터 출발한다. 정수는 두 배가 된다.
 */
public class MultiDimensionalSort {
    public static void main(String[] args) {
        int[][] array = new int[2][3];
        int k = 10;
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k *= 2;
            }
        }
        for(int[] val : array) {
            for(int e : val) {
                System.out.printf("%4d", e);
            }
            System.out.println();
        }
    }
}
