package Chapter07_CollectionFramework;

import java.util.*;

/*
    2023.08.31

    [문제]
    -정수 N을 입력받는다.
    -소문자로만 구성된 영단어 N개를 입력받는다.
    -단어 길이가 짧은 것부터 정렬한다.
    -단어의 길이가 같으면 사전 순으로 정렬한다.
    -중복 값은 제외한다.
 */
public class WordSortMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 N을 입력하세요 : ");
        int n = sc.nextInt();
        String[] word = new String[n];
        System.out.print("N개의 영단어를 입력하세요 : ");
        for (int i = 0; i < n; i++) {
            word[i] = sc.next();
        }
        HashSet<String> set = new HashSet<>(Arrays.asList(word));
        word = set.toArray(new String[0]);

        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1;
                else if (o1.length() == o2.length()) return o1.compareTo(o2);
                else return -1;
            }
        });
        System.out.print(Arrays.toString(word));
    }
}
