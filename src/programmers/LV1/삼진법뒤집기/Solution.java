package programmers.LV1.삼진법뒤집기;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public int solution(int n) {

        int answer = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();

        while (n != 0) {
            array.add(n % 3);
            n = n / 3;
        }

        Collections.reverse(array);

        for (int i = 0; i < array.size(); i++) {
            answer += array.get(i) * Math.pow(3 , (array.size() - 1 - i));
        }


        return answer;

    }


    public static void main(String[] args) {
        int n = 45;
        int answer = 0;

        ArrayList<Integer> array = new ArrayList<Integer>();

        while (n != 0) {
            array.add(n % 3);
            n = n / 3;
        }


        System.out.println(array);

        for (int i = 0; i < array.size(); i++) {
            answer += array.get(i) * Math.pow(3 , (array.size() - 1 - i));
        }

        System.out.println(answer);
    }
}
