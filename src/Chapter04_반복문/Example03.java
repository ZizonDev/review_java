package Chapter04_반복문;
/*
    2023.08.23

    [문제]
    1부터 45까지의 정수 중 중복을 제외한 6개 정수 랜덤 추출하기. (로또 번호 자동 생성하기.)
 */
public class Example03 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int val;
        int index = 0;
        boolean isExist = false;
        while (true) {
            val = (int) (Math.random() * 45) + 1;
            for (int i = 0; i < lotto.length; i++) {
                if (val == lotto[i]) isExist = true;
            }
            if (!isExist) lotto[index++] = val;
            if (index == lotto.length) break;
            isExist = false;
        }
            for(int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");
            }
            System.out.println(" ");
    }
}
