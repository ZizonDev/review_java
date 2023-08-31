package Chapter07_CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddMain {
    public static void main(String[] args) {
        EvenOdd evenOrOdd = new EvenOdd();
        evenOrOdd.Input();
        evenOrOdd.Sort();
        evenOrOdd.Output();
    }
}
class EvenOdd {
    int[] nums = new int[7];
    int[] even = new int[7];
    int[] odd = new int[7];
    int evenIndex = 0;
    int oddIndex = 0;
    public void Input() {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
    }
    public void Sort() {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) even[evenIndex++] = nums[i];
            else odd[oddIndex++] = nums[i];
            if(i == 7) break;
        }
    }
    public void Output() {
        System.out.println("홀수 : ");
        for(int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");
        System.out.println();
        System.out.println("짝수 : ");
        for(int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
    }
}