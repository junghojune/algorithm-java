package programmers.LV1.완주하지못한선수;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {

    // 1중 loop/sort 사용하기
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];
    }

    // hash 사용하기
    public static String solution1(String[] participant, String[] completion){
        HashMap<String, Integer> hm = new HashMap<>();
        String answer = "";
        for(String player : participant){
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for(String player : completion){
            hm.put(player, hm.getOrDefault(player, 0) + 1);
        }

        for(String key : hm.keySet()){
            if(hm.get(key)%2 != 0){
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"marina", "josipa", "nikola", "filipa"};

        String answer = solution(participant, completion);
        String answer1 = solution1(participant, completion);
        System.out.println(answer);
        System.out.println(answer1);
    }
}
