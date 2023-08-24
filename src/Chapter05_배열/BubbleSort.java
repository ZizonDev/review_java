package Chapter05_배열;
/*
    2023.08.24

    [버블 정렬]
    1. 앞에서부터 현재 원소와 바로 다음의 원소의 크기를 비교한다.
    2. 다음 원소가 현재 원소보다 작으면 자리를 바꾼다.
    3. 다음 원소로 이동하여 그 다음 원소와 크기를 비교한다.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 7, 8, 4, 10, 1, 6, 2, 5, 9};
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
        for (int e : array) System.out.print(e + " ");
    }
}
