package programmers.kakao.LV1.실패율;

import java.util.*;

public class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];


        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        HashMap<Integer, Double> failPercent = new HashMap<Integer, Double>();

        for (int key : stages) {
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }

        int allPlayers = stages.length;
        int nowStage = 1;

        while (nowStage <= N + 1) {
            for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                if (e.getKey() == nowStage) {
                    failPercent.put(nowStage, e.getValue() / Double.valueOf(allPlayers));
                    allPlayers -= e.getValue();
                    break;
                }
            }
            nowStage++;
        }

        for (int i = 1; i <= N; i++) {
            failPercent.put(i, failPercent.getOrDefault(i, 0.0));
        }

        failPercent.remove(N + 1);

        List<Integer> ketSetList = new ArrayList<Integer>(failPercent.keySet());
        Collections.sort(ketSetList, (o1, o2) ->
                (failPercent.get(o2).compareTo(failPercent.get(o1))));

        answer = ketSetList.stream().mapToInt(i -> i).toArray();

        return answer;
    }


    public static void main(String[] args) {
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(solution(5, stages));
    }
}
