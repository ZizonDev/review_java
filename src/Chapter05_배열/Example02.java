package Chapter05_배열;
/*
    2023.08.25

    [문제]
    중복 없는 로또 번호 생성하기.
    1부터 45까지의 랜덤 정수 6개 추출.
 */
public class Example02 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        int randomNum, index = 0;
        boolean isExist = false;
        while (true) {
            randomNum = (int) (Math.random() * 45) + 1;
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == randomNum) isExist = true;
            }
            if (!isExist) lotto[index++] = randomNum;
            if (index == 6) break;
            isExist = false;
        }
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
