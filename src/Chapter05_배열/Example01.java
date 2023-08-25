package Chapter05_배열;
/*
    2023.08.25

    [문제]
    2차원 배열을 활용하여 성적을 보여주는 프로그램 만들기.

    [출력]
    각 학생의 총 점수와 평균 점수를 구하고,
    배열 {학번, 총점수, 평균 점수} 이용하여
    5 * 3 형태의 2차원 배열로 출력하기.
 */
public class Example01 {
    public static void main(String[] args) {
        double[] avgScore = {0, 0, 0, 0, 0};
        int[][] array = {
                {1, 95, 100, 88, 0},
                {2, 87, 50, 70, 0},
                {3, 60, 45, 99, 0},
                {4, 100, 77, 20, 0},
                {5, 55, 70, 63, 0}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < 4; j++) {
                array[i][4] += array[i][j];
            }
            avgScore[i] = (double)array[i][4] / 3;
            System.out.printf("%d, %d, %.2f\n", array[i][0], array[i][4], avgScore[i]);
        }
    }
}

