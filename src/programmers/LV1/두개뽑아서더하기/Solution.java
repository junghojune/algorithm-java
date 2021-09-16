package programmers.LV1.두개뽑아서더하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private static int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<numbers.length; i++){
            for(int j = i+1; j<numbers.length; j++){
                int num = numbers[i] + numbers[j];
                if(!list.contains(num)){
                    list.add(num);
                }
            }
        }
        int[] answer = new int[list.size()];

        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};
        int[] answer = solution(numbers);

        for(int num : answer){
            System.out.println(num);
        }
    }
}
